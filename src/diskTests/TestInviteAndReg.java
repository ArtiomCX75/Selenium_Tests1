package diskTests;

import org.junit.Test;

import diskHelpers.Element;
import diskHelpers.UserDisc;

public class TestInviteAndReg extends TestBase {
	UserDisc user = new UserDisc();
	UserDisc admin = UserDisc.makeAdmin();
	String date = Element.what_date("post");

	@Test
	public void inviteTest() throws Exception {
		user.setDeault();
		user.semiEmail = "dis" + date;
		user.email = app.mail.setMail(user.semiEmail);
		app.land.open().loginlinkclick().login(admin).open().invite(user).logout();
		app.helper.writeObject(user, "temp_disk.txt");
		regTest();
	}

	// @Test
	public void regTest() throws Exception {
		user = UserDisc.readLast();
		app.mail.setMail(user.semiEmail);
		app.mail.readDiskRegMail().fillfields(user).logout();
	}
}
