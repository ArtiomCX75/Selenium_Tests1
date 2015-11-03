package audTests;
import org.junit.Test;
import audPages.UserAudAud;
import browser.Browser;
public class TestRegAud extends TestBase{
	
		@Test
		public void regAud() throws Exception{
			String date = Browser.what_date("post");
			UserAudAud Aud1 = new UserAudAud();
			Aud1.setDefault();
			Aud1.middleName=Aud1.middleName+date;
			Aud1.email = app.mail.setMail("aud" + date);
			app.helper.reg_aud(Aud1, "aud" + date);
		}	
}


