package diskTests;

import org.junit.AfterClass;

public class TestBase {
	static String baseUrl = "http://test.discounter-club.ru/";
	static ApplicationManager app = new ApplicationManager(baseUrl); 
	//static ApplicationManager app2 = new ApplicationManager(baseUrl); 
	
	@AfterClass
	public static void after() throws Exception{
		//Thread.sleep(1);
		app.Driver.close();
	//	app2.Driver.close();
	}
}
