package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import audHelpers.LoginHelper;

public class AudAnketPred extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/create";
	
	public AudAnketPred(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}

	public AudAnketPred open(){
		wd.get(manager.BaseUrl+url);
		return new AudAnketPred(manager);
	}
	
	public AudAnketPred fillTheCompany(UserAudPred user){
		fldNazvOrg.sendKeys(user.orgName);
		fldContactFio.sendKeys(user.contactName);
		fldVidDej.sendKeys(user.vidDej);
		fldGenDir.sendKeys(user.genDir);
		fldUsualPhone.sendKeys(user.usualPhone);
		fldPhone.sendKeys(user.phoneNumber);
		return new AudAnketPred(manager);
	}
	public AudAnketPred fillAccount(UserAudPred user){
		fldEmail.sendKeys(user.email);
		fldPass.sendKeys(user.password);
		return new AudAnketPred(manager);
	}
	
		
	
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[1]/label[1]/input")
	public WebElement fldNazvOrg;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[1]/label[2]/input")
	public WebElement fldContactFio;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[1]/label[3]/input")
	public WebElement fldVidDej;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[2]/label[1]/input")
	public WebElement fldGenDir;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[2]/label[2]/input")
	public WebElement fldUsualPhone;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[2]/label[3]/input")
	public WebElement fldPhone;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[1]/label/input")
	public WebElement fldEmail;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[2]/label/input")
	public WebElement fldPass;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[2]/div/div/label/span[1]")
	public WebElement chkAgree;
	@FindBy(xpath="html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[1]/div/button")
	public WebElement btnZakaz;
	
}
