
package audTests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import audPages.AudAnketPred;
import audPages.AudCabPred;
import audPages.AudDocs;
import audPages.AudLandPred;
import audPages.AudPaid;
import audPages.AudPay;
import audPages.TempMail;
import audPages.UserAudPred;
import browser.Browser;
import browser.Constants;
import browser.Files;

public class TestRegPred extends TestBase {
	
	static String email;
	static String date;
	static UserAudPred Pred1 = new UserAudPred();
	
	static Thread secondThread = new Thread(new Runnable() {
		public void run() 
		{	try{
			System.out.println("second");
			email = app.tempMail.setMail("pred"+date);
			Pred1.email = email;
			//wdr2.quit();
		}
		catch(Exception e){};
		}
	});
	@Test
	public void regPred() throws Exception {
		reg_pred();
	}
	public static void reg_pred() throws Exception {
		String server = Constants.urlAudTest;
		date = Browser.what_date("post");
		Pred1.setDefault();
		Pred1.email="";
		secondThread.start();
		WebDriver d=wdr1;
		Pred1.contactName=Pred1.contactName+date;
		AudLandPred.url.gt(d, server);
		AudLandPred.lnkUznatUr.click(d);
		AudLandPred.fldUrSusch1.type(d, Pred1.urSusch[0]);
		AudLandPred.fldUrSusch2.type(d, Pred1.urSusch[1]);
		AudLandPred.fldUrSusch3.type(d, Pred1.urSusch[2]);
		AudLandPred.fldUrSusch4.type(d, Pred1.urSusch[3]);
		AudLandPred.fldUrSusch5.type(d, Pred1.urSusch[4]);
		AudLandPred.fldUrSusch6.type(d, Pred1.urSusch[5]);
		AudLandPred.fldUrSusch7.type(d, Pred1.urSusch[6]);
		AudLandPred.fldUrSusch8.type(d, Pred1.urSusch[7]);
		AudLandPred.btnRassch.click(d);
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
		Browser.sl(3);
		Browser.waitFor(d, server+AudDocs.url.adres);
		AudDocs.dwnDownloadFile.load(d, Files.pdffile1);
		//Browser.sl(10);
		AudDocs.btnSend.click(d);
		Browser.waitFor(d, server+AudCabPred.url.adres);
		Browser.sl(3);
		FileOutputStream fos = new FileOutputStream("temp_pred.txt");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  oos.writeObject(Pred1);
		  oos.flush();
		  oos.close();
		  System.out.println("DONE");
	}
}


