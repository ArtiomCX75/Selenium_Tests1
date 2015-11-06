package diskPages;

import org.openqa.selenium.WebDriver;

import diskHelpers.Element;
import diskHelpers.UserDisc;


public class DiskLogin {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/login";

	public DiskLogin(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;	
	}

	public DiskLogin open() {
		wd.get(manager.BaseUrl + url);
		return new DiskLogin(manager);
	}
	
	public DiskProfile login(UserDisc user) {
		fldEmail.sendKeys(user.email);
		fldPass.sendKeys(user.password);
		btnSubmitLogin.click();
		Element.sl(1);
		return new DiskProfile(manager);
	}
										
	public Element fldEmail=new Element("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input");
	public Element fldPass=new Element("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input");
	public Element btnSubmitLogin=new Element("html/body/ui-view/div/div/div[4]/div/div/form/button");
	public Element lnkRecPass=new Element("html/body/ui-view/div/div/div[4]/div/div/form/a");
	public Element lnkReg=new Element("html/body/ui-view/div/div/div[2]/div[1]/div/span[2]");
	public Element lnkLogo=new Element("html/body/ui-view/div/div/div[1]");
	

}
