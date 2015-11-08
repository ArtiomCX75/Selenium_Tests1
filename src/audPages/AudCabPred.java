package audPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import audHelpers.Element;

public class AudCabPred {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/#/cabinet";

	public AudCabPred(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;

	}

	public AudCabPred open() {
		wd.get(manager.BaseUrl + url);
		return new AudCabPred(manager);
	}
public String getStatus() {
		return wd.findElement(By.xpath("html/body/div[1]/div[1]/ng-view/div/div/div[2]/div[1]/div[2]")).getText();
	}

	public Element btnReloadStatus = new Element("html/body/div[1]/div/ng-view/div/div/div[2]/div[4]/span");
	public Element btnExit = new Element("html/body/div[1]/div/ng-view/header/div/div/a");
	public Element btnReWork1 = new Element("html/body/div[1]/div[1]/ng-view/div/div/div[2]/div[6]/span[2]");
	public Element fldReWork = new Element("html/body/div[1]/div[1]/ng-view/div/div/div[2]/div[7]/textarea");
	public Element btnReWork2 = new Element("html/body/div[1]/div[1]/ng-view/div/div/div[2]/div[8]/span");
	public Element btnAcceptWork = new Element("html/body/div[1]/div[1]/ng-view/div/div/div[2]/div[6]/span[1]");
	public Element fldPost = new Element("html/body/div[1]/div[1]/ng-view/div/div/div[2]/form/div/label/input");
	public Element btnSendPost = new Element("html/body/div[1]/div[1]/ng-view/div/div/div[2]/form/div/a");
}