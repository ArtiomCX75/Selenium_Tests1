package audPages;

import org.openqa.selenium.WebDriver;

import audHelpers.Element;

public class AudAnketPred  {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="/#/create";
	
	public AudAnketPred(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		
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
	
		
	
	public Element fldNazvOrg = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[1]/label[1]/input"
);
	public Element fldContactFio = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[1]/label[2]/input"
);
	public Element fldVidDej = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[1]/label[3]/input"
);
	public Element fldGenDir = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[2]/label[1]/input"
);
	public Element fldUsualPhone = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[2]/label[2]/input"
);
	public Element fldPhone = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[1]/div[2]/label[3]/input"
);
	public Element fldEmail = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[1]/label/input"
);
	public Element fldPass = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[2]/label/input"
);
	public Element chkAgree = new Element(	"html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[2]/div/div/label/span[1]"
);
	
	public Element btnZakaz = new Element("html/body/div[1]/div/ng-view/div/div/div/form/div[2]/div[1]/div/button");
	
}
