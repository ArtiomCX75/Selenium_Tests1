package audTests;
import org.junit.Test;

import audHelpers.Element;
import audPages.UserAudAud;
public class TestRegAud extends TestBase{
	
		@Test
		public void regAud() throws Exception{
			String date = Element.what_date("post");
			UserAudAud Aud1 = new UserAudAud();
			Aud1.setDefault();
			Aud1.middleName=Aud1.middleName+date;
			Aud1.email = app.mail.setMail("aud" + date);
			app.audHelper.reg_aud(Aud1, "aud" + date);
		}	
}


