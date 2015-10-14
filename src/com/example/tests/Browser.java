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
		  System.setProperty("webdriver.chrome.driver", "E://eclipse//workspace//Other//chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  }
	  
	  public static void browserOff() throws Exception {
		driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	    	fail(verificationErrorString);
	    	}
	  }
	  public static void sl(double d) throws InterruptedException {	//пауза в секундах
		  d=d*1000;
		  int i = (int) d;
		  Thread.sleep(i);
		  /*for (int i=s; i>0; i--, Thread.sleep(1000))  {
			 int q=0;
		  	}*/
	  	}
	  
	  public static void go_to(String url) throws Exception{
		  driver.get(url);
		  sl(3);
	  }
	  
	 /* public void startBrowser() {
		    driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome());
		  }*/
	 
}