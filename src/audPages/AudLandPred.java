package audPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import audHelpers.LoginHelper;


public class AudLandPred extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/";
	public AudLandPred(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);		
	}
	
	public AudLandPred open(){
		wd.get(manager.BaseUrl+url);
		
		return new AudLandPred(manager);
	}
	
	public LoginHelper btnVhodClick(){
		wait(btnVhod).click();
		return new LoginHelper(manager);	
	}
	
	public AudLandPred btnZakazAudClick(){
		btnZakazAud.click();
		return new AudLandPred(manager);	
	}



public AudAnketPred fillTheFields(int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8){
		
		fillTheFields(Integer.toString(s1), Integer.toString(s2), Integer.toString(s3), Integer.toString(s4), Integer.toString(s5), Integer.toString(s6), Integer.toString(s7), Integer.toString(s8));
		return new AudAnketPred(manager);
	}

public AudAnketPred fillTheFields(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
	fldUrSusch1.sendKeys(s1);
	fldUrSusch2.sendKeys(s2);
	fldUrSusch3.sendKeys(s3);
    fldUrSusch4.sendKeys(s4);
    fldUrSusch5.sendKeys(s5);
    fldUrSusch6.sendKeys(s6);
    fldUrSusch7.sendKeys(s7);
    fldUrSusch8.sendKeys(s8);
    btnRassch.click();
	return new AudAnketPred(manager);
    
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
	
	
	@FindBy(xpath="html/body/div[4]/table/tbody/tr/td/div/div/form[1]/label[1]/input")
	public WebElement fldLogin;
	@FindBy(xpath="html/body/div[4]/table/tbody/tr/td/div/div/form[1]/label[2]/input")
	public WebElement fldPass;
	@FindBy(xpath="html/body/div[4]/table/tbody/tr/td/div/div/form[1]/input")
	public WebElement btnLoginSubmit;
	@FindBy(xpath="html/body/div[4]/table/tbody/tr/td/div/div/form[1]/span")
	public WebElement lnkVosstanParol;
	@FindBy(xpath="html/body/div[4]/table/tbody/tr/td/div/span[2]")
	public WebElement btnEsc;
	
	
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


