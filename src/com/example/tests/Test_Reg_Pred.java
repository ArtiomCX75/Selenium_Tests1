
package com.example.tests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import com.example.tests.AudLand_Pred;

public class Test_Reg_Pred extends Browser {
	//WebDriver d;
	static String email;
	String date;
	UserAudPred Pred1 = new UserAudPred();
	

@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
			wdr1=Browser.on();
			wdr2=Browser.on();
			wdr2.manage().window().setPosition(new Point(2000, 0));
			wdr2.manage().window().maximize();	
		
			
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		wdr1.quit();
		wdr2.quit();
		System.out.println("DONE");
		
	}
	Thread secondThread = new Thread(new Runnable() {
		public void run() 
		{	try{
			System.out.println("second");
			email = Browser.setMail(wdr2,"pred"+date);
			Pred1.email = email;
			wdr2.quit();
		}
		catch(Exception e){};
		}
	});
	@Test
	public void reg_pred() throws Exception {
		
		
		String server = Constants.urlAudTest;
		
		date = Browser.what_date("post");
		
		
		System.out.println("new mewjdgfsfdfkljskljdf");
		Pred1.setDefault();
		secondThread.start();
				
		WebDriver d=wdr1;
		Pred1.contactName=Pred1.contactName+date;
		AudLand_Pred.url.go(d, server);
		AudLand_Pred.lnkUznatUr.click(d);
		AudLand_Pred.fldUrSusch1.type(d, Pred1.urSusch[1]);
		AudLand_Pred.fldUrSusch2.type(d, Pred1.urSusch[1]);
		AudLand_Pred.fldUrSusch3.type(d, Pred1.urSusch[1]);
		AudLand_Pred.fldUrSusch4.type(d, Pred1.urSusch[1]);
		AudLand_Pred.fldUrSusch5.type(d, Pred1.urSusch[1]);
		AudLand_Pred.fldUrSusch6.type(d, Pred1.urSusch[1]);
		AudLand_Pred.fldUrSusch7.type(d, Pred1.urSusch[1]);
		AudLand_Pred.fldUrSusch8.type(d, Pred1.urSusch[1]);
		AudLand_Pred.btnRassch.click(d);
		Browser.waitFor(d, server+AudAnketPred.url.adres);
		AudAnketPred.fldNazvOrg.type(d, Pred1.orgName);
		AudAnketPred.fldContactFio.type(d, Pred1.contactName);
		AudAnketPred.fldGenDir.type(d, Pred1.genDir);
		AudAnketPred.fldVidDej.type(d, Pred1.vidDej);
		AudAnketPred.fldUsualPhone.type(d, Pred1.usualPhone);
		AudAnketPred.fldPhone.type(d, Pred1.phoneNumber);
		AudAnketPred.fldPass.type(d, Pred1.password);
		secondThread.join();
		AudAnketPred.fldEmail.type(d, Pred1.email);
		AudAnketPred.chkAgree.click(d);
		AudAnketPred.btnZakaz.click(d);
		Browser.waitFor(d, server+AudPay.url.adres);
		AudPay.btnGetBill.click(d);
		Browser.waitFor(d, server+AudPaid.url.adres);
		AudPaid.btnDwnloadDocs.click(d);
		Browser.waitFor(d, server+AudDocs.url.adres);
		AudDocs.dwnDownloadFile.load(d, Files.pdffile1);
		AudDocs.btnSend.click(d);
		Browser.waitFor(d, server+AudCabPred.url.adres);
		FileOutputStream fos = new FileOutputStream("temp_pred.txt");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(Pred1);
		  oos.flush();
		  oos.close();
		  
	}
}


