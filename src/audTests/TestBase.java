package audTests;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import browser.Browser;

public class TestBase {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Browser.wdr1=Browser.on();
	}
	
	@After
	public void after() {
		Browser.wdr1.quit();
	}
}
