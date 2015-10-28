package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudPay extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/create/pay";
	
	public AudPay(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}

	public AudPay open(){
		wd.get(manager.BaseUrl+url);
		return new AudPay(manager);
	}
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/a")
	public WebElement btnEbtnGetBillxit;
}