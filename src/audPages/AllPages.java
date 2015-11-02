package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllPages {
	@SuppressWarnings("unused")
	private ApplicationManager manager;
	private WebDriver wd;
	WebDriverWait wait;
	
	public AllPages() {
	
	}
	
	public AllPages(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
		wait = new WebDriverWait(wd, 10);
		
	}
	/*
	public WebElement wait(WebElement we){
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
	
		return we;
	}*/

	
}
