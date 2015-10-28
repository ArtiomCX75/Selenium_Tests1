package diskTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AllPages {
	private ApplicationManager manager;
	private WebDriver wd;
	
	
	AllPages() {
	
	}
	
	public AllPages(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	

}
