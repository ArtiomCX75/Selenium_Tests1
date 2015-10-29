package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudRegHelper extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	//private String url="/#/create";

	public AudRegHelper(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	public AudCabPred login(UserAudPred user) {
		String login=user.email;
		String pass=user.password;
		login(login, pass);
		return new AudCabPred(manager);
	}
	public AudBid login(UserAudAud user) {
		String login=user.login;
		String pass=user.password;
		login(login, pass);
		return new AudBid(manager);
	}
	private void login(String login, String pass){
		wait(fldLogin).sendKeys(login);
		wait(fldLogin).sendKeys(pass);
		wait(fldLogin).click();
	}
	
	public AllPages btnEscClick(){
		wait(btnEsc).click();
		return new AllPages(manager);
	}
	
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
}
	