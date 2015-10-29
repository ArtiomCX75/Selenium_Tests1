package audPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TempMail extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="https://temp-mail.ru/";
	
	public TempMail(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;
		PageFactory.initElements(this.wd, this);
	}
	
	public TempMail open(){
		wd.get(url);
		return new TempMail(manager);
	}
	
	
	@FindBy(xpath="html/body/div[1]/div/div/div[1]/ul/li[2]/a")
	public WebElement btnReload;
	@FindBy(xpath="html/body/div[1]/div/div/div[1]/ul/li[3]/a")
	public WebElement btnChange;
	@FindBy(xpath="html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[1]/div/input")
	public WebElement fldLogin;
	
	@FindBy(xpath="html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[3]/div[2]/button")
	public WebElement btnSubmitChange;
	@FindBy(xpath="html/body/header/div/div/div/div[2]/div/div[1]/div/input")
	public WebElement currentEmail;
	
	public String getEmail() throws Exception
	{
		Thread.sleep(500);
		return currentEmail.getAttribute("Value");
	}
	
	public  String setMail(String s) throws Exception  { // �������� �����
		open();
		Thread.sleep(500);
		btnChange.click();
		Thread.sleep(500);
		fldLogin.sendKeys(s);
		Thread.sleep(500);
		btnSubmitChange.click();
		Thread.sleep(500);
		btnReload.click();
		Thread.sleep(500);
		String email = getEmail();
		System.out.println("email= "+email);
		return email;
	}
}
/*

@FindBy(xpath="")
public WebElement ;
*/