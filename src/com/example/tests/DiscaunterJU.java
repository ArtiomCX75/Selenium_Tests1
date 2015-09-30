
package com.example.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.example.tests.Landing;
import com.example.tests.Element;
import com.example.tests.Act;


public class DiscaunterJU {
	//Browser browser = new Browser();
//	Browser browser;
	//WebDriver driver;
		
	//@Test
	public void main() throws Exception
	{	
		System.setProperty("webdriver.chrome.driver", "C://eclipse-java-mars-R-win32-x86_64//chromedriver.exe");
		Landing landing = new Landing();
		Browser.browserOn();
		Browser.driver.get(Constants.urlDiskTest);
		//Browser.sl(3);
		landing.But1.click();
		
		
		//  Landing landing = new Landing();
		//  System.out.println(landing.But4.adres);
	
	//browser.browserOn();
	//driver.get(Constants.urlDiskTest+Landing.url);
	//landing.But1.click();
	//test();
	}
	
	
	public void test() {
		
		Test1 t = new Test1();
		t.pr("222");
		
	}
	
}
