package audTests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Point;
import audHelpers.Constants;
import audHelpers.Element;
import audPages.ApplicationManager;

@SuppressWarnings("unused")
public class TestBase {
	static String baseUrl;
	static ApplicationManager app;
	static ApplicationManager app2;
	
	@BeforeClass
	public static void before() throws Exception{
	baseUrl = Constants.urlAudTest;
	//app.mail = app.tempMail2;
	
	Element.t=0.18;
	//app2 = new ApplicationManager(baseUrl); 
	//app2.Driver.manage().window().setPosition(new Point(2000, 0));
	//app2.Driver.manage().window().maximize();	
	app = new ApplicationManager(baseUrl); 
	app.mail = app.tempMail;
	}
	
	@AfterClass
	public static void after() throws Exception{
		app.Driver.quit();
	//	app2.Driver.quit();
	}
}
/*
 * login(aud1) bool1=isCurrentPresent .//a[contains(text(), '������ � ������')]
 * bool2=isBidAvailable(Pred1)
 * 
 * String s1 = ".//div[3]/ul[./li/div/div/p[contains(text(),'"; String s2 =
 * user.contactName; String s3 = "')]]/li/div/div[2]/button";
 * wd.findElements(by.xpath(s1+s2+s3)).isEmpty()
 * 
 * if bool1==true {reg_aud()} if bool2==false { make_new bid; is status!=done {
 * reg_pred } Pred1 = UserAudPred.readLast(); Aud1 = UserAudAud.readLast();
 * this.makeDeal()
 */

/*
 * �������, ������� �� ����� ��������� ������ (����1), ����� � �����������(?),
 * ���� � �������(?) ������, ����������� �-��� ������������� � �������, ����
 * ���������. ����� ��� ������, ���� ��� �������, � �������������. ������ ������
 * ��, ��� �� �������
 */
