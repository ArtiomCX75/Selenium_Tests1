package audTests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import audHelpers.Constants;
import audHelpers.Element;
import audHelpers.UserAudAud;
import audHelpers.UserAudPred;
import audPages.AudBid.Mark;

public class TestDeal extends TestBase {
	public UserAudPred Pred1 = UserAudPred.readLast();
	public UserAudAud Aud1 = UserAudAud.readLast();

	@Test
	public void makeDeal() throws Exception {
		System.out.println("START1");
		Pred1 = UserAudPred.readLast();
		Aud1 = UserAudAud.readLast();
		whatToDo();
		System.out.println("START2");
		app.landPred.open().btnVhodClick().login(Pred1).btnReloadStatus.click();
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusNaProverke));
		app.cabPred.btnExit.click();

		app.landAud.open().btnVhodClick().login(Aud1);

		app.list.chooseBid(Pred1).downloadOrder().makeZakl(Mark.notBad, "notbad1", "notbad2").checkAll().btnSendOrder
				.click();
		Element.sl(55);
		app.audbid.btnExit.click();
		/*app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.naDorabotku("aufull", Files.pdffile2);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusNaDorab));
		app.cabPred.btnExit.click();
		app.landAud.open().btnVhodClick().login(Aud1).chooseCurrent().makeZakl(Mark.good).btnSendOrder.click();
		Element.sl(55);
		app.audbid.btnExit.click();
		*/
		app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.btnAcceptWork.click();
		Element.sl(2);
		assertTrue("������������ ������", app.cabPred.verifyStatus(Constants.statusRabPrin));
		app.cabPred.fldPost.sendKeys("faa1192@gmail.com");
		app.cabPred.btnSendPost.click();
		app.cabPred.btnExit.click();
	}

	private void whatToDo() throws Exception {
		app.landAud.open().btnVhodClick().login(Aud1);
		Element.sl(2);
		Boolean isCurrentPresentEmpty = app.Driver.findElements(By.xpath(".//a[contains(text(), '������ � ������')]"))
				.isEmpty();
		String s1 = ".//div[3]/ul[./li/div/div/p[contains(text(),'";
		String s2 = Pred1.contactName;
		String s3 = "')]]/li/div/div[2]/button";
		Boolean isBidAvailableEmpty = app.Driver.findElements(By.xpath(s1 + s2 + s3)).isEmpty();
		app.audbid.btnExit.click();

		if (isCurrentPresentEmpty == true) {
			System.out.println("���� �������� ������. ������������ ������ ��������");
			UserAudAud user = new UserAudAud();
			user.email = app.mail.setMail(user.semiEmail);
			app.audHelper.reg_aud(user);
			this.makeDeal();
			return;
		} else {
			System.out.println("��� �������� ������");
		}
		if (isBidAvailableEmpty == true) {
			System.out.println("�� �������� ������. �������� �� ������ � ����");
			app.landPred.open().btnVhodClick().login(Pred1);
			if (app.cabPred.verifyStatus(Constants.statusRabPrin) == false) {
				System.out.println("���� ������� ������. ������������ ������ ���������������");
				app.cabPred.btnExit.click();
				Element.sl(2);
				UserAudPred user = new UserAudPred();
				user.email = app.mail.setMail(user.semiEmail);
				app.audHelper.reg_pred(user);
				this.makeDeal();
				return;
			} else {
				System.out.println("���� �� ������� ����� ������");
				// make_new bid;
				assertTrue("need to do", false);
			}
		}
		else {
			System.out.println("������ ��������");
		}
	}
}

/*
 * login(aud1) bool1=isCurrentPresent .//a[contains(text(), '������ � ������')]
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
 * �������, ������� �� ����� ��������� ������ (����1), ����� � �����������(?),
 * ���� � �������(?) ������, ����������� �-��� ������������� � �������, ����
 * ���������. ����� ��� ������, ���� ��� �������, � �������������. ������ ������
 * ��, ��� �� �������
 */
