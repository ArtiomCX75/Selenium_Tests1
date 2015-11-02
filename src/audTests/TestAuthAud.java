package audTests;

import org.junit.Test;
import audPages.UserAudAud;
import browser.Browser;

public class TestAuthAud extends TestBase {
	
	UserAudAud Aud1 = UserAudAud.readLast();

	@Test
	public void authorization_from_audland() {
		Browser.sl(2);
		app.landAud.open().btnVhodClick().login(Aud1);
		Browser.sl(1);
		app.audbid.btnExit.click();	
	}
		
	@Test
	public void authorization_from_predland()  {
		Browser.sl(2);
		app.landPred.open().btnVhodClick().login(Aud1);
		Browser.sl(1);
		app.audbid.btnExit.click();
	}
}
