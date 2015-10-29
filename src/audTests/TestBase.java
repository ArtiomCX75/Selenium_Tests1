package audTests;

import org.junit.AfterClass;

import audPages.ApplicationManager;
import browser.Constants;
import oracle.jrockit.jfr.tools.ConCatRepository;

public class TestBase {
	static String baseUrl =Constants.urlAudTest;
	static ApplicationManager app = new ApplicationManager(baseUrl); 
	//static ApplicationManager app2 = new ApplicationManager(baseUrl); 
	
	@AfterClass
	public static void after() throws Exception{
		Thread.sleep(2);
		app.Driver.close();
	//	app2.Driver.close();
	}
}
