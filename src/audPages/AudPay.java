package audPages;

import org.openqa.selenium.WebDriver;


import browser.Element;

public class AudPay extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/create/pay";
	
	public AudPay(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
	
	}

	public AudPay open(){
		wd.get(manager.BaseUrl+url);
		return new AudPay(manager);
	}
	
	public Element btnGetBill = new Element("html/body/div[1]/div/ng-view/div/div/div/a");
}