package audPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

	public String BaseUrl;
	public WebDriver Driver;
	private AllPages all;
	public AudAnketa1 anketa1;
	public AudAnketa2 anketa2;
	public AudAnketPred anketaPred;
	public AudBid bid;
	public AudCabPred cabPred;
	public AudDocs doc;
	public AudLandAud landAud;
	public AudLandPred landPred;
	public AudList list;
	public AudPaid paid;
	public AudPay pay;

	public ApplicationManager(String baseUrl) {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BaseUrl=baseUrl;
		all=new AllPages(this);
		
		anketa1 = new AudAnketa1(this);
		anketa2 = new AudAnketa2(this);
		anketaPred = new AudAnketPred(this);
		bid = new AudBid(this);
		cabPred = new AudCabPred(this);
		doc = new AudDocs(this);
		landAud = new AudLandAud(this);
		landPred = new AudLandPred(this);
		list= new AudList(this);
		paid = new AudPaid(this);
		pay = new AudPay(this);
		
		
	}

}
