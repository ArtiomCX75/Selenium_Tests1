package audPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import audHelpers.LoginHelper;
import audHelpers.Element;
import audHelpers.Mail;
import audHelpers.TempMail;
import audHelpers.TempMail2;
import audHelpers.Files;
import audHelpers.audHelper;

@SuppressWarnings("unused")
public class ApplicationManager {

	public String BaseUrl;
	public WebDriver Driver;
	public AudAnketa1 anketa1;
	public AudAnketa2 anketa2;
	public AudAnketPred anketaPred;
	public AudBid audbid;
	public AudCabPred cabPred;
	public AudDocs doc;
	public AudLandAud landAud;
	public AudLandPred landPred;
	public AudList list;
	public AudPaid paid;
	public AudPay pay;
	public TempMail tempMail;
	public Element el;
	public TempMail2 tempMail2;
	public Mail mail;
	
	public audHelper audHelper;
	public LoginHelper loginH;
	
	public ApplicationManager(String baseUrl) {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		Driver=new ChromeDriver();
		//Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BaseUrl=baseUrl;
		el = new Element(this);
		anketa1 = new AudAnketa1(this);
		anketa2 = new AudAnketa2(this);
		anketaPred = new AudAnketPred(this);
		audbid = new AudBid(this);
		cabPred = new AudCabPred(this);
		doc = new AudDocs(this);
		landAud = new AudLandAud(this);
		landPred = new AudLandPred(this);
		list= new AudList(this);
		paid = new AudPaid(this);
		pay = new AudPay(this);
		tempMail = new TempMail(this);
		tempMail2 = new TempMail2(this);
		loginH = new LoginHelper(this);
		audHelper = new audHelper(this);
		mail = this.tempMail;
		
		
	
		
	}

}
