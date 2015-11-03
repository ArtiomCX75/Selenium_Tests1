package audTests;

import org.junit.Test;

public class TestCreateBid extends TestBase {
	@Test
	public void createBid() throws Exception {
		app.audHelper.create_bid();
	}

}
