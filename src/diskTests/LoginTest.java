package diskTests;

import org.junit.Test;

public class LoginTest extends TestBase{
	@Test
	public void loginTest() throws Exception{
	UserDisc account = new UserDisc();{
	account.username="deadron@yandex.ru";
	account.pass="qwerty";}
	
	app.landingpage.loginlinkclick().login(account).logout();
	}
}
