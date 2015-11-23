package diskTests;

import org.junit.Test;

import diskHelpers.Element;
import diskHelpers.Files;
import diskHelpers.UserDisc;

public class TestNewConcurs extends TestBase {

	@Test
	public void newConcurs() throws Exception {
		String users[] = new String[200];
		users[0] = "ref1@freeletter.me";

		for (int j = 1; j < 4; j++)
			users[j] = "ref2_" + j + "@freeletter.me";
		for (int j = 4; j < 13; j++)
			users[j] = "ref3_" + (j - 3) + "@freeletter.me";
		for (int j = 13; j < 40; j++)
			users[j] = "ref4_" + (j - 12) + "@freeletter.me";
		for (int j = 40; j < 122; j++)
			users[j] = "ref5_" + (j - 39) + "@freeletter.me";

		int i = 1;
		for (int k = 40; k < 122; k++) {
			String u = users[k];
			System.out.println(u);
			if (u == null)
				continue;
			UserDisc userD = UserDisc.createNew(u, "12345");
			app.land.open().loginlinkclick().login(userD);
			app.profile.open();
			Element.sl(1);
			app.profile.lnkConcurs.click();
			app.concurs.btnTakePart.click();
			if (i == 1)
				app.concurs.dwnPhoto.sendKeys(Files.jpgfile1);
			if (i == 2)
				app.concurs.dwnPhoto.sendKeys(Files.jpgfile2);
			if (i == 3)
				app.concurs.dwnPhoto.sendKeys(Files.jpgfile3);
			if (i == 4)
				app.concurs.dwnPhoto.sendKeys(Files.jpgfile4);
			if (i == 5)
				app.concurs.dwnPhoto.sendKeys(Files.jpgfile5);
			if (i == 6) {
				app.concurs.dwnPhoto.sendKeys(Files.jpgfile6);
				i = 1;
			}
			Element.sl(3);
			app.concurs.btnSendPhoto.click();
			Element.sl(1);
			app.helper.logout();
			i++;
		}
	}
}
