package audPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import audHelpers.LoginHelper;
import audHelpers.Helper;
import audHelpers.Helper;

public class ApplicationManager {

	public String BaseUrl;
	public WebDriver Driver;
	public AllPages all;
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
	
	
	public Helper regH;
	public Helper helper;
	public LoginHelper loginH;
	public ApplicationManager(String baseUrl) {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		Driver=new ChromeDriver();
		//Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		BaseUrl=baseUrl;
		all=new AllPages(this);
		
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
		loginH = new LoginHelper(this);
		regH = new Helper(this);
		helper = new Helper(this);
		
		
		
	}

}
