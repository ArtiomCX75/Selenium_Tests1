package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudCabPred {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/cabinet";
	
	public AudCabPred(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}

	public AudCabPred open(){
		wd.get(manager.BaseUrl+url);
		return new AudCabPred(manager);
	}
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div[2]/div[4]/span")
	public WebElement btnReloadStatus;
	@FindBy(xpath="html/body/div[1]/div/ng-view/header/div/div/a")
	public WebElement btnExit;
}
