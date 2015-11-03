package diskTests;

import org.junit.Test;

public class TestLogin extends TestBase{
	UserDisc user;
	@Test
	public void loginTest() throws Exception{
	user = UserDisc.createNew("ref1@freeletter.me", "12345");
	
	app.land.open().loginlinkclick().login(user).logout();
	}
/*	Thread t2 = new Thread(new Runnable() {public void run(){try {
		app2.landingpage.open().loginlinkclick().login(account).logout().loginlinkclick();
	} catch (Exception e) {
		
		e.printStackTrace();
	}}});*/
}
