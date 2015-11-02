package audPages;

import org.openqa.selenium.WebDriver;

import browser.Element;

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

	public Element btnReloadStatus = new Element("html/body/div[1]/div/ng-view/div/div/div[2]/div[4]/span");
	public Element btnExit = new Element("html/body/div[1]/div/ng-view/header/div/div/a");
}