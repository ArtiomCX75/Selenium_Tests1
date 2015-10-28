package diskTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CabinetPage extends AllPages {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/profile/invite";
	WebDriverWait wait;
	
	public CabinetPage(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
		wait = new WebDriverWait(wd, 5);
		
	}
	
	void wait(WebElement we){
		wait.until(ExpectedConditions.elementToBeClickable(we));
	}
	
	public LandingPage logout() throws Exception {
		wait(btnMenu);
		btnMenu.click();
		//wait.until(ExpectedConditions.visibilityOf(lnkLogout));
		wait(lnkLogout);
		lnkLogout.click();
		return new LandingPage(manager);
	}
	
	public CabinetPage open(){
		wd.get(manager.BaseUrl+url);
		return new CabinetPage(manager);
	}
	@FindBy(xpath="html/body/header/div/div[2]/div/div[1]/i")
	public WebElement btnMenu;
	@FindBy(xpath="html/body/header/div/div[2]/div/div[2]/div/ul/li[3]/a")
	public WebElement lnkLogout;
}
