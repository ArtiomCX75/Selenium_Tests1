package diskTests;

import org.junit.Test;

import diskHelpers.UserDisc;

public class TestLogin extends TestBase{
	UserDisc user;
	@Test
	public void loginTest() throws Exception{
	user = UserDisc.createNew("ref1@freeletter.me", "12345");
	app.land.open().loginlinkclick().login(user).logout();
	}

}
