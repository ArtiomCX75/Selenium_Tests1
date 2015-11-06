package diskHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import diskPages.ApplicationManager;


//public class TempMail2 implements Mail{
	public class TempMail2 {	
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
	
	
	
	public Element btnReload=new Element("html/body/div[1]/div[3]/div/div[1]/center/div[1]/form/input[2]");
	//public Element btnChange=new Element("");
	public Element fldLogin=new Element("html/body/div[1]/div[3]/div/div[1]/center/div[2]/form/input[1]");
	public Element btnSubmitChange=new Element("html/body/div[1]/div[3]/div/div[1]/center/div[2]/form/input[2]");
	public Element currentEmail=new Element("");


	
	public String getEmail(){
		return manager.Driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[1]/h2")).getText();
	}
	
	public  String setMail(String s) { // создание почты
		open();
		//btnChange.click();
		fldLogin.sendKeys(s);
		btnSubmitChange.click();
		
		String email = getEmail();
		System.out.println("email= "+email);
		return email;
	}

/*	public UserAudAud readMail_aud_reg(UserAudAud user) {
		//open();
		while (manager.Driver.findElements(By.xpath("html/body/div[1]/div[3]/div/div/div[4]/table/tbody/tr[3]")).isEmpty()) {
			btnReload.click();
			int i=0;
			Element.sl(1);
			i=i+1;
			if (i>3){
				System.err.println("there is not email for reg aud");
				assertFalse("there is not email for reg aud", true);
				}
		}
		wd.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div[4]/table/tbody/tr[3]")).click();
		user.login = wd.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/table[2]/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/p/span")).getText();
		user.password = wd.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/table[2]/tbody/tr/td/table[2]/tbody/tr[8]/td[2]/p/span")).getText();
		System.out.println("login " + user.login + "  pass " + user.password);
		return user;
	}*/
}
/*

@FindBy(xpath="")
public WebElement ;
WebElement e = wait.until(ExpectedConditions.visibilityOf(By.id(locatorArg)));
*/