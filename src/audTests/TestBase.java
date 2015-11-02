package audTests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import audPages.ApplicationManager;
import browser.Browser;
import browser.Constants;


@SuppressWarnings("unused")
public class TestBase {
	static String baseUrl;
	static ApplicationManager app;
	
	@BeforeClass
	public static void before() throws Exception{
	baseUrl = Constants.urlAudTest;
	app = new ApplicationManager(baseUrl); 
	//static ApplicationManager app2 = new ApplicationManager(baseUrl); 
	}
	
	//@AfterClass
	public static void after() throws Exception{
		app.Driver.quit();
	//	app2.Driver.close();
	}
	
	
	
}
