package audTests;

import org.junit.Test;

import audHelpers.Element;
import audPages.UserAudAud;
import audPages.UserAudPred;

public class TestRecPass extends TestBase{
	UserAudPred Pred1 = UserAudPred.readLast();
	UserAudAud Aud1 = UserAudAud.readLast();
	
	@Test
	public void rec_pass_pred() throws Exception {
		Element.sl(2);	
		app.landPred.open().btnVhod.click();
		app.landPred.lnkRecPass.click();
		app.landPred.fldRecPass.sendKeys(Pred1.email);
		app.landPred.btnRecPass.click();
		Element.sl(2);
		app.mail.setMail(Pred1.semiEmail);
		app.mail.recPass(Pred1);
		Element.sl(3);
		app.cabPred.open().btnExit.click();
	}
	
	@Test
	public void rec_pass_aud() throws Exception {
		Element.sl(2);	
		app.landAud.open().btnVhod.click();
		app.landAud.lnkRecPass.click();
		app.landAud.fldRecPass.sendKeys(Aud1.email);
		app.landAud.btnRecPass.click();
		Element.sl(2);
		app.mail.setMail(Aud1.semiEmail);
		app.mail.recPass(Aud1);
		Element.sl(3);
		app.list.open().btnExit.click();
	}
	
	
}
