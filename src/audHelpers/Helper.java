package audHelpers;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import audPages.AllPages;
import audPages.ApplicationManager;
import audPages.UserAudAud;
import audPages.UserAudPred;
import browser.Element;
import browser.Files;

public class Helper extends AllPages {
	private ApplicationManager manager;
	@SuppressWarnings("unused")
	private WebDriver wd;
	// private String url="/#/create";

	public Helper(ApplicationManager manager) {
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
		Thread.sleep(1500);
		manager.doc.btnSend.click();
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

	public void reg_aud(UserAudAud user, String semiemail) throws Exception {
		manager.landAud.open().btnStartWork.click();
		manager.anketa1.fillFields(user);
		manager.mail.setMail(semiemail);
		user=manager.mail.readMail_aud_reg(user);
		manager.landAud.open().btnVhodClick().login(user);
		manager.anketa2.fillFields(user);
		manager.cabPred.btnExit.click();
		writeObject(user, "temp_aud.txt");
		
	}

}
