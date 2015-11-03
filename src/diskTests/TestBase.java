package diskTests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Point;

import diskHelpers.Constants;
import diskHelpers.Element;
import diskPages.ApplicationManager;



@SuppressWarnings("unused")
public class TestBase {
	static String baseUrl;
	static ApplicationManager app;
	static ApplicationManager app2;
	
	@BeforeClass
	public static void before() throws Exception{
	baseUrl = Constants.urlDiskTest;
	//app.mail = app.tempMail2;
	
	Element.t=0.01;
	//app2 = new ApplicationManager(baseUrl); 
	//app2.Driver.manage().window().setPosition(new Point(2000, 0));
	//app2.Driver.manage().window().maximize();	
	app = new ApplicationManager(baseUrl); 
	app.mail = app.tempMail;
	}
	
	@AfterClass
	public static void after() throws Exception{
		app.Driver.quit();
	//	app2.Driver.quit();
	}
}
	
	