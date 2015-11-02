package diskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.OldElement;
import browser.OldElement.type;

public class DiskHeader {
	public static OldElement lnkLogo = new OldElement("html/body/header/div/div[1]", type.lnk);
	public static OldElement lnkDiscounts = new OldElement("html/body/header/div/ul/li/a", type.lnk);
	public static OldElement lnkCard = new OldElement("html/body/header/div/div[2]/a", type.lnk);
	public static OldElement lnkAvatar = new OldElement("html/body/header/div/div[2]/div/div[1]/a/img", type.lnk);
	public static OldElement btnMenu = new OldElement("html/body/header/div/div[2]/div/div[1]", type.btn);
	public static OldElement lnkProfile = new OldElement("html/body/header/div/div[2]/div/div[2]/div/ul/li[1]/a", type.lnk);
	public static OldElement lnkSettings = new OldElement("html/body/header/div/div[2]/div/div[2]/div/ul/li[2]/a", type.lnk);
	public static OldElement lnkExit = new OldElement("html/body/header/div/div[2]/div/div[2]/div/ul/li[3]/a", type.lnk);
	public static String getStatus(WebDriver d){
		return d.findElement(By.xpath("html/body/header/div/div[2]/div/div[1]/div/p[2]")).getText();	
	}
}
