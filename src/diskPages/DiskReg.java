package diskPages;

import org.openqa.selenium.WebDriver;

import diskHelpers.Element;
import diskHelpers.UserDisc;


public class DiskReg {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/signin";

	public DiskReg(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}

	public DiskReg open() {
		wd.get(manager.BaseUrl + url);
		return new DiskReg(manager);
	}

	public DiskProfile fillfields(UserDisc user) {
		fldPhone.sendKeys(user.phoneNumber);
		fldBirthday.sendKeys(user.birthDay);
		fldPass.sendKeys(user.password);
		chkAgree.click();
		btnSubmit.click();
		Element.sl(2);
		return new DiskProfile(manager);
	}
	public  Element lnkLogin=new Element("html/body/ui-view/div/div/div[2]/div[1]/div/span[1]");
	public  Element lnkLogo=new Element("html/body/ui-view/div/div/div[1]");
	public  Element fldCodeReg=new Element(".//input[contains(@ng-model,'cod')]");
	public  Element fldSurname=new Element(".//input[contains(@ng-model,'las')]");
	public  Element fldName=new Element(".//input[contains(@ng-model,'fir')]");
	public  Element fldMiddleName=new Element(".//input[contains(@ng-model,'secon')]");
	public  Element fldEmail=new Element(".//input[contains(@ng-model,'em')]");
	public  Element fldPhone=new Element(".//input[contains(@ng-model,'ph')]");
	public  Element fldBirthday=new Element(".//input[contains(@ng-model,'date')]");
	public  Element fldPass=new Element(".//input[contains(@ng-model,'pa')]");
	public  Element chkAgree=new Element(".//div[contains(@class, 'check')]/label/span");
	public  Element btnSubmit=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/button");

	
	
}
