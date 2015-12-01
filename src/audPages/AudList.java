package audPages;

import org.openqa.selenium.WebDriver;

import audHelpers.Element;
import audHelpers.UserAudPred;

public class AudList   {
	private ApplicationManager manager;
	private WebDriver wd;
	public String url = "#/list";

	public AudList(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}

	public AudList open() {
		wd.get(manager.BaseUrl + url);
		return new AudList(manager);
	}

	public Element btnExit = new Element("html/body/div[1]/div/ng-view/header/div/div/a");
	public Element btnCurBid = new Element(".//a[contains(text(),'������ � ������')]");

	public AudBid chooseBid(UserAudPred user) {
		Element.sl(1);
		String s1 = ".//div[3]/ul[./li/div/div/p[contains(text(),'";
		String s2 = user.contactName;
		String s3 = "')]]/li/div/div[2]/button";
		Element el = new Element(s1+s2+s3);
		el.click();
		Element.sl(1);
		return new AudBid(manager);
	}
	public AudBid chooseCurrent() {
		btnCurBid.click();
		Element.sl(1);
		return new AudBid(manager);
	}
	
	
	
}