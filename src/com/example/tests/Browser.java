package com.example.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser extends ChromeDriver {
	public static WebDriver driver;
	public static StringBuffer verificationErrors = new StringBuffer();

	public static void browserOn() throws Exception {

		if (driver == null) {

			System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
	}

	public static void browserOff() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	public static void sl(double d) throws InterruptedException { // ����� �
																	// ��������
		d = d * 1000;
		int i = (int) d;
		Thread.sleep(i);
		/*
		 * for (int i=s; i>0; i--, Thread.sleep(1000)) { int q=0; }
		 */
	}

	public static void go_to(String url) throws Exception {
		driver.get(url);
		sl(3);
	}

	public static void gt(String s) throws Exception {
		System.out.println("go to " + s);
		driver.get(s);
		waitFor(s);
		System.out.println("OK");
	}

	public static void waitFor(String s) throws Exception {
		int i=0;
		for (i=0; i < 20; i = i + 1) {
			Browser.sl(0.5);
			if (s.equals(Browser.driver.getCurrentUrl())) {
				break;
			}	
		}
		if (i>18)
		{
			System.err.println("wait for " + s);
			System.err.println("now is   " + Browser.driver.getCurrentUrl());
			assertFalse("url doesn't load", true);
		}
		System.out.println("wait ok");
	}

	/*
	 * public void startBrowser() { driver =
	 * WebDriverFactory.getDriver(DesiredCapabilities.chrome()); }
	 */

}