package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudLandPred extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/create";

	public AudLandPred(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	public AllPages open(){
		wd.get(manager.BaseUrl+url);
		return new AllPages(manager);
	}
	
	public AudLoginHelper btnVhodClick(){
		wait(btnVhod).click();
		return new AudLoginHelper(manager);
	}
	
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/span")
	public WebElement lnkLogoHeader;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[1]/span")
	public WebElement lnkONas;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[2]/span")
	public WebElement lnkKakPr;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[3]/span")
	public WebElement lnkKomanda;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[4]/span")
	public WebElement lnkVoprosy;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[5]/span")
	public WebElement lnkZakon;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[6]/span")
	public WebElement lnkUznatUr;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/header/div/span")
	public WebElement btnVhod;
	
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[1]/div/div/div/div/span[2]")
	public WebElement btnZakazAud;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[1]/label[1]/input")
	public WebElement fldUrSusch1;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[1]/label[2]/input")
	public WebElement fldUrSusch2;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[1]/label[3]/input")
	public WebElement fldUrSusch3;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[1]/label[4]/input")
	public WebElement fldUrSusch4;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[2]/label[1]/input")
	public WebElement fldUrSusch5;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[2]/label[2]/input")
	public WebElement fldUrSusch6;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[2]/label[3]/input")
	public WebElement fldUrSusch7;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/div/div[2]/label[4]/input")
	public WebElement fldUrSusch8;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div[1]/section[8]/div/form/button")
	public WebElement btnRassch;

}

/*
 @FindBy(xpath="")
	public WebElement ;
    
 */


