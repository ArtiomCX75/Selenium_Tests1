package audPages;

import org.openqa.selenium.WebDriver;

import audHelpers.Element;
import audHelpers.UserAudPred;

public class AdminOrder {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/admin#/main/auditors/reports";

	public AdminOrder(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;

	}

	public AdminOrder open() {
		wd.get(manager.BaseUrl + url);
		return new AdminOrder(manager);
	}

	public Element btnOk = new Element("html/body/div[1]/div[3]/md-dialog/div/button");
	public Element btnExit = new Element("html/body/div[1]/div/div[1]/div[2]/button");
	public Element fldSearch = new Element("html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/input");
	
	public AdminAud choseOrder(UserAudPred u) {
		Element.sl(2);
		fldSearch.sendKeys(u.orderNumber);
		Element.sl(2);
		Element el = new Element(".//div[@class='row'][div[1][contains(text(),'" + u.orderNumber + "')]]");
		//.//div[@class='row']/div[1][contains(text(),'405')]
		el.click();
		Element.sl(1);
		return new AdminAud(manager);
	}

	public AdminAud acceptOrder(UserAudPred u) {
		Element.sl(3);
		//Element btnAccept = new Element(".//div[//*[contains(text(),'" + u.orderNumber + "')]]/*/button[span[contains(text(),'�������')]]");
		Element btnAccept = new Element(".//div[contains(@class, 'panel-open')]//button[span[contains(text(),'��������')]]");
		// .//div[contains(@class, 'panel-open')]//button[span[contains(text(),'��������')]]
		btnAccept.click();
		Element.sl(3);
		btnOk.click();
		Element.sl(1);
		
		return new AdminAud(manager);
	}

	public AdminAud chooseAndAccept(UserAudPred u) {
		choseOrder(u);
		acceptOrder(u);
		return new AdminAud(manager);
	}
}
