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

	public AdminAud choseOrder(UserAudPred u) {
		Element.sl(1);
		Element el = new Element(".//div[contains(text(),'" + u.orderNumber + "')]");
		el.click();
		Element.sl(1);
		return new AdminAud(manager);
	}

	public AdminAud acceptOrder(UserAudPred u) {
		Element.sl(1);
		//Element btnAccept = new Element(".//div[//*[contains(text(),'" + u.orderNumber + "')]]/*/button[span[contains(text(),'добрить')]]");
		Element btnAccept = new Element(".//div[//*[contains(text(),'" + u.orderNumber + "')]]/*/button[1]");
		btnAccept.click();
		Element.sl(3);
		btnOk.click();
		Element.sl(1);
		
		return new AdminAud(manager);
	}

	public AdminAud chooseAndAccept(UserAudPred u) {
		choseOrder(u);
		acceptOrder(u);
		btnExit.click();
		return new AdminAud(manager);
	}
}
