package diskTests;

import org.junit.Test;

public class LoginTest extends TestBase{
	UserDisc account;
	@Test
	public void loginTest() throws Exception{
	account = new UserDisc();{
	account.username="deadron@yandex.ru";
	account.pass="qwerty";}
	
	//app.landingpage.loginlinkclick().login(account).logout();
	
//	t2.start();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();
	app.landingpage.open().loginlinkclick().login(account).logout();

	}
/*	Thread t2 = new Thread(new Runnable() {public void run(){try {
		app2.landingpage.open().loginlinkclick().login(account).logout().loginlinkclick();
	} catch (Exception e) {
		
		e.printStackTrace();
	}}});*/
}
