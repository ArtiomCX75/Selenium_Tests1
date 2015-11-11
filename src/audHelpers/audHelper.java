package audHelpers;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.openqa.selenium.WebDriver;
import audPages.ApplicationManager;
import audPages.UserAudAud;
import audPages.UserAudPred;

public class audHelper {
	private ApplicationManager manager;
	@SuppressWarnings("unused")
	private WebDriver wd;
	// private String url="/#/create";

	public audHelper(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;

	}

	public void reg_pred(UserAudPred user) throws Exception {

		manager.landPred.open().btnZakazAudClick().fillTheFields(100, 100, 100, 100, 100, 100, 100, 100)
				.fillTheCompany(user).fillAccount(user).chkAgree.click();
		manager.anketaPred.btnZakaz.click();
		manager.pay.btnGetBill.click();
		manager.paid.btnDwnloadDocs.click();
		manager.doc.dwnDownloadFile.sendKeys(Files.pdffile1);
		Element.sl(5);
		manager.doc.btnSend.click();
		Element.sl(2);
		manager.cabPred.btnReloadStatus.click();
		writeObject(user, "temp_pred.txt");
		manager.cabPred.btnExit.click();

	}

	public void writeObject(Object obj, String s) throws Exception {
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}

	public void create_bid() {
		//
	}

	public void reg_aud(UserAudAud user) throws Exception {
		manager.landAud.open().btnStartWork.click();
		manager.anketa1.fillFields(user);
		manager.mail.setMail(user.semiEmail);
		user=manager.mail.readMail_aud_reg(user);
		manager.landAud.open().btnVhodClick().login(user);
		manager.anketa2.fillFields(user);
		manager.cabPred.btnExit.click();
		writeObject(user, "temp_aud.txt");
		
	}

	
}
