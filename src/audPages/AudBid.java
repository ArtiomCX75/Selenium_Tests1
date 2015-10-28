package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AudBid {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/bid";
	
	public AudBid(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
		}

	public AudBid open(){
		wd.get(manager.BaseUrl+url);
		return new AudBid(manager);
	}
	
	@FindBy(xpath="//input[@type='file']")
	public WebElement dwnDownloadFile;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div[2]/div[2]/button")
	public WebElement btnSendOrder;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[1]")
	public WebElement lnkZajavka;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[2]")
	public WebElement lnkAudZakl;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div[3]/div[3]/div[1]/div[1]")
	public WebElement chkVeryGood;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[3")
	public WebElement lnkAudRabDoc;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[5]/button")
	public WebElement btnSend;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/a")
	public WebElement btnSendNext;
}