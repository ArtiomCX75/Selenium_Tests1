package com.example.tests;

import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.*;
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
import com.example.tests.AUD_Land_Pred;
import com.example.tests.Element;
import com.example.tests.Act;
import com.example.*;
import com.example.tests.Test_Reg_Pred;

public class Test_Reg_Aud {
	

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
			Browser.browserOn();
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			Browser.sl(5);
			Browser.browserOff();
		}
		
		@Test
		public void reg_aud() throws Exception {
			String date;
			String email;
			String urlAudForTest = Constants.urlAudTest;
			date = Browser.what_date("post");
			email = Browser.setMail("aud"+date);
			System.out.println(email);
			Browser.gt(urlAudForTest + AUD_Land_Aud.url);
			UserAudAud Aud1 = new UserAudAud();
			Aud1.setDefault();
			Aud1.email = email;
			/*AUD_Land_Aud.btnStartWork.click();
			Browser.waitFor(urlAudForTest+AUD_Anketa1.url);
			AUD_Anketa1.fldSurname.type(Aud1.surName);
			AUD_Anketa1.fldName.type(Aud1.name);
			AUD_Anketa1.fldMiddlename.type(Aud1.middleName);
			AUD_Anketa1.fldPhone.type(Aud1.phoneNumber);
			AUD_Anketa1.fldEmail.type(Aud1.email);
			AUD_Anketa1.fldNumberAt.type(Aud1.numberAt);
			AUD_Anketa1.fldExp.type(Aud1.exp);
			AUD_Anketa1.dwnDownloadFile.load(Files.pdffile1);
			AUD_Anketa1.chkAgr1.click();
			AUD_Anketa1.chkAgr2.click();
			AUD_Anketa1.btnSend.click();
			Browser.sl(1.5);
			AUD_Anketa1.btnNext.click();
			
			Browser.driver.get(Constants.urlTempMail);
			Browser.driver.findElement(By.xpath(".//*[@id='click-to-change']")).click();
			Browser.driver.findElement(By.xpath(".//*[@id='input_mail']")).sendKeys("aud"+date);
			Browser.driver.findElement(By.xpath(".//*[@id='postbut']")).click();
			Browser.driver.findElement(By.xpath(".//*[@id='click-to-refresh']")).click();
			Browser.driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).click();
			Aud1.login=Browser.driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/p/span")).getText();
			Aud1.password=Browser.driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[8]/td[2]/p/span")).getText();
			System.out.println("login "+Aud1.login+"  pass "+Aud1.password);*/
			Browser.gt(urlAudForTest+AUD_Land_Aud.url);
			Browser.sl(2);
			AUD_Land_Aud.btnVhod.click();
			Browser.sl(5);
			AUD_Land_Aud.fldLogin.type(Aud1.login);
			AUD_Land_Aud.fldPass.type(Aud1.password);
			AUD_Land_Aud.btnVojti.click();
			Browser.waitFor(urlAudForTest+AUD_Anketa2.url);
			AUD_Anketa2.fldDateOfBirth.type(Aud1.dateOfBirth);
			AUD_Anketa2.fldSnils.type(Aud1.snils);
			AUD_Anketa2.fldPassNumber.type(Aud1.passNumber);
			AUD_Anketa2.fldCity.type(Aud1.city);
			AUD_Anketa2.fldStreet.type(Aud1.street);
			AUD_Anketa2.fldHouse.type(Aud1.house);
			AUD_Anketa2.fldFlat.type(Aud1.flat);
			AUD_Anketa2.fldBic.type(Aud1.bic);
			AUD_Anketa2.fldBill.type(Aud1.bill);
			AUD_Anketa2.dwnDownloadFile.load(Files.pdffile1);
			//проверить с помощью судо и дж эс
			
		}
	}


