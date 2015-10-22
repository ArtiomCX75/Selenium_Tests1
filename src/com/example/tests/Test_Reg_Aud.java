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
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import com.example.tests.AudLand_Pred;
import com.example.tests.Element;
import com.thoughtworks.selenium.webdriven.commands.Click;
import com.example.*;

public class Test_Reg_Aud extends Browser{
	//static WebDriver wdr1;
	//static WebDriver wdr2;
	//WebDriver d;
	static String email;
	String date;
	UserAudAud Aud1 = new UserAudAud();

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			
			wdr1=Browser.on();
			wdr2=Browser.on();
			wdr2.manage().window().setPosition(new Point(2000, 0));
			wdr2.manage().window().maximize();	
			
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			//Browser.sl(1);
			wdr1.quit();
			wdr2.quit();
		}
		
		@Test
		public void reg_aud() throws Exception {
			String server = Constants.urlAudTest;
			date = Browser.what_date("post");
			System.out.println(date);
			secondThread.start();
			WebDriver d=wdr1;
			AudLand_Aud.url.go(d, server);
			Aud1.setDefault();
			//
			AudLand_Aud.btnStartWork.click(d);
			Browser.waitFor(d, server+AudAnketa1.url.adres);
			AudAnketa1.fldSurname.type(d, Aud1.surName);
			AudAnketa1.fldName.type(d, Aud1.name);
			AudAnketa1.fldMiddlename.type(d, Aud1.middleName);
			AudAnketa1.fldPhone.type(d, Aud1.phoneNumber);
			AudAnketa1.fldNumberAt.type(d, Aud1.numberAt);
			AudAnketa1.fldExp.type(d, Aud1.exp);
			AudAnketa1.dwnDownloadFile.load(d, Files.pdffile1);
			AudAnketa1.chkAgr1.click(d);
			AudAnketa1.chkAgr2.click(d);
			secondThread.join();
			thirdThread.start();
			AudAnketa1.fldEmail.type(d, Aud1.email);
			AudAnketa1.btnSend.click(d);
			Browser.sl(1.8);
			AudAnketa1.btnNext.click(d);
			Browser.waitFor(d, server+AudLand_Aud.url.adres);
			
			
			
			AudLand_Aud.url.go(d, server);
			AudLand_Aud.btnVhod.click(d);
			thirdThread.join();
			AudLand_Aud.fldLogin.type(d, Aud1.login);
			AudLand_Aud.fldPass.type(d, Aud1.password);
			AudLand_Aud.btnVojti.click(d);
			Browser.waitFor(d, server+AudAnketa2.url.adres);
			AudAnketa2.fldDateOfBirth.type(d, Aud1.dateOfBirth);
			AudAnketa2.fldSnils.type(d, Aud1.snils);
			AudAnketa2.fldPassNumber.type(d, Aud1.passNumber);
			AudAnketa2.fldCity.type(d, Aud1.city);
			AudAnketa2.fldStreet.type(d, Aud1.street);
			AudAnketa2.fldHouse.type(d, Aud1.house);
			AudAnketa2.fldFlat.type(d, Aud1.flat);
			AudAnketa2.fldBic.type(d, Aud1.bic);
			AudAnketa2.fldBill.type(d, Aud1.bill);
			AudAnketa2.dwnDownloadFile.load(d, Files.jpgfile1);
			AudAnketa2.chkAgree.click(d);
			AudAnketa2.btnSend.click(d);
			Browser.waitFor(d, server+AudList.url.adres);
			
			
			 FileOutputStream fos = new FileOutputStream("temp_aud.txt");
			  ObjectOutputStream oos = new ObjectOutputStream(fos);
			  oos.writeObject(Aud1);
			  oos.flush();
			  oos.close();
			//проверить с помощью судо и дж эс
			
		}
		Thread secondThread = new Thread(new Runnable() {
			public void run() 
			{	try{
				System.out.println("second");
				WebDriver d=wdr2;
				email = Browser.setMail(d, "aud"+date);
				Aud1.email = email;
				//wdr2.quit();
			}
			catch(Exception e){};
			}
		});
		Thread thirdThread = new Thread(new Runnable() {
			public void run() 
			{	try{
				System.out.println("third");
				WebDriver d=wdr2;
				while(d.findElements(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).isEmpty())
				{
					TempMail.btnReload.click(d);
					//System.out.println("...");
					//Browser.sl(1);
					
				}
				d.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).click();
				Aud1.login=d.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/p/span")).getText();
				Aud1.password=d.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[8]/td[2]/p/span")).getText();
				System.out.println("login "+Aud1.login+"  pass "+Aud1.password);
				wdr2.quit();
			}
			catch(Exception e){};
			}
		});
		
	}


