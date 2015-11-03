package diskPages;

import org.openqa.selenium.WebDriver;

import diskHelpers.Element;


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


	public  Element lnkLogin=new Element("html/body/ui-view/div/div/div[2]/div[1]/div/span[1]");
	public  Element lnkLogo=new Element("html/body/ui-view/div/div/div[1]");
	public  Element fldCodeReg=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[1]/ng-form/input-placeher/div/ng-transclude/input");
	public  Element fldSurname=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[2]/input-placeher/div/ng-transclude/input");
	public  Element fldName=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[3]/input-placeher/div/ng-transclude/input");
	public  Element fldMiddleName=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[4]/input-placeher/div/ng-transclude/input");
	public  Element fldEmail=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[5]/input-placeher/div/ng-transclude/input");
	public  Element fldPhone=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[6]/input-placeher/div/ng-transclude/input");
	public  Element fldBirthday=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[7]/input-placeher/div/ng-transclude/input");
	public  Element fldPass=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[8]/input-placeher/div/ng-transclude/input");
	public  Element chkAgree=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[9]/div/label/span");
	public  Element btnSubmit=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/button");
	
}
