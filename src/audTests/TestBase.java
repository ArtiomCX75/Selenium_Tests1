package audTests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

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
		//Thread.sleep(3);
		app.Driver.close();
	//	app2.Driver.close();
	}
	
	
	public static void writeObject(Object obj, String s) throws Exception{
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}
}
