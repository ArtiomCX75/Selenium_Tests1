package audTests;

import org.junit.Test;

import audHelpers.Element;
import audPages.UserAudAud;
import audPages.UserAudPred;


public class TestAuth extends TestBase {
	UserAudPred Pred1 = UserAudPred.readLast();
	UserAudAud Aud1= UserAudAud.readLast();

	@Test
	public void auth_pred() throws Exception {
		Element.sl(2);	
		app.landPred.open().btnVhodClick().login(Pred1);
		Element.sl(2);
		app.cabPred.btnExit.click();
	}
	
	@Test
	public void auth_aud() {
		Element.sl(2);
		app.landAud.open().btnVhodClick().login(Aud1);
		Element.sl(2);
		app.audbid.btnExit.click();	
	}
}
