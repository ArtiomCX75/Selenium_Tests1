package audPages;

import org.openqa.selenium.WebDriver;

import audHelpers.Element;

public class AudPaid   {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/#/create/paid";

	public AudPaid(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}

	public AudPaid open() {
		wd.get(manager.BaseUrl + url);
		return new AudPaid(manager);
	}

	public Element btnDwnloadDocs = new Element("html/body/div[1]/div/ng-view/div/div/div/a[contains(text(),'Перейти')]");
}