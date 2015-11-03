package diskPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import audHelpers.Files;
import diskHelpers.Helper;
import diskHelpers.Element;
import diskHelpers.Mail;
import diskHelpers.TempMail;
import diskHelpers.TempMail2;


@SuppressWarnings("unused")
public class ApplicationManager {

	public String BaseUrl;
	public WebDriver Driver;
	public TempMail tempMail;
	public Element el;
	public TempMail2 tempMail2;
	public Mail mail;
	
	public DiskCard card;
	public DiskHeader header;
	public DiskLand land;
	public DiskLogin login;
	public DiskProfile profile;
	public DiskReg reg;
	public DiskSettings settings;
	public Helper helper;
//	public DiskLand land;
//	public DiskLand land;
	
	public ApplicationManager(String baseUrl) {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		Driver=new ChromeDriver();
		//Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		BaseUrl=baseUrl;
		
		el = new Element(this);
		tempMail = new TempMail(this);
		tempMail2 = new TempMail2(this);
		mail = this.tempMail;
		
		card = new DiskCard(this);
		header = new DiskHeader(this);
		land = new DiskLand(this);
		login = new DiskLogin(this);
		profile = new DiskProfile(this);
		reg = new DiskReg(this);
		settings = new DiskSettings(this);
		helper = new Helper(this);
		
	
		
	}

}
