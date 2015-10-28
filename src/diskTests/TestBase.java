package diskTests;

import org.junit.AfterClass;

public class TestBase {
	static String baseUrl = "http://test.discounter-club.ru";
	static ApplicationManager app = new ApplicationManager(baseUrl); 
	@AfterClass
	public static void after(){
		app.Driver.close();
	}
}
