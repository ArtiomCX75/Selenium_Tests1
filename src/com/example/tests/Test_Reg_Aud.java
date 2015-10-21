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
	static WebDriver wdr1;
	static WebDriver wdr2;
	static WebDriver d;
	static String email;
	String date;

		//@BeforeClass
		public void setUpBeforeClass() throws Exception {
//			System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
			//	wdr1=Browser.on();
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		//	//Browser.sl(1);
			wdr1.quit();
		}
		
		@Test
		public void reg_aud() throws Exception {
			wdr1 = Browser.on();
			d=wdr1;
			String server = Constants.urlAudTest;
			date = Browser.what_date("post");
			email = Browser.setMail(d, "aud"+date);
			System.out.println(email);
			AUD_Land_Aud.url.go(d, server);
			UserAudAud Aud1 = new UserAudAud();
			Aud1.setDefault();
			Aud1.email = email;
			AUD_Land_Aud.btnStartWork.click(d);
			Browser.waitFor(d, server+AUD_Anketa1.url.adres);
			AUD_Anketa1.fldSurname.type(d, Aud1.surName);
			AUD_Anketa1.fldName.type(d, Aud1.name);
			AUD_Anketa1.fldMiddlename.type(d, Aud1.middleName);
			AUD_Anketa1.fldPhone.type(d, Aud1.phoneNumber);
			AUD_Anketa1.fldEmail.type(d, Aud1.email);
			AUD_Anketa1.fldNumberAt.type(d, Aud1.numberAt);
			AUD_Anketa1.fldExp.type(d, Aud1.exp);
			AUD_Anketa1.dwnDownloadFile.load(d, Files.pdffile1);
			AUD_Anketa1.chkAgr1.click(d);
			AUD_Anketa1.chkAgr2.click(d);
			//Browser.sl(1);
			AUD_Anketa1.btnSend.click(d);
			Browser.sl(1.8);
			AUD_Anketa1.btnNext.click(d);
			
			TempMail.url.go(d);
			TempMail.btnChange.click(d);
			TempMail.fldLogin.type(d, "aud"+date);
			TempMail.btnSubmitChange.click(d);
			TempMail.btnReload.click(d);
			d.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).click();
			Aud1.login=d.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/p/span")).getText();
			Aud1.password=d.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[8]/td[2]/p/span")).getText();
			System.out.println("login "+Aud1.login+"  pass "+Aud1.password);
			AUD_Land_Aud.url.go(d);
			AUD_Land_Aud.btnVhod.click(d);
			AUD_Land_Aud.fldLogin.type(d, Aud1.login);
			AUD_Land_Aud.fldPass.type(d, Aud1.password);
			AUD_Land_Aud.btnVojti.click(d);
			Browser.waitFor(d, server+AUD_Anketa2.url.adres);
			AUD_Anketa2.fldDateOfBirth.type(d, Aud1.dateOfBirth);
			AUD_Anketa2.fldSnils.type(d, Aud1.snils);
			AUD_Anketa2.fldPassNumber.type(d, Aud1.passNumber);
			AUD_Anketa2.fldCity.type(d, Aud1.city);
			AUD_Anketa2.fldStreet.type(d, Aud1.street);
			AUD_Anketa2.fldHouse.type(d, Aud1.house);
			AUD_Anketa2.fldFlat.type(d, Aud1.flat);
			AUD_Anketa2.fldBic.type(d, Aud1.bic);
			AUD_Anketa2.fldBill.type(d, Aud1.bill);
			AUD_Anketa2.dwnDownloadFile.load(d, Files.jpgfile1);
			AUD_Anketa2.chkAgree.click(d);
			AUD_Anketa2.btnSend.click(d);
			Browser.waitFor(d, server+AUD_List.url.adres);
			
			
			 FileOutputStream fos = new FileOutputStream("temp_aud.txt");
			  ObjectOutputStream oos = new ObjectOutputStream(fos);
			  oos.writeObject(Aud1);
			  oos.flush();
			  oos.close();
			//проверить с помощью судо и дж эс
			
		}
	}


