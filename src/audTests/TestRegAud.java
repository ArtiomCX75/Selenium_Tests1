package audTests;
import org.junit.Test;
import audPages.UserAudAud;
import browser.Browser;
import browser.Mail;
public class TestRegAud extends TestBase{
	
		@Test
		public void regAud() throws Exception{
			String date = Browser.what_date("post");
			Mail mail = app.tempMail;
			String email = mail.setMail("aud" + date);
			UserAudAud Aud1 = new UserAudAud();
			Aud1.setDefault();
			Aud1.middleName=Aud1.middleName+date;
			Aud1.email = email;
			app.helper.reg_aud(Aud1);
		}	
}


