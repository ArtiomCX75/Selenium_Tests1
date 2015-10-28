package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudList extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="#/list";
	
	public AudList(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}

	public AudList open(){
		wd.get(manager.BaseUrl+url);
		return new AudList(manager);
	}
		
	@FindBy(xpath="html/body/div[1]/div/ng-view/header/div/div/a")
	public WebElement btnExit;
}