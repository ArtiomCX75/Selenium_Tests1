package diskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import diskHelpers.Element;

public class DiskHeader {

	@SuppressWarnings("unused")
	
	private ApplicationManager manager;
	@SuppressWarnings("unused")
	private WebDriver wd;
	@SuppressWarnings("unused")
	private String url = "/profile/card";

	public DiskHeader(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;

	}

	public Element lnkLogo = new Element("html/body/header/div/div[1]");
	public Element lnkDiscounts = new Element("html/body/header/div/ul/li/a");
	public Element lnkCard = new Element("html/body/header/div/div[2]/a");
	public Element lnkAvatar = new Element("html/body/header/div/div[2]/div/div[1]/a/img");
	public Element btnMenu = new Element("html/body/header/div/div[2]/div/div[1]");
	public Element lnkProfile = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[1]/a");
	public Element lnkSettings = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[2]/a");
	public Element lnkExit = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[3]/a");

	public String getStatus(WebDriver d) {
		return d.findElement(By.xpath("html/body/header/div/div[2]/div/div[1]/div/p[2]")).getText();
	}
}
