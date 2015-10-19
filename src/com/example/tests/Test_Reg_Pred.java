
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
import com.example.tests.AUD_Land_Pred;
import com.example.tests.Element;
import com.example.tests.Act;
import com.example.*;

public class Test_Reg_Pred {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "..//Other//chromedriver.exe");
		Browser.browserOn();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Browser.sl(3);
		Browser.browserOff();
	}
	
	@Test
	public void reg_pred() throws Exception {
		String date;
		String email;
		String urlAudForTest = Constants.urlAudTest;
		date = Browser.what_date("post");
		email = Browser.setMail("pred"+date);
		System.out.println(email);
		Browser.gt(urlAudForTest + AUD_Land_Pred.url);
		UserAudPred Pred1 = new UserAudPred();
		Pred1.setDefault();
		Pred1.email = email;
		AUD_Land_Pred.btnZakazAud.click();
		AUD_Land_Pred.fldUrSusch1.type(Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch2.type(Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch3.type(Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch4.type(Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch5.type(Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch6.type(Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch7.type(Pred1.urSusch[1]);
		AUD_Land_Pred.fldUrSusch8.type(Pred1.urSusch[1]);
		AUD_Land_Pred.btnRassch.click();
		Browser.waitFor(urlAudForTest+AUD_Anket_Pred.url);
		AUD_Anket_Pred.fldNazvOrg.type(Pred1.orgName);
		AUD_Anket_Pred.fldFIO.type(Pred1.contactName);
		AUD_Anket_Pred.fldGenDir.type(Pred1.genDir);
		AUD_Anket_Pred.fldVidDej.type(Pred1.vidDej);
		AUD_Anket_Pred.fldUsualPhone.type(Pred1.usualPhone);
		AUD_Anket_Pred.fldPhone.type(Pred1.phoneNumber);
		AUD_Anket_Pred.chkAgree.click();
		AUD_Anket_Pred.fldEmail.type(Pred1.email);
		AUD_Anket_Pred.fldPass.type(Pred1.password);
		AUD_Anket_Pred.btnZakaz.click();
		Browser.waitFor(urlAudForTest+AUD_Pay.url);
		AUD_Pay.btnGetBill.click();
		Browser.waitFor(urlAudForTest+AUD_Paid.url);
		AUD_Paid.btnDwnloadDocs.click();
		Browser.waitFor(urlAudForTest+AUD_Docs.url);
		AUD_Docs.dwnDownloadFile.load(Files.pdffile1);
		AUD_Docs.dwnDownloadFile.load(Files.pdffile2);
		AUD_Docs.btnSend.click();
		AUD_Docs.btnSendNext.click();
		Browser.waitFor(urlAudForTest+AUD_Cab.url);
		AUD_Cab.btnReloadStatus.click();
	}
}


