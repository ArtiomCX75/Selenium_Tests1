package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudAnketa2 {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/auditors/registration";
	
	public AudAnketa2(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}

	public AudAnketa2 open(){
		wd.get(manager.BaseUrl+url);
		return new AudAnketa2(manager);
	}
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[1]/label/input")
	public WebElement fldDateOfBirth;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[2]/label/input")
	public WebElement fldSnils;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[3]/label/input")
	public WebElement fldPassNumber;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[4]/label/input")
	public WebElement fldCity;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[5]/label/input")
	public WebElement fldStreet;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[6]/label/input")
	public WebElement fldHouse;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[7]/label/input")
	public WebElement fldFlat;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[3]/div[1]/label/input")
	public WebElement fldBic;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[3]/div[4]/label/input")
	public WebElement fldBill;
	@FindBy(xpath="//input[starts-with(@type,'file')][starts-with(@accept,'im')]")
	public WebElement dwnDownloadFile;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[5]/label/span[1]")
	public WebElement chkAgree;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[6]")
	public WebElement btnSend;
}
