package audPages;

import org.openqa.selenium.WebDriver;
import audHelpers.LoginHelper;
import browser.Element;

public class AudLandAud extends AllPages {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/#/auditors";

	public AudLandAud(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
	}

	public AudLandAud open() {
		wd.get(manager.BaseUrl + url);
		return new AudLandAud(manager);
	}

	public LoginHelper btnVhodClick() {
		btnVhod.click();
		return new LoginHelper(manager);
	}

	public Element lnkLogoHeader = new Element("html/body/div[1]/div/ng-view/div[1]/header/span");
	public Element lnkONas = new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[1]/span");
	public Element lnkKakRab = new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[2]/span");
	public Element lnkChtoPredl = new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[3]/span");
	public Element lnkKogoIsch = new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[4]/span");
	public Element lnkOtzivi = new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[5]/span");
	public Element lnkVoprosi = new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[6]/span");
	public Element btnVhod = new Element("html/body/div[1]/div/ng-view/div[1]/header/div/span");
	public Element btnStartWork = new Element("html/body/div[1]/div/ng-view/div[1]/section[1]/div/div/div/div[2]/a");
}