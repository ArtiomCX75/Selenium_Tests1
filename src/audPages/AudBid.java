package audPages;

import org.openqa.selenium.WebDriver;


import browser.Element;


public class AudBid {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/bid";
	
	public AudBid(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		
		}

	public AudBid open(){
		wd.get(manager.BaseUrl+url);
		return new AudBid(manager);
	}
	
	public Element dwnDownloadFile = new Element("//input[@type='file']");
	public Element btnSendOrder = new Element("html/body/div[1]/div/ng-view/div/div/div[2]/div[2]/button");
	public Element lnkZajavka = new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[1]");
	public Element lnkAudZakl = new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[2]");
	public Element chkVeryGood = new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[3]/div[1]/div[1]");
	public Element lnkAudRabDoc = new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[3");
	public Element btnSend = new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[5]/button");
	public Element btnSendNext = new Element("html/body/div[1]/div/ng-view/div/div[2]/div/a");
	public Element btnExit = new Element("html/body/div[1]/div/ng-view/header/div/div/a");
}