
package com.example.tests;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//import org.junit.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import com.example.tests.AUD_Landing;
import com.example.tests.Element;
import com.example.tests.Act;
import com.example.*;

public class AuditJU {
	public String urlAudForTest = Constants.urlAudLocal;
	public static String date;
	public static String email;

	@BeforeClass
	public static void setUpBeforClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
		Browser.browserOn();
		date = what_date("post");
		email = setMail(date);
		System.out.println(email);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Browser.sl(3);
		Browser.browserOff();
	}

	@Test
	public void main() throws Exception {
		Browser.gt(urlAudForTest + AUD_Landing.url);
		UserAudPred Pred1 = new UserAudPred();
		Pred1.setDefault();
		Pred1.email = email;
		AUD_Landing.btnZakazAud.click();
		AUD_Landing.fldUrSusch1.type(Pred1.urSusch[1]);
		AUD_Landing.fldUrSusch2.type(Pred1.urSusch[1]);
		AUD_Landing.fldUrSusch3.type(Pred1.urSusch[1]);
		AUD_Landing.fldUrSusch4.type(Pred1.urSusch[1]);
		AUD_Landing.fldUrSusch5.type(Pred1.urSusch[1]);
		AUD_Landing.fldUrSusch6.type(Pred1.urSusch[1]);
		AUD_Landing.fldUrSusch7.type(Pred1.urSusch[1]);
		AUD_Landing.fldUrSusch8.type(Pred1.urSusch[1]);
		AUD_Landing.btnRassch.click();
		waitFor(urlAudForTest+AUD_Create.url);
		AUD_Create.fldNazvOrg.type(Pred1.orgName);
		AUD_Create.fldFIO.type(Pred1.contactName);
		AUD_Create.fldGenDir.type(Pred1.genDir);
		AUD_Create.fldVidDej.type(Pred1.vidDej);
		AUD_Create.fldUsualPhone.type(Pred1.usualPhone);
		AUD_Create.fldPhone.type(Pred1.phoneNumber);
		AUD_Create.chkAgree.click();
		AUD_Create.fldEmail.type(Pred1.email);
		AUD_Create.fldPass.type(Pred1.password);
		AUD_Create.btnZakaz.click();
		waitFor(urlAudForTest+AUD_Pay.url);
		AUD_Pay.btnGetBill.click();
		waitFor(urlAudForTest+AUD_Paid.url);
		AUD_Paid.btnDwnloadDocs.click();
		waitFor(urlAudForTest+AUD_Docs.url);
		//AUD_Docs.dwnDownLoad.click();
		//AUD_Docs.q.click();
		
	//	JavascriptExecutor js = (JavascriptExecutor) Browser.driver;
	//	WebElement element = Browser.driver.findElement(By.xpath("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]"));
	//	js.executeScript("arguments[0].setAttribute('style', 'position: absolute; width: 0px; height: 0px; z-index: -100000; border: none; margin: 0px; padding: 0px;')",element);
		Browser.driver.findElement(By.xpath("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]")).sendKeys("C://Users//faa11//workspace//Other//pdffile1.pdf");
		//Browser.sl(7);
		Browser.driver.findElement(By.xpath("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]")).sendKeys("C://Users//faa11//workspace//Other//pdffile2.pdf");
	//	Browser.driver.findElement(By.xpath("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]")).submit();
		
		//AUD_Docs.w.type("..//Other//pdffile.pdf");
		///
	}

	public static String what_date(String i) { // узнает дату
		Date d = new Date();
		SimpleDateFormat format1;
		if (i == "post") {
			format1 = new SimpleDateFormat("dd_MM_yyyy_kk_mm"); // дата для
																// почты
		} else {
			format1 = new SimpleDateFormat("dd.MM.yyyy"); // дата для поля
															// "дата"
		}
		return format1.format(d);
	}

	public static String setMail(String s) { // создание почты
		Browser.driver.get(Constants.urlTempMail);
		Browser.driver.findElement(By.xpath(".//*[@id='click-to-change']")).click();
		Browser.driver.findElement(By.xpath(".//*[@id='input_mail']")).sendKeys(s);
		Browser.driver.findElement(By.xpath(".//*[@id='postbut']")).click();
		Browser.driver.findElement(By.xpath(".//*[@id='click-to-refresh']")).click();
		String mailbox = Browser.driver.findElement(By.xpath(".//*[@id='mail']")).getAttribute("value");
		return mailbox;
	}

	public static void waitFor(String s) throws Exception {
		int i;
		for (i=0; i < 5; i++) {
			if (s.equals(Browser.driver.getCurrentUrl())) {
				break;
			}
			Browser.sl(1);
			System.out.println("wait for " + s);
			System.out.println("now is " + Browser.driver.getCurrentUrl());
			assertFalse("w url doesn't load", true);
		}

	}

}
