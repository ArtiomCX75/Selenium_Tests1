package diskTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

	public String BaseUrl;
	public WebDriver Driver;
	public LoginPage loginpage;
	public CabinetPage cabinetpage;
	public LandingPage landingpage;
	//private AllPages all;

	public ApplicationManager(String baseUrl) {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BaseUrl=baseUrl;
		//all=new AllPages(this);
		landingpage=new LandingPage(this);
		loginpage=new LoginPage(this);
		cabinetpage=new CabinetPage(this);
		
		
	}

}
