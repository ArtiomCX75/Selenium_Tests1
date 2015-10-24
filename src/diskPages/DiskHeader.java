package diskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Element;
import browser.Element.type;

public class DiskHeader {
	public static Element lnkLogo = new Element("html/body/header/div/div[1]", type.lnk);
	public static Element lnkDiscounts = new Element("html/body/header/div/ul/li/a", type.lnk);
	public static Element lnkCard = new Element("html/body/header/div/div[2]/a", type.lnk);
	public static Element lnkAvatar = new Element("html/body/header/div/div[2]/div/div[1]/a/img", type.lnk);
	public static Element btnMenu = new Element("html/body/header/div/div[2]/div/div[1]", type.btn);
	public static Element lnkProfile = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[1]/a", type.lnk);
	public static Element lnkSettings = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[2]/a", type.lnk);
	public static Element lnkExit = new Element("html/body/header/div/div[2]/div/div[2]/div/ul/li[3]/a", type.lnk);
	public static String getStatus(WebDriver d){
		return d.findElement(By.xpath("html/body/header/div/div[2]/div/div[1]/div/p[2]")).getText();	
	}
}
