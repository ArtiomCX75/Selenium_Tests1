package audTests;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import audPages.AudList;
import audPages.AudLandAud;
import audPages.AudLandPred;
import audPages.UserAudAud;
import browser.Browser;
import browser.Constants;

public class TestAuthAud extends Browser {

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
		UserAudAud Aud1 = new UserAudAud();
		FileInputStream fis = new FileInputStream("temp_aud.txt");
		ObjectInputStream oin = new ObjectInputStream(fis);
		Aud1 = (UserAudAud) oin.readObject();
		oin.close();
		System.out.println("login= " + Aud1.login);
		System.out.println("pass= " + Aud1.password);
		
		for (int i=0;i<10;i++){
		loginFromPredLand(wdr1, server, Aud1.login, Aud1.password);
		logout(wdr1, server);
		loginFromAudLand(wdr1, server, Aud1.login, Aud1.password);
		logout(wdr1, server);
		}
	}
	
	public static void loginFromPredLand(WebDriver d, String server, String email, String pass) throws Exception {
		AudLandPred.url.gt(d, server);
		AudLandPred.btnVhod.click(d);
		AudLandPred.fldLogin.type(d, email);
		AudLandPred.fldPass.type(d, pass);
		AudLandPred.btnLoginSubmit.click(d);
		Browser.waitFor(d, server + AudList.url.adres);

	}
	
	public static void loginFromAudLand(WebDriver d, String server, String email, String pass) throws Exception {
		AudLandAud.url.gt(d, server);
		AudLandAud.btnVhod.click(d);
		AudLandAud.fldLogin.type(d, email);
		AudLandAud.fldPass.type(d, pass);
		AudLandAud.btnLoginSubmit.click(d);
		Browser.waitFor(d, server + AudList.url.adres);

	}

	public static void logout(WebDriver d, String server) throws Exception {
		if (!(wdr1.getCurrentUrl().equals(server + AudList.url.adres))) {
			System.out.println("dflfdlfllffllf fl lfl fllfl f lfl fl fllflwww");
			AudList.url.gt(d, server);
		}
		Browser.sl(0.5);
		AudList.btnExit.click(d);
		Browser.waitFor(d, server + AudLandAud.url.adres);
	}

	public boolean isLogin(WebDriver d){
		try{
			if ((d.findElement(By.xpath(AudList.btnExit.adres)).getText()).equals("Выйти")){
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
			if ((d.findElement(By.xpath(AudLandAud.btnVhod.adres)).getText()).equals("Вoйти")){
					return true;
				}
			else {
					return false;
				}
			}
		catch(Exception e) {return false;}
	}
}
