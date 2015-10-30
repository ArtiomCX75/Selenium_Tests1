
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
import diskTests.AllPages;

public class TestRegPred extends TestBase {
	
	static String email;
	static String date;
	static UserAudPred Pred1 = new UserAudPred();
	
	
	@Test
	public void regPred() throws Exception {
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
	}
	public static void reg_pred() throws Exception {
		date = Browser.what_date("post");
		Pred1.setDefault();
		Pred1.email="";
		email = app.tempMail.setMail("pred"+date);
		Pred1.email = email;
		Pred1.contactName=Pred1.contactName+date;
		app.landPred.open().btnZakazAudClick().fillTheFields(100, 100, 100, 100, 100, 100, 100, 100).fillTheCompany(Pred1).fillAccount(Pred1).chkAgree.click();
		app.anketaPred.btnZakaz.click();
		app.pay.btnGetBill.click();
		Thread.sleep(500);
		app.paid.btnDwnloadDocs.click();
		Thread.sleep(500);
		app.doc.dwnDownloadFile.sendKeys(Files.pdffile1);
		Thread.sleep(1000);
		
		app.doc.btnSend.click();
		app.cabPred.btnReloadStatus.click();
        
		writeObject(Pred1, "temp_pred.txt");
		app.cabPred.btnExit.click();
		Thread.sleep(500);
		
	}
}


