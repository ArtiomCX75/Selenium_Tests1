package audPages;

import org.openqa.selenium.WebDriver;

import audHelpers.Element;

public class AudList   {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "#/list";

	public AudList(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}

	public AudList open() {
		wd.get(manager.BaseUrl + url);
		return new AudList(manager);
	}

	public Element btnExit = new Element("html/body/div[1]/div/ng-view/header/div/div/a");
}