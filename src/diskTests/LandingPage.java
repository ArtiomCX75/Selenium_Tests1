package diskTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends AllPages {
	private ApplicationManager manager;
	private WebDriver wd;

	public LandingPage(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
	}
	public LoginPage loginlinkclick() {
		wd.get(manager.BaseUrl);
		wd.findElement(By.xpath("html/body/ui-view/div/div[1]/div[2]/div[1]/div/span[1]")).click();
		return new LoginPage(manager);
	}
	
}
