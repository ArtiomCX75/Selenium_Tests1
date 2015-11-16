package audTests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import audHelpers.Constants;
import audHelpers.Element;
import audHelpers.Files;
import audHelpers.UserAudAud;
import audHelpers.UserAudPred;
import audPages.AudBid.Mark;

public class TestDeal extends TestBase {
	public UserAudPred Pred1;
	public UserAudAud Aud1;

	@Test
	public void makeDeal() throws Exception {
		whatToDo();
		app.landPred.open().btnVhodClick().login(Pred1).btnReloadStatus.click();
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusNaProverke));
		app.cabPred.btnExit.click();
		app.landAud.open().btnVhodClick().login(Aud1);
		app.list.chooseBid(Pred1).downloadOrder().makeZakl(Mark.notBad,"notbad1","notbad2").checkAll().btnSendOrder.click();
		Element.sl(60);
		app.audbid.btnExit.click();
		app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.naDorabotku("aufull", Files.pdffile2);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusNaDorab));
		app.cabPred.btnExit.click();
		app.landAud.open().btnVhodClick().login(Aud1).chooseCurrent().makeZakl(Mark.good).btnSendOrder.click();
		Element.sl(60);
		app.audbid.btnExit.click();
		app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.btnAcceptWork.click();
		Element.sl(2);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusRabPrin));
		app.cabPred.fldPost.sendKeys("faa1192@gmail.com");
		app.cabPred.btnSendPost.click();
		app.cabPred.btnExit.click();
		Element.t=2.0;
	}

	private void whatToDo() throws Exception {
		Pred1 = UserAudPred.readLast();
		Aud1 = UserAudAud.readLast();
		app.landAud.open().btnVhodClick().login(Aud1);
		Element.sl(2);
		Boolean isCurrentPresentDisplayed = app.Driver.findElement(By.xpath(".//h5[contains(text(), 'Принята вами')]"))
				.isDisplayed();
		String s1 = ".//div[3]/ul[./li/div/div/p[contains(text(),'";
		String s2 = Pred1.contactName;
		String s3 = "')]]/li/div/div[2]/button";
		Boolean isBidAvailableEmpty = app.Driver.findElements(By.xpath(s1 + s2 + s3)).isEmpty();
		app.audbid.btnExit.click();

		if (isCurrentPresentDisplayed == true) {
			System.out.println("Есть активная заявка. Регистрируем нового аудитора");
			UserAudAud user = new UserAudAud();
			user.email = app.mail.setMail(user.semiEmail);
			app.audHelper.reg_aud(user);
			this.whatToDo();
			return;
		} else {
			System.out.println("Нет активной заявки");
		}
		if (isBidAvailableEmpty == true) {
			System.out.println("Не доступна заявка. Проверяю ее статус у предпринимателя");
			app.landPred.open().btnVhodClick().login(Pred1);
			if (app.cabPred.verifyStatus(Constants.statusRabPrin) == false) {
				System.out.println("Есть текущая заявка. Регистрируем нового предпринимателя");
				app.cabPred.btnExit.click();
				Element.sl(2);
				UserAudPred user = new UserAudPred();
				user.email = app.mail.setMail(user.semiEmail);
				app.audHelper.reg_pred(user);
				this.whatToDo();
				return;
			} else if (app.cabPred.verifyStatus(Constants.statusRabPrin) == true){
				System.out.println("Нет текущей заявки. Создаем новую");
				app.audHelper.create_bid(Pred1).btnVhodClick().login(Pred1);
				assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusNaProverke));
				Element.sl(2);
				app.cabPred.btnExit.click();
				this.whatToDo();
				return;
			}
		} else {
			System.out.println("Заявка доступна");
		}
	}
}

/*
 * login(aud1) bool1=isCurrentPresent .//a[contains(text(), 'Заявка в работе')]
 * bool2=isBidAvailable(Pred1)
 * 
 * String s1 = ".//div[3]/ul[./li/div/div/p[contains(text(),'"; String s2 =
 * user.contactName; String s3 = "')]]/li/div/div[2]/button";
 * wd.findElements(by.xpath(s1+s2+s3)).isEmpty()
 * 
 * if bool1==true {reg_aud()} if bool2==false { make_new bid; is status!=done {
 * reg_pred } Pred1 = UserAudPred.readLast(); Aud1 = UserAudAud.readLast();
 * this.makeDeal()
 */

/*
 * функция, которая на входе принимает заявку (Пред1), архив с документами(?),
 * файл с отчетом(?) оценку, комментарии ф-ция проваливается в текущую, если
 * совпадает. берет эту заявку, если нет текущей, и проваливается. чекает только
 * то, что не чекнуто
 */
