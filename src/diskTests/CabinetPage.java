package diskTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CabinetPage extends AllPages {
	private ApplicationManager manager;
	private WebDriver wd;

	public CabinetPage(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
	}
	public LandingPage logout() throws Exception {
		wd.findElement(By.xpath("html/body/header/div/div[2]/div/div[1]/i")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("html/body/header/div/div[2]/div/div[2]/div/ul/li[3]/a")).click();
		return new LandingPage(manager);
	}
	
}
