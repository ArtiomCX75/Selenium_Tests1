package com.example.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser extends ChromeDriver{
	  public static WebDriver driver;
	  public static StringBuffer verificationErrors = new StringBuffer();
	 	 
	  public static void browserOn() throws Exception {
		  driver = new ChromeDriver();
		  System.setProperty("webdriver.chrome.driver", "C://eclipse-java-mars-R-win32-x86_64//chromedriver.exe");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  }
	  
	  public void browserOff() throws Exception {
		driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	    	fail(verificationErrorString);
	    	}
	  }
	  public static void sl(int s) throws InterruptedException {	//пауза в секундах
		  for (int i=s; i>0; i--, Thread.sleep(1000))  {
			 int q=0;
		  	}
	  	}
	  public static void go_to(String url) throws Exception{
		  driver.get(url);
		  sl(3);
	  }
	  
	 /* public void startBrowser() {
		    driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome());
		  }*/
	 
}