package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudAnketa1 {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/questionnaire";
	
	public AudAnketa1(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	public AudAnketa1 open(){
		wd.get(manager.BaseUrl+url);
		return new AudAnketa1(manager);
	}
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[1]/label/input")
	public WebElement fldSurname;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[2]/label/input")
	public WebElement fldName;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[3]/label/input")
	public WebElement fldMiddlename;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[4]/label/input")
	public WebElement fldPhone;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[5]/label/input")
	public WebElement fldEmail;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[2]/div[1]/label/input")
	public WebElement fldNumberAt;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[2]/div[2]/label/input")
	public WebElement fldExp;
	@FindBy(xpath="//input[starts-with(@type,'file')][starts-with(@accept,'ap')]")
	public WebElement dwnDownloadFile;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[4]/label/span[1]")
	public WebElement chkAgr1;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[5]/label/span[1]")
	public WebElement chkAgr2;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[6]/button")
	public WebElement btnSend;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div[1]/a")
	public WebElement btnNext;
}

