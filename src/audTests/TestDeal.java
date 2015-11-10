package audTests;

import static org.junit.Assert.*;

import org.junit.Test;

import audHelpers.Element;
import audHelpers.Files;
import audPages.UserAudAud;
import audPages.UserAudPred;

public class TestDeal extends TestBase {
	
	private String status;

	@Test
	public void makeDeal() throws Exception {
		UserAudPred Pred1 = new UserAudPred();
		UserAudAud Aud1 = new UserAudAud();
		Pred1=UserAudPred.readLast();
		Aud1=UserAudAud.readLast();
		System.out.println("A login= " + Aud1.login);
		System.out.println("A pass= " + Aud1.password);
		
		System.out.println("\nP login= " + Pred1.email);
		System.out.println("P pass= " + Pred1.password);
		
		app.landPred.open().btnVhodClick().login(Pred1);
		Element.sl(2);
		app.cabPred.btnReloadStatus.click();
		Element.sl(2);
		status = app.cabPred.getStatus();
		System.out.println(status);
		assertTrue("Некорректный статус", status.equals("На проверке"));
		app.cabPred.btnExit.click();
		Element.sl(5);
		
		app.landAud.open().btnVhodClick().login(Aud1);
		Element.sl(5);
		app.list.chooseBid(Pred1);
		//app.list.btnCurBid.click();
		app.audbid.dwnDownloadFile.sendKeys(Files.pdffile1);
		Element.sl(5);
		app.audbid.lnkAudZakl.click();
		app.audbid.chkVeryGood.click();
		app.audbid.lnkAudRabDoc.click();
		double i=Element.t;
		Element.t=0.09;		
		app.audbid.checkAll();
		Element.t=i;
		app.audbid.btnSendOrder.click();
		Element.sl(38);
		app.audbid.btnExit.click();
		
		app.landPred.open().btnVhodClick().login(Pred1);
		Element.sl(3);
		app.cabPred.open();
		Element.sl(3);
	//	app.cabPred.btnReloadStatus.click();
		app.cabPred.open();
		status = app.cabPred.getStatus();
		System.out.println(status);
		assertTrue("Некорректный статус", status.equals("Выполнено"));
		app.cabPred.btnReWork1.click();
		app.cabPred.dwnFile.sendKeys(Files.pdffile2);
		Element.sl(10);
		app.cabPred.fldReWork.sendKeys("aufull");
		Element.sl(2);
		app.cabPred.btnReWork2.click();
		Element.sl(1);
		status = app.cabPred.getStatus();
		System.out.println(status);
		assertTrue("Некорректный статус", status.equals("На доработке"));
		app.cabPred.btnExit.click();
		
				
		app.landAud.open().btnVhodClick().login(Aud1);
		Element.sl(5);
		//app.list.chooseBid(Pred1);
		app.list.btnCurBid.click();
		app.audbid.lnkAudZakl.click();
		app.audbid.chkVeryGood.click();
		
		app.audbid.btnSendOrder.click();
		Element.sl(38);
		app.audbid.btnExit.click();
		app.landPred.open().btnVhodClick().login(Pred1);
		Element.sl(5);
		app.cabPred.open();
		Element.sl(2);
		app.cabPred.open();
		status = app.cabPred.getStatus();
		System.out.println(status);
		assertTrue("Некорректный статус", status.equals("Выполнено"));
		app.cabPred.btnAcceptWork.click();
		Element.sl(2);
		status = app.cabPred.getStatus();
		System.out.println(status);
		assertTrue("Некорректный статус", status.equals("Работа принята"));
		app.cabPred.fldPost.sendKeys("faa1192@gmail.com");
		app.cabPred.btnSendPost.click();
		Element.sl(2);
		app.cabPred.btnExit.click();
		Element.sl(2);
		/*
		TestAuthAud.loginFromPredLand(wdr2, server, Aud1.login, Aud1.password);
		System.out.println(Pred1.contactName);
		Browser.sl(3);
		String s="html/body/div[1]/div/ng-view/div/div/div/div[3]/ul/li[div/div/p[1][text()='Контактное лицо: "+Pred1.contactName+"']]/div/div[2]/button";
		wdr2.findElement(By.xpath(s)).click();
		//AudBid.url.gt(wdr2, server);
		Browser.sl(1);
		AudBid.dwnDownloadFile.load(wdr2, Files.pdffile1);
		AudBid.lnkAudRabDoc.click(wdr2);
		Browser.sl(1);
		AudBid.lnkAudZakl.click(wdr2);
		Browser.sl(1);
		AudBid.chkVeryGood.click(wdr2);
		System.out.println("END");
		Browser.sl(1);
	*/
	}
}
