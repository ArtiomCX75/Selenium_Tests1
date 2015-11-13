package audTests;
import org.junit.Test;

import audHelpers.UserAudPred;
public class TestRegPred extends TestBase {
	@Test
	public void regPred() throws Exception {
		UserAudPred Pred1 = new UserAudPred();
		Pred1.email = app.mail.setMail(Pred1.semiEmail);
		app.audHelper.reg_pred(Pred1);
	}
}