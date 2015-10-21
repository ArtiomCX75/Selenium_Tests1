
package com.example.tests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
import com.example.tests.AUD_Land_Pred;
import com.example.tests.Element;
import com.thoughtworks.selenium.webdriven.commands.Click;

import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

import com.example.*;

public class Test_Reg_Pred extends Browser {
	static WebDriver wdr1;
	static WebDriver wdr2;
	static WebDriver d;
	static String email;
	String date;
	UserAudPred Pred1 = new UserAudPred();
	

//@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	//	System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
	//	wdr1=Browser.on();	
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Browser.sl(1);
		wdr1.quit();
	}
	
	@Test
	public void reg_pred() throws Exception {
		Thread secondThread = new Thread(new Runnable() {
			public void run() 
			{	try{
				
				wdr2=Browser.on();
				wdr2.manage().window().setPosition(new Point(2000, 0));
				wdr2.manage().window().maximize();
				System.out.println("second");
				email = Browser.setMail(wdr2,"pred"+date);
				Pred1.email = email;
				wdr2.quit();
			}
			catch(Exception e){};
			}
		});
		
		String server = Constants.urlAudTest;
		
		date = Browser.what_date("post");
		
		
		
		Pred1.setDefault();
		secondThread.start();
		
		Browser.sl(2);
		wdr1 = Browser.on();
		d=wdr1;
		Pred1.contactName=Pred1.contactName+date;
		AUD_Land_Pred.url.go(d, server);
		AUD_Land_Pred.lnkUznatUr.click(d);
		AUD_Land_Pred.fldUrSusch1.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch2.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch3.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch4.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch5.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch6.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch7.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch8.type(d, Pred1.urSusch[1]);
		AUD_Land_Pred.btnRassch.click(d);
		Browser.waitFor(d, server+AUD_Anket_Pred.url.adres);
		AUD_Anket_Pred.fldNazvOrg.type(d, Pred1.orgName);
		AUD_Anket_Pred.fldContactFio.type(d, Pred1.contactName);
		AUD_Anket_Pred.fldGenDir.type(d, Pred1.genDir);
		AUD_Anket_Pred.fldVidDej.type(d, Pred1.vidDej);
		AUD_Anket_Pred.fldUsualPhone.type(d, Pred1.usualPhone);
		AUD_Anket_Pred.fldPhone.type(d, Pred1.phoneNumber);
		AUD_Anket_Pred.fldPass.type(d, Pred1.password);
		secondThread.join();
		AUD_Anket_Pred.fldEmail.type(d, Pred1.email);
		AUD_Anket_Pred.chkAgree.click(d);
		//Browser.sl(2);
		AUD_Anket_Pred.btnZakaz.click(d);
		Browser.waitFor(d, server+AUD_Pay.url.adres);
		AUD_Pay.btnGetBill.click(d);
		Browser.waitFor(d, server+AUD_Paid.url.adres);
		AUD_Paid.btnDwnloadDocs.click(d);
		Browser.waitFor(d, server+AUD_Docs.url.adres);
		AUD_Docs.dwnDownloadFile.load(d, Files.pdffile1);
		//AUD_Docs.dwnDownloadFile.load(Files.pdffile2);
		AUD_Docs.btnSend.click(d);
	//	AUD_Docs.btnSendNext.click();
		Browser.waitFor(d, server+AUD_Cab.url.adres);
		//AUD_Cab.btnReloadStatus.click();
		FileOutputStream fos = new FileOutputStream("temp_pred.txt");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(Pred1);
		  oos.flush();
		  oos.close();
		  
	}
}


