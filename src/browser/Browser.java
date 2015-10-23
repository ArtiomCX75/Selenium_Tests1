package browser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import audTests.*;


public class Browser{
	public static WebDriver wdr1;
	public static WebDriver wdr2;
	public static StringBuffer verificationErrors = new StringBuffer();
	
	
/*	public static WebDriver on(WebDriver d){
		String s=d.toString();
		if (s!=null){
			System.out.println("not null "+s);
		}
		else{
			System.out.println("null");
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("now"+d.toString());
			
		}
		return d;
	}*/
	
	public static WebDriver on(){
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver temp;
		temp = new ChromeDriver();
		temp.manage().window().maximize();
		temp.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return temp;
	}
	
	/*protected Browser() {
		//System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
		//wd = new ChromeDriver();
		//wd.manage().window().maximize();
		//wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

	}*/
	public static void waitFor(WebDriver driver, String s) throws Exception {
		System.out.println("wait for "+s);
		waitFr(driver, s);
	}
	
	private static void waitFr(WebDriver driver, String s) throws Exception {
		int i = 0;
		for (i = 0; i < 50; i = i + 1) {
			Browser.sl(0.1);
			if (s.equals(driver.getCurrentUrl())) {
				break;
			}
		}
		if (i > 48) {
			System.err.println("wait for " + s);
			System.err.println("now is   " + driver.getCurrentUrl());
			assertFalse("url doesn't load", true);
		}
		System.out.println("url OK");
	}
/*	public static WebDriver getchdr() {
		System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		return d;
	}*/

	/*public WebDriver on() throws Exception {

		// if (this == null) {

		System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		// }
		stat="stat stat";
		return wd;
	}*/

	public static void off(ChromeDriver driver) throws Exception {
		driver.quit();
		/*String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}*/
	}

	public static void sl(double d) throws InterruptedException { // пауза в
																	// секундах
		d = d * 1000;
		int i = (int) d;
		Thread.sleep(i);

	}

	/*
	 * public static void go_to(String url) throws Exception { driver.get(url);
	 * sl(3); }
	 */


	public static String what_date(String i) { // узнает дату
		Date d = new Date();
		SimpleDateFormat format1;
		if (i == "post") {
			format1 = new SimpleDateFormat("dd_MM_yyyy_kk_mm"); // дата для
			format1 = new SimpleDateFormat("dd_MM_yyyy_kk_mm_ss");													// почты
		} else {
			format1 = new SimpleDateFormat("dd.MM.yyyy"); // дата для поля
															// "дата"
		}
		return format1.format(d);
	}

	public static String setMail(WebDriver driver, String s) throws Exception { // создание почты
		TempMail.url.go(driver);
		TempMail.btnChange.click(driver);
		TempMail.fldLogin.type(driver, s);
		TempMail.btnSubmitChange.click(driver);
		TempMail.btnReload.click(driver);
		String email = TempMail.getEmail(driver);
		System.out.println("email= "+email);
		return email;
	}
	/////
	
//



	////
	/*
	 * public void startBrowser() { driver =
	 * WebDriverFactory.getDriver(DesiredCapabilities.chrome()); }
	 */

}///////////// JS

// JavascriptExecutor js = (JavascriptExecutor) Browser.driver;
// WebElement element =
// Browser.driver.findElement(By.xpath("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]"));
// js.executeScript("arguments[0].setAttribute('style', 'position: absolute;
// width: 0px; height: 0px; z-index: -100000; border: none; margin: 0px;
// padding: 0px;')",element);
