package audPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import browser.Element;


public class TempMail2 extends AllPages{
	private ApplicationManager manager;
	private WebDriver wd;
	private String url="http://www.mfsa.info/";
	
	public TempMail2(ApplicationManager manager) {
		this.manager=manager;
		this.wd=manager.Driver;

	}
	
	public TempMail2 open(){
		wd.get(url);
		return new TempMail2(manager);
	}
	
	
	
	public Element btnReload=new Element("");
	public Element btnChange=new Element("");
	public Element fldLogin=new Element("html/body/div[1]/div[3]/div/div[1]/center/div[2]/form/input[1]");
	public Element btnSubmitChange=new Element("html/body/div[1]/div[3]/div/div[1]/center/div[2]/form/input[2]");
	public Element currentEmail=new Element("");


	
	public String getEmail() throws Exception
	{
		
	//	Thread.sleep(500);
		//return currentEmail.getAttribute("Value");
		return manager.Driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/h2")).getText();
	}
	
	public  String setMail(String s) throws Exception  { // создание почты
		open();
		//btnChange.click();
		fldLogin.sendKeys(s);
		btnSubmitChange.click();
		
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