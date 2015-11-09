package audTests;

import org.junit.Test;

import audHelpers.Element;
import audPages.UserAudPred;


public class TestAuthPred extends TestBase {
	UserAudPred Pred1 = UserAudPred.readLast();

	@Test
	public void authorization_from_predland() throws Exception {
		Element.sl(2);	
		app.landPred.open().btnVhodClick().login(Pred1);
		Element.sl(2);
		app.cabPred.btnExit.click();
	}
	
	@Test
	public void authorization_from_audland()  {
		app.landAud.open();
		Element.sl(2);
		app.landAud.btnVhodClick().login(Pred1);
		Element.sl(2);
		app.cabPred.btnExit.click();
	}	
}
