package diskPages;

import org.openqa.selenium.WebDriver;

import diskHelpers.Element;



public class DiskLand {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "";

	public DiskLand(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}

	public DiskLand open() {
		wd.get(manager.BaseUrl + url);
		return new DiskLand(manager);
	}

	public DiskLogin loginlinkclick() {
		Element.sl(2);
		lnkLogin.click();
		Element.sl(0.2);
		return new DiskLogin(manager);
	}
	
	public  Element fldCodeReg=new Element("html/body/ui-view/div/div[1]/div[3]/form/div[1]/input-placeher/div/ng-transclude/input");
	public  Element btnCodeSubmit=new Element("html/body/ui-view/div/div[1]/div[3]/form/div[1]/button");
	public  Element lnkLogin=new Element("html/body/ui-view/div/div[1]/div[2]/div[1]/div/span[1]");
	
}
