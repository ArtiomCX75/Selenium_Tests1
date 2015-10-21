package com.example.tests;



import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//import org.junit.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import com.example.tests.AUD_Land_Pred;
import com.example.tests.Element;
import com.thoughtworks.selenium.webdriven.commands.Click;
import com.example.*;

public class Test_Reg_Aud {


		//@BeforeClass
		public void setUpBeforeClass() throws Exception {
			System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
			//Browser.on();
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		//	Browser.sl(1);
			//Browser.brw.quit();
		}
		
		@Test
		public void reg_aud() throws Exception {
			System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
			Browser.add();
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
			AUD_Land_Aud.btnStartWork.click();
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
			//Browser.sl(1);
			AUD_Anketa1.btnSend.click();
			Browser.sl(2);
			AUD_Anketa1.btnNext.click();
			
			Browser.brw.get(Constants.urlTempMail);
			Browser.brw.findElement(By.xpath(".//*[@id='click-to-change']")).click();
			
			Browser.brw.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[1]/div/input")).sendKeys("aud"+date);
			//Browser.brw.findElement(By.xpath(".//*[@id='input_mail']")).sendKeys("aud"+date);
			Browser.brw.findElement(By.xpath(".//*[@id='postbut']")).click();
			Browser.brw.findElement(By.xpath(".//*[@id='click-to-refresh']")).click();
			Browser.brw.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).click();
			Aud1.login=Browser.brw.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/p/span")).getText();
			Aud1.password=Browser.brw.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[8]/td[2]/p/span")).getText();
			System.out.println("login "+Aud1.login+"  pass "+Aud1.password);
			Browser.gt(urlAudForTest+AUD_Land_Aud.url);
			AUD_Land_Aud.btnVhod.click();
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
			AUD_Anketa2.dwnDownloadFile.load(Files.jpgfile1);
			Browser.sl(20);
			AUD_Anketa2.chkAgree.click();
			AUD_Anketa2.btnSend.click();
			Browser.waitFor(urlAudForTest+AUD_List.url);
			
			
			 FileOutputStream fos = new FileOutputStream("temp_aud.txt");
			  ObjectOutputStream oos = new ObjectOutputStream(fos);
			  oos.writeObject(Aud1);
			  oos.flush();
			  oos.close();
			//проверить с помощью судо и дж эс
			
		}
	}


