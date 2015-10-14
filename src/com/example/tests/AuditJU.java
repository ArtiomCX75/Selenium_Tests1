
package com.example.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.example.tests.AUD_Landing;
import com.example.tests.Element;
import com.example.tests.Act;


public class AuditJU {
	//Browser browser = new Browser();
//	Browser browser;
	//WebDriver driver;
		
	@Test
	public void main() throws Exception
	{	
		System.setProperty("webdriver.chrome.driver", "E://eclipse//workspace//Other//chromedriver.exe");
		//Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Browser.browserOn();
	
		Browser.driver.get(Constants.urlAudTest+AUD_Landing.url);
		Browser.sl(2);
		
		AUD_Landing.btnZakazAud.click();
		AUD_Landing.fldUrSusch1.type("1");
		AUD_Landing.fldUrSusch2.type(2);
		AUD_Landing.fldUrSusch3.type("3");
		AUD_Landing.fldUrSusch4.type(4);
		AUD_Landing.fldUrSusch5.type("5");
		AUD_Landing.fldUrSusch6.type(6);
		AUD_Landing.fldUrSusch7.type("7");
		AUD_Landing.fldUrSusch8.type(8);
		AUD_Landing.btnRassch.click();
		Browser.sl(1);
		
		AUD_Create.fldNazvOrg.type("OOO AAA");
		AUD_Create.fldFIO.type("Petrov Ivan Ivanovich");
		AUD_Create.fldGenDir.type("Petrov Ivan Ivanovich");
		AUD_Create.fldVidDej.type("prodaja");
		AUD_Create.fldUsualPhone.type("1234567890");
		AUD_Create.fldPhone.type("0987654321");
		AUD_Create.chkAgree.click();
		AUD_Create.fldEmail.type("asd@dd.dd");
		AUD_Create.fldPass.type("123456");
		Browser.sl(3);
		Browser.browserOff();
	
	
	}
	
	
	
	
}
