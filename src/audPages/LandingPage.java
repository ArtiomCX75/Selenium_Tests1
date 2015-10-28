package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AllPages {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="";

	
	public LandingPage(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	public LoginPage loginlinkclick() {
		open();
		lnkLogin.click();
		return new LoginPage(manager);
	}
	public LandingPage open(){
		wd.get(manager.BaseUrl+url);
		return new LandingPage(manager);
	}
	
	@FindBy(xpath="html/body/ui-view/div/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement lnkLogin;
}
