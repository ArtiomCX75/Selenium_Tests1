package audTests;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import audPages.AudCabPred;
import audPages.AudLandAud;
import audPages.AudLandPred;
import audPages.UserAudPred;
import browser.Browser;
import browser.Constants;

public class TestAuthPred extends Browser {

	FileInputStream fis;
	ObjectInputStream oin;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		wdr1=Browser.on();
	}
	
	@After
	public void after() {
		wdr1.quit();
	}

	@Test
	public void authorization() throws Exception {
		String server = Constants.urlAudTest;
		UserAudPred Pred1 = new UserAudPred();
		FileInputStream fis = new FileInputStream("temp_pred.txt");
		ObjectInputStream oin = new ObjectInputStream(fis);
		Pred1 = (UserAudPred) oin.readObject();
		oin.close();
		System.out.println("email= " + Pred1.email);
		System.out.println("pass= " + Pred1.password);
		
		loginFromPredLand(wdr1, server, Pred1.email, Pred1.password);
		logout(wdr1, server);
		loginFromAudLand(wdr1, server, Pred1.email, Pred1.password);
		logout(wdr1, server);
	}
	
	public static void loginFromPredLand(WebDriver d, String server, String email, String pass) throws Exception {
		AudLandPred.url.gt(d, server);
		AudLandPred.btnVhod.click(d);
		AudLandPred.fldLogin.type(d, email);
		AudLandPred.fldPass.type(d, pass);
		AudLandPred.btnLoginSubmit.click(d);
		Browser.waitFor(d, server + AudCabPred.url.adres);

	}
	
	public static void loginFromAudLand(WebDriver d, String server, String email, String pass) throws Exception {
		AudLandAud.url.gt(d, server);
		AudLandAud.btnVhod.click(d);
		AudLandAud.fldLogin.type(d, email);
		AudLandAud.fldPass.type(d, pass);
		AudLandAud.btnLoginSubmit.click(d);
		Browser.waitFor(d, server + AudCabPred.url.adres);

	}

	public static void logout(WebDriver d, String server) throws Exception {
		if (!(wdr1.getCurrentUrl().equals(server + AudCabPred.url.adres))) {
			System.out.println("dflfdlfllffllf fl lfl fllfl f lfl fl fllflwww");
			AudCabPred.url.gt(d, server);
		}
		Browser.sl(0.5);
		AudCabPred.btnExit.click(d);
		Browser.waitFor(d, server + AudLandPred.url.adres);
	}

	public boolean isLogin(WebDriver d){
		try{
			if ((d.findElement(By.xpath(AudCabPred.btnExit.adres)).getText()).equals("Выйти")){
				System.out.println("выйти");
				return true;
				}
			else {
					return false;
				}
			}
		catch(Exception e) {return false;}
	}
	
	public boolean isLogout(WebDriver d){
		try{
			if ((d.findElement(By.xpath(AudLandPred.btnVhod.adres)).getText()).equals("Вoйти")){
					return true;
				}
			else {
					return false;
				}
			}
		catch(Exception e) {return false;}
	}
}
