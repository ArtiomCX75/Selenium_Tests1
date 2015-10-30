package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import audHelpers.LoginHelper;

public class AudLandAud extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/auditors";
	
	public AudLandAud(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	public AudLandAud open(){
		wd.get(manager.BaseUrl+url);
		return new AudLandAud(manager);
	}
	
	public LoginHelper btnVhodClick(){
		wait(btnVhod).click();
		return new LoginHelper(manager);
	}
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/span")
	public WebElement lnkLogoHeader;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[1]/span")
	public WebElement lnkONas;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[2]/span")
	public WebElement lnkKakRab;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[3]/span")
	public WebElement lnkChtoPredl;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[4]/span")
	public WebElement lnkKogoIsch;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[5]/span")
	public WebElement lnkOtzivi;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[6]/span")
	public WebElement lnkVoprosi;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/div/span")
	public WebElement btnVhod;
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[1]/div/div/div/div[2]/a")
	public WebElement btnStartWork;
}