package audTests;
import org.junit.Test;
import audPages.UserAudAud;
import browser.Browser;
public class TestRegAud extends TestBase{
	
	
	

		@Test
		public void regAud() throws Exception{
			String date = Browser.what_date("post");
			String email = app.tempMail2.setMail("aud" + date);
			UserAudAud Aud1 = new UserAudAud();
			Aud1.setDefault();
			Aud1.middleName=Aud1.middleName+date;
			Aud1.email = email;
			
			//app.helper.reg_aud(Aud1);
			
		}
		
	
		
		
}


