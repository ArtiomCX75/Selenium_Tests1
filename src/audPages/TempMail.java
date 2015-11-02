package audPages;

import org.openqa.selenium.WebDriver;

import browser.Browser;
import browser.Element;


public class TempMail extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="https://temp-mail.ru/";
	
	public TempMail(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;

	}
	
	public TempMail open(){
		wd.get(url);
		return new TempMail(manager);
	}
	
	
	
	public Element btnReload=new Element("html/body/div[1]/div/div/div[1]/ul/li[2]/a");
	public Element btnChange=new Element("html/body/div[1]/div/div/div[1]/ul/li[3]/a");
	public Element fldLogin=new Element("html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[1]/div/input");
	public Element btnSubmitChange=new Element("html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[3]/div[2]/button");
	public Element currentEmail=new Element("html/body/header/div/div/div/div[2]/div/div[1]/div/input");


	
	public String getEmail() throws Exception
	{
		
	//	Thread.sleep(500);
		return currentEmail.getAttribute("Value");
	}
	
	public  String setMail(String s) throws Exception  { // создание почты
		open();
		btnChange.click();
		fldLogin.sendKeys(s);
		btnSubmitChange.click();
		btnReload.click();
		String email = getEmail();
		System.out.println("email= "+email);
		return email;
	}
}
/*

@FindBy(xpath="")
public WebElement ;
WebElement e = wait.until(ExpectedConditions.visibilityOf(By.id(locatorArg)));
*/