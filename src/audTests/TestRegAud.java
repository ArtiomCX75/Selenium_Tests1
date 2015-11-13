package audTests;
import org.junit.Test;

import audHelpers.UserAudAud;
public class TestRegAud extends TestBase{	
	@Test
	public void regAud() throws Exception{
		UserAudAud Aud1 = new UserAudAud();
		Aud1.email = app.mail.setMail(Aud1.semiEmail);
		app.audHelper.reg_aud(Aud1);
	}	
}


