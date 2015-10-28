package diskTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "login";
	public UserDisc admin = new UserDisc("deadron@yandex.ru", "qwerty");

	public LoginPage(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;
		PageFactory.initElements(this.wd, this);
	}

	public LoginPage open() {
		wd.get(manager.BaseUrl + url);
		return new LoginPage(manager);
	}

	public CabinetPage login(UserDisc account) {

		fldUsername.sendKeys(account.email);
		fldPass.sendKeys(account.pass);
		btnSubmit.click();
		return new CabinetPage(manager);
	}

	public CabinetPage loginAdmin() {
		login(admin);
		return new CabinetPage(manager);
	}

	

	@FindBy(xpath = "html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input")
	public WebElement fldUsername;
	@FindBy(xpath = "html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input")
	public WebElement fldPass;
	@FindBy(xpath = "html/body/ui-view/div/div/div[4]/div/div/form/button")
	public WebElement btnSubmit;

}
