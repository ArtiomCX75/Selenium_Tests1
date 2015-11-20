package diskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import diskHelpers.Element;
import diskHelpers.UserDisc;

public class DiskProfile   {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/profile/invite";

	public DiskProfile(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}

	public DiskProfile open() {
		wd.get(manager.BaseUrl + url);
		return new DiskProfile(manager);
	}


	public DiskLand logout() throws Exception {
		manager.helper.logout();
		Element.sl(1);
		return new DiskLand(manager);
	}
	
	public String getStatus(WebDriver d) {
	return wd.findElement(By.xpath("html/body/header/div/div[2]/div/div[1]/div/p[2]")).getText();
	}
	
	public DiskProfile invite(UserDisc user) {
		fldSurname.sendKeys(user.surName);
		fldName.sendKeys(user.name);
		fldMiddleName.sendKeys(user.middleName);
		fldEmailOrPhone.sendKeys(user.email);
		btnInvite.click();
		Element.sl(1);
		return new DiskProfile(manager);
	}
	
	public  Element fldSurname=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[1]/input-placeholder/div/ng-transclude/input");
	public  Element fldName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[2]/input-placeholder/div/ng-transclude/input");
	public  Element fldMiddleName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[3]/input-placeholder/div/ng-transclude/input");
	public  Element fldEmailOrPhone=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[4]/input-placeholder/div/ng-transclude/input");
	public  Element btnInvite=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[5]/button");
	
	
	
	
	public Element lnkLogo = new Element("html/body/header/div/div[1]");
	public Element lnkDiscounts = new Element("html/body/header/div/ul/li/a");
	public Element lnkConcurs = new Element("html/body/header/div/ul/li[3]/a");
	public Element lnkCard = new Element("html/body/header/div/div[2]/a");
	public Element lnkAvatar = new Element("html/body/header/div/div[2]/div/div[1]/a/img");
	
	public  Element btnMenu=new Element("html/body/header/div/div[2]/div/div[1]");
	public Element lnkProfile = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[1]/a");
	public Element lnkSettings = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[2]/a");
	public  Element lnkLogout=new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[3]/a");




	
	
}
