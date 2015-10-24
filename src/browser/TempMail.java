package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Element.type;

public class TempMail {
	public static Element url = new Element("https://temp-mail.ru/");
	public static Element btnReload=new Element("html/body/div[1]/div/div/div[1]/ul/li[2]/a",type.btn);
	public static Element btnChange=new Element("html/body/div[1]/div/div/div[1]/ul/li[3]/a",type.btn);
	public static Element fldLogin=new Element("html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[1]/div/input",type.fld);
	public static Element btnSubmitChange=new Element("html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/form/div[3]/div[2]/button",type.btn);
	public static String getEmail(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/header/div/div/div/div[2]/div/div[1]/div/input")).getAttribute("Value");
	}
	
	public static String setMail(WebDriver driver, String s) throws Exception { // создание почты
		TempMail.url.gt(driver);
		TempMail.btnChange.click(driver);
		TempMail.fldLogin.type(driver, s);
		TempMail.btnSubmitChange.click(driver);
		TempMail.btnReload.click(driver);
		String email = TempMail.getEmail(driver);
		System.out.println("email= "+email);
		return email;
	}
}
