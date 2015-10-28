package diskTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AllPages {

	private ApplicationManager manager;
	private WebDriver wd;

	public LoginPage(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
	}
	public CabinetPage login(UserDisc account) {
		
		wd.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input")).sendKeys(account.username);
		wd.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input")).sendKeys(account.pass);
		wd.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/button")).click();
		return new CabinetPage(manager);
	}
	
}
