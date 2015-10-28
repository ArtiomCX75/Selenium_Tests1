package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudPaid extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/create/paid";
	
	public AudPaid(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}

	public AudPaid open(){
		wd.get(manager.BaseUrl+url);
		return new AudPaid(manager);
	}
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/a")
	public WebElement btnDwnloadDocs;
}