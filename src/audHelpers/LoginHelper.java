package audHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import audPages.ApplicationManager;
import audPages.AudBid;
import audPages.AudCabPred;
import audPages.UserAudAud;
import audPages.UserAudPred;

public class LoginHelper {
	private ApplicationManager manager;
	private WebDriver wd;
	//private String url="/#/create";

	public LoginHelper(ApplicationManager manager) {
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
		manager.landPred.fldLogin.sendKeys(login);
		manager.landPred.fldPass.sendKeys(pass);
		manager.landPred.btnLoginSubmit.click();
	}
	
	public void btnEscClick(){
		manager.landPred.btnEsc.click();
		//return new AllPages(manager);
	}
	
}
	