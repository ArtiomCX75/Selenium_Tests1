package audTests;

import org.junit.Test;

import audHelpers.Element;
import audPages.UserAudAud;


public class TestAuthAud extends TestBase {
	
	UserAudAud Aud1 = UserAudAud.readLast();

	@Test
	public void authorization_from_audland() {
		Element.sl(2);
		app.landAud.open().btnVhodClick().login(Aud1);
		Element.sl(1);
		app.audbid.btnExit.click();	
	}
		
	@Test
	public void authorization_from_predland()  {
		Element.sl(2);
		app.landPred.open().btnVhodClick().login(Aud1);
		Element.sl(1);
		app.audbid.btnExit.click();
	}
}
