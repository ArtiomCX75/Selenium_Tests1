package audHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import audPages.AllPages;
import audPages.ApplicationManager;
import audPages.AudBid;
import audPages.AudCabPred;
import audPages.UserAudAud;
import audPages.UserAudPred;

public class Helper extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	//private String url="/#/create";

	public Helper(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	
}
	