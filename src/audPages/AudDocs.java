package audPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AudDocs extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/documents";
	
	public AudDocs(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	public AudDocs open(){
		wd.get(manager.BaseUrl+url);
		return new AudDocs(manager);
	}
	
	@FindBy(xpath="//input[starts-with(@type,'file')][starts-with(@accept,'ap')]")
	public WebElement dwnDownloadFile;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[4]/div[1]/input")
	public WebElement fldSearch;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[3]/div/div/label")
	public WebElement chkAnyAuditor;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[4]/div[2]/div[1]")
	public WebElement chkAuditor1;
	//@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[5]/button")
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[5]/button[@class='documents__submit btn btn_green']")
	public WebElement btnSend;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div/a")
	public WebElement btnSendNext;

	
}


//<button class="documents__submit btn btn_green documents__submit_disabled" ng-class="{documents__submit_disabled: !auditInfo.files.length}" ng-disabled="!auditInfo.files.length" ng-hide="isLoad" disabled="disabled">Отправить на проверку</button>


//<button class="documents__submit btn btn_green" ng-class="{documents__submit_disabled: !auditInfo.files.length}" ng-disabled="!auditInfo.files.length" ng-hide="isLoad">Отправить на проверку</button>