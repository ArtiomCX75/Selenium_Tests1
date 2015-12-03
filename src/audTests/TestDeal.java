package audTests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import audHelpers.Constants;
import audHelpers.Element;
import audHelpers.Files;
import audHelpers.UserAud;
import audHelpers.UserPred;
import audPages.AudBid.Mark;

public class TestDeal extends TestBase {
	public UserPred Pred1;
	public UserAud Aud1;

	@Test
	public void makeDeal() throws Exception {
		whatToDo();
		app.landPred.open().btnVhodClick().login(Pred1).btnReloadStatus.click();
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusNaProverke));
		app.cabPred.btnExit.click();
		app.landAud.open().btnVhodClick().login(Aud1);
		app.list.chooseBid(Pred1).downloadOrder().makeZakl(Mark.notBad,"notbad1","notbad2").checkAll().btnSendOrder.click();
		Element.sl(40);
		app.audbid.btnExit.click();
		System.out.println(Pred1.orderNumber);
		app.admin.open().login().ordOpen().chooseAndAccept(Pred1).btnExit.click();
		app.landPred.open().btnVhodClick().login(Pred1);
		Element.sl(1);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.naDorabotku("aufull", Files.pdffile2);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusNaDorab));
		app.cabPred.btnExit.click();
		app.landAud.open().btnVhodClick().login(Aud1).chooseCurrent().makeZakl(Mark.notBad).btnSendOrder.click();
		Element.sl(40);
		app.audbid.btnExit.click();
		app.admin.open().login().ordOpen().chooseAndAccept(Pred1).btnExit.click();
		app.landPred.open().btnVhodClick().login(Pred1);
		Element.sl(1);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.btnAcceptWork.click();
		Element.sl(2);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusRabPrin));
		app.cabPred.fldPost.sendKeys("faa1192@gmail.com");
		app.cabPred.btnSendPost.click();
		app.cabPred.btnExit.click();
		Element.t=2.0;
	}

	private void whatToDo() throws Exception {
		Pred1 = UserPred.readLast();
		Aud1 = UserAud.readLast();
		app.landAud.open().btnVhodClick().login(Aud1);
		Element.sl(2);
		Boolean isCurrentPresentDisplayed;
		try{
		isCurrentPresentDisplayed = app.Driver.findElement(By.xpath(".//h5[contains(text(), '������� ����')]"))
				.isDisplayed();}
		catch(NoSuchElementException e){
			isCurrentPresentDisplayed=false;		}
		String s1 = ".//div[3]/ul[./li/div/div/p[contains(text(),'";
		String s2 = Pred1.contactName;
		String s3 = "')]]/li/div/div[2]/button";
		Boolean isBidAvailableEmpty = app.Driver.findElements(By.xpath(s1 + s2 + s3)).isEmpty();
		app.audbid.btnExit.click();

		if (isCurrentPresentDisplayed == true) {
			System.out.println("���� �������� ������. ������������ ������ ��������");
			UserAud user = new UserAud();
			user.email = app.mail.setMail(user.semiEmail);
			app.audHelper.reg_aud(user);
			this.whatToDo();
			return;
		} else {
			System.out.println("��� �������� ������");
		}
		if (isBidAvailableEmpty == true) {
			System.out.println("�� �������� ������. �������� �� ������ � ���������������");
			app.landPred.open().btnVhodClick().login(Pred1);
			if (app.cabPred.verifyStatus(Constants.statusRabPrin) == false) {
				System.out.println("���� ������� ������. ������������ ������ ���������������");
				Element.sl(2);
				app.cabPred.btnExit.click();
				Element.sl(2);
				UserPred user = new UserPred();
				user.email = app.mail.setMail(user.semiEmail);
				app.audHelper.reg_pred(user);
				this.whatToDo();
				return;
			} else if (app.cabPred.verifyStatus(Constants.statusRabPrin) == true){
				System.out.println("��� ������� ������. ������� �����");
				app.audHelper.create_bid(Pred1).btnVhodClick().login(Pred1);
				assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusNaProverke));
				Element.sl(2);
				app.cabPred.btnExit.click();
				this.whatToDo();
				return;
			}
		} else {
			System.out.println("������ ��������");
		}
	}
}

