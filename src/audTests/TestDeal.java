package audTests;

import org.junit.Test;
import audPages.UserAudAud;
import audPages.UserAudPred;
import browser.Browser;

public class TestDeal extends TestBase {
	
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
		Browser.sl(5);
		app.landAud.open().btnVhodClick().login(Aud1);
		Browser.sl(5);
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
