package audTests;

import static org.junit.Assert.*;

import org.junit.Test;

import audHelpers.Constants;
import audHelpers.Element;
import audHelpers.Files;
import audPages.AudBid.Mark;
import audPages.UserAudAud;
import audPages.UserAudPred;

public class TestDeal extends TestBase {
UserAudPred Pred1 = UserAudPred.readLast();
UserAudAud Aud1 = UserAudAud.readLast();

	@Test
	public void makeDeal() throws Exception {
		app.landPred.open().btnVhodClick().login(Pred1).btnReloadStatus.click();
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusNaProverke));
		app.cabPred.btnExit.click();
		//Element.sl(5);
		app.landAud.open().btnVhodClick().login(Aud1);
		app.list.chooseBid(Pred1); //app.list.btnCurBid.click();
		app.audbid.dwnDownloadFile.sendKeys(Files.pdffile1);
		Element.sl(5);
		app.audbid.lnkAudZakl.click();
		app.audbid.makeZakl(Mark.notBad, "notbad1","notbad2");
		app.audbid.lnkAudRabDoc.click();
		app.audbid.checkAll();
		app.audbid.btnSendOrder.click();
		Element.sl(50);
		app.audbid.btnExit.click();
		
		app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.naDorabotku("aufull", Files.pdffile2);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusNaDorab));
		app.cabPred.btnExit.click();
						
		app.landAud.open().btnVhodClick().login(Aud1);
		//app.list.chooseBid(Pred1);
		app.list.btnCurBid.click();
		app.audbid.lnkAudZakl.click();
		app.audbid.makeZakl(Mark.good);
		app.audbid.btnSendOrder.click();
		Element.sl(50);
		app.audbid.btnExit.click();
		
		app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.btnAcceptWork.click();
		Element.sl(2);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusRabPrin));
		app.cabPred.fldPost.sendKeys("faa1192@gmail.com");
		app.cabPred.btnSendPost.click();
		Element.sl(2);
		app.cabPred.btnExit.click();
		Element.sl(2);
	}
}