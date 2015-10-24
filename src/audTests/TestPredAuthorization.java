package audTests;

import static org.junit.Assert.assertFalse;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import audPages.AudCabPred;
import audPages.AudLandAud;
import audPages.AudLandPred;
import audPages.UserAudPred;
import browser.Browser;
import browser.Constants;

public class TestPredAuthorization extends Browser {

	FileInputStream fis;
	ObjectInputStream oin;
	// static WebDriver d;

	@After
	public void after() {
		wdr1.quit();
	}

	@Test
	public void authorization() throws Exception {
		wdr1 = Browser.on();
		String server = Constants.urlAudTest;
		UserAudPred Pred1 = new UserAudPred();
		FileInputStream fis = new FileInputStream("temp_pred.txt");
		ObjectInputStream oin = new ObjectInputStream(fis);
		Pred1 = (UserAudPred) oin.readObject();
		oin.close();
		System.out.println("email= " + Pred1.email);
		System.out.println("pass= " + Pred1.password);

		loginFromAudLand(wdr1, server, Pred1.email, Pred1.password);
		System.out.println("next");
		logout(wdr1, server);
	}

	public void loginFromPredLand(WebDriver d, String server, String email, String pass) throws Exception {
		AudLandPred.url.gt(d, server);
		AudLandPred.btnVhod.click(d);
		AudLandPred.fldLogin.type(d, email);
		AudLandPred.fldPass.type(d, pass);
		AudLandPred.btnLoginSubmit.click(d);
		try {
			String val = d.findElement(By.xpath("html/body/div[4]/table/tbody/tr/td/div/div/form[1]/p")).getText();
			if (val.equals("Неверный логин или пароль")) {
				System.err.println("Неверный логин или пароль");
				assertFalse("Неверный логин или пароль", true);
			}
		} catch (NoSuchElementException e) {
		}
		Browser.waitFor(d, server + AudCabPred.url.adres);
		String s = d.findElement(By.xpath("html/body/div[1]/div/ng-view/div/div/div[2]/div[4]/strong")).getText();
		if (!(s.equals(email))) {
			System.err.println("Некорректно авторизовался");
			assertFalse("Некорректно авторизовался", true);
		}
	}

	public void loginFromAudLand(WebDriver d, String server, String email, String pass) throws Exception {
		AudLandAud.url.gt(d, server);
		AudLandAud.btnVhod.click(d);
		AudLandAud.fldLogin.type(d, email);
		AudLandAud.fldPass.type(d, pass);
		AudLandAud.btnLoginSubmit.click(d);
		try {
			String val = d.findElement(By.xpath("html/body/div[4]/table/tbody/tr/td/div/div/form[1]/p")).getText();
			if (val.equals("Неверный логин или пароль")) {
				System.err.println("Неверный логин или пароль");
				assertFalse("Неверный логин или пароль", true);
			}
		} catch (NoSuchElementException e) {
		}
		Browser.waitFor(d, server + AudCabPred.url.adres);
		String s=null;
		s = d.findElement(By.xpath("html/body/div[1]/div/ng-view/div/div/div[2]/div[4]/strong")).getText();
		if (!(s.equals(email))) {
			System.err.println("Некорректно авторизовался");
			assertFalse("Некорректно авторизовался", true);
		}
	}

	public void logout(WebDriver d, String server) throws Exception{
		AudCabPred.url.gt(d, server);
		AudCabPred.btnExit.click(d);
		Browser.waitFor(d, server + AudLandPred.url.adres);
	}
}
