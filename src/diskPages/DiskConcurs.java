package diskPages;


import org.openqa.selenium.WebDriver;

import diskHelpers.Element;

public class DiskConcurs{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/profile/invite";

	public  DiskConcurs(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		
	}
	
	public DiskConcurs open() {
		wd.get(manager.BaseUrl + url);
		return new DiskConcurs(manager);
	}
	public  Element btnTakePart=new Element("html/body/ui-view/div/ui-view/div/div[1]/div[2]/div/button");
	public  Element dwnPhoto=new Element(".//*/input");
	public  Element btnSendPhoto=new Element(".//*/button[contains(text(),'Отправить')]");
	//public  Element btnEsc=new Element("html/body/div[2]/div[2]/span");
}
