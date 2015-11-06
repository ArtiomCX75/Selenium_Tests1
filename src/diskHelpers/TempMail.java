package diskHelpers;

import static org.junit.Assert.assertFalse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import diskPages.ApplicationManager;
import diskPages.DiskReg;



public class TempMail implements Mail{
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
	
	
	

	
	public String getEmail(){
		return currentEmail.getAttribute("Value");
	}
	
	public  String setMail(String s){ // создание почты
		open();
		btnChange.click();
		fldLogin.sendKeys(s);
		btnSubmitChange.click();
		btnReload.click();
		String email = getEmail();
		System.out.println("email= "+email);
		return email;
	}

	
	/*public UserAudAud readMail_aud_reg(UserAudAud user) {
		//open();
		int i=0;
		while (manager.Driver.findElements(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).isEmpty()) {
			manager.tempMail.btnReload.click();
			i=i+1;
			Element.sl(1);
			if (i>3){
				System.err.println("there is not email for reg aud");
				assertFalse("there is not email for reg aud", true);
				}
		}
		wd.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).click();
		user.login = wd.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/p/span")).getText();
		user.password = wd.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/table/tbody/tr/td/table[2]/tbody/tr[8]/td[2]/p/span")).getText();
		System.out.println("login " + user.login + "  pass " + user.password);
		return user;
	}*/
	

	public Element btnReload=new Element("html/body/div[1]/div/div/div[1]/ul/li[2]/a");
	public Element btnChange=new Element("html/body/div[1]/div/div/div[1]/ul/li[3]/a");
	public Element fldLogin=new Element("html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[1]/div/input");
	public Element btnSubmitChange=new Element("html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[3]/div[2]/button");
	public Element currentEmail=new Element("html/body/header/div/div/div/div[2]/div/div[1]/div/input");

	
	public DiskReg readDiskRegMail() {
		int i=0;
		while (wd.findElements(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).isEmpty()) {
			manager.tempMail.btnReload.click();
			i=i+1;
			Element.sl(1);
			if (i>3){
				System.err.println("there is not email for reg disk");
				assertFalse("there is not email for reg disk", true);
				}
		}
		wd.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/table/tbody/tr/td[2]/a")).click();
		Element.sl(1);
		wd.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/div/div[2]/p[6]/a")).click();
		manager.land.btnCodeSubmit.click();
		return new DiskReg(manager);
		
	}

}

/*
@FindBy(xpath="")
public WebElement ;
WebElement e = wait.until(ExpectedConditions.visibilityOf(By.id(locatorArg)));
*/