package diskTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllPages {
	private ApplicationManager manager;
	private WebDriver wd;
	WebDriverWait wait;
	
	AllPages() {
	
	}
	
	public AllPages(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
		wait = new WebDriverWait(wd, 5);
	}
	
	WebElement wait(WebElement we){
		wait.until(ExpectedConditions.elementToBeClickable(we));
		return we;
	}

}
