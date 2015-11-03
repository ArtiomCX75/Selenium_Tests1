package diskPages;

import org.openqa.selenium.WebDriver;

import diskHelpers.Element;


public class DiskSettings {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/profile/settings";

	
	public DiskSettings(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}

	public DiskSettings open() {
		wd.get(manager.BaseUrl + url);
		return new DiskSettings(manager);
	}


	public  Element fldSurname=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[1]/input-placeher/div/ng-transclude/input");
	public  Element fldName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[2]/input-placeher/div/ng-transclude/input");
	public  Element fldMiddleName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[3]/input-placeher/div/ng-transclude/input");
	public  Element fldEmail=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[4]/input-placeher/div/ng-transclude/input");
	public  Element fldBirthday=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[5]/input-placeher/div/ng-transclude/input");
	public  Element fldPass=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[6]/input-placeher/div/ng-transclude/input");
	public  Element fldNewPass=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[7]/input-placeher/div/ng-transclude/input");
	public  Element btnSubmitChanges=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/button");
}
