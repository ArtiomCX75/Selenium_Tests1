package audTests;

import org.junit.Test;
import audPages.UserAudPred;

public class TestAuthPred extends TestBase {





	@Test
	public void authorization() throws Exception {
		
		UserAudPred Pred1 = UserAudPred.readLast();	
		app.landPred.open().btnVhodClick().login(Pred1);
		app.cabPred.btnExit.click();
		//app.landPred.btnVhodClick().login(Pred1);
		
		
		/*
		
		loginFromPredLand(Browser.wdr1, server, Pred1.email, Pred1.password);
		logout(Browser.wdr1, server);
		loginFromAudLand(Browser.wdr1, server, Pred1.email, Pred1.password);
		logout(Browser.wdr1, server);
		*/
	}
	/*
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
		if (!(Browser.wdr1.getCurrentUrl().equals(server + AudCabPred.url.adres))) {
			System.out.println("dflfdlfllffllf fl lfl fllfl f lfl fl fllflwww");
			AudCabPred.url.gt(d, server);
		}
		Browser.sl(0.5);
		AudCabPred.btnExit.click(d);
		Browser.waitFor(d, server + AudLandPred.url.adres);
	}

	public boolean isLogin(WebDriver d){
		try{
			if ((d.findElement(By.xpath(AudCabPred.btnExit.adres)).getText()).equals("�����")){
				System.out.println("�����");
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
			if ((d.findElement(By.xpath(AudLandPred.btnVhod.adres)).getText()).equals("�o���")){
					return true;
				}
			else {
					return false;
				}
			}
		catch(Exception e) {return false;}
	}
*/
}
