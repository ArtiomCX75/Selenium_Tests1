package browser;

import static org.junit.Assert.assertFalse;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



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
		temp.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		return temp;
	}
	

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
			System.err.println("\nwait for " + s);
			System.err.println("now is   " + driver.getCurrentUrl());
			assertFalse("url doesn't load", true);
		}
		System.out.println("url OK \n");
	}


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

	

	public static String what_date(String i) { // узнает дату
		Date d = new Date();
		SimpleDateFormat format1;
		if (i == "post") {
			//format1 = new SimpleDateFormat("dd_MM_yyyy_kk_mm"); // дата для
			format1 = new SimpleDateFormat("ddMMyykkmmss");	// почты
		} else {
			format1 = new SimpleDateFormat("dd.MM.yyyy"); // дата для поля
															// "дата"
		}
		return format1.format(d);
	}


	

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
