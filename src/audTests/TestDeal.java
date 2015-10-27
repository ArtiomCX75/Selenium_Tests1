package audTests;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.jetty.html.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import audPages.AudBid;
import audPages.UserAudAud;
import audPages.UserAudPred;
import browser.Browser;
import browser.Constants;
import browser.Files;

public class TestDeal extends Browser {
	FileInputStream fis;
	ObjectInputStream oin;
	static String server=Constants.urlAudTest;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		wdr1=Browser.on();
		wdr2=Browser.on();
		wdr2.manage().window().setPosition(new Point(2000, 0));
		wdr2.manage().window().maximize();	
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		wdr1.quit();
		wdr2.quit();
	}
	
	@Test
	public void makeDeal() throws Exception {
		/*TestRegAud.reg_aud();
		TestAuthAud.logout(wdr1, server);
		TestRegPred.reg_pred();
		TestAuthPred.logout(wdr1, server);*/
				
		System.out.println("test begiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin");
		UserAudPred Pred1 = new UserAudPred();
		fis = new FileInputStream("temp_pred.txt");
		ObjectInputStream oin = new ObjectInputStream(fis);
		Pred1 = (UserAudPred) oin.readObject();
		oin.close();
		System.out.println("email= " + Pred1.email);
		System.out.println("pass= " + Pred1.password);
		TestAuthPred.loginFromPredLand(wdr1, server, Pred1.email, Pred1.password);
		
		UserAudAud Aud1 = new UserAudAud();
		fis = new FileInputStream("temp_aud.txt");
		oin = new ObjectInputStream(fis);
		Aud1 = (UserAudAud) oin.readObject();
		oin.close();
		System.out.println("login= " + Aud1.login);
		System.out.println("pass= " + Aud1.password);
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
	
	}
}
