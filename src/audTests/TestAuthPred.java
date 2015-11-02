package audTests;

import org.junit.Test;
import audPages.UserAudPred;
import browser.Browser;

public class TestAuthPred extends TestBase {
	UserAudPred Pred1 = UserAudPred.readLast();

	@Test
	public void authorization_from_predland() throws Exception {
		Browser.sl(2);	
		app.landPred.open().btnVhodClick().login(Pred1);
		Browser.sl(1);;
		app.cabPred.btnExit.click();
	}
	
	@Test
	public void authorization_from_audland()  {
		app.landAud.open();
		Browser.sl(1);
		app.landAud.btnVhodClick().login(Pred1);
		Browser.sl(1);
		app.cabPred.btnExit.click();
	}	
}
