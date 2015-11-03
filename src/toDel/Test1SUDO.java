package toDel;



import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1SUDO {
  private WebDriver driver;
  @SuppressWarnings("unused")
private String baseUrl;
  //private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  String urlmail, urldisktest, urldiskprod, urlrktest, urlrkprod,adminmaildisk, adminmailrk, adminpassdisk, adminpassrk;
  
 @Before 
  public void setUp() throws Exception {
//	  System.setProperty("webdriver.chrome.driver", "E://eclipse//workspace//chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C://eclipse-java-mars-R-win32-x86_64//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//  baseUrl = "http://test.discounter-club.ru/";
	  baseUrl="http://test.discounter-club.ru/";
	  urlmail="https://temp-mail.ru/";
	  urldisktest="http://test.discounter-club.ru/";
	  urldiskprod="http://discounter-club.ru/";
	  urlrktest="http://92.255.204.112:2000/";
	  urlrkprod="http://92.255.204.112:200/";
	  adminmaildisk="deadron@yandex.ru";
	  adminmailrk="deadron@yandex.ru";
	  adminpassdisk="qwerty";
	  adminpassrk="12345";
	
   
  }
 /*
 @Test
 public void testEquals() {
     Assert.assertEquals(4, 2 + 2);
     Assert.assertTrue(4 == 2 + 2);
 }
 
 @Test
 public void testNotEquals() {
     Assert.assertFalse(5 == 2 + 3);
 }*/
  @Test
  public void test1() throws Exception {
	
	  
//	  int id0=1;
	  
	  
	 
	  String mail0s="ref4_10";
	  String mail0=mail0s+"@freeletter.me";
	  int id1=28;
	  int id2=29;
	  int id3=30;
	  
	  String mail1s="ref5_"+Integer.toString(id1);
	  String mail1=mail1s+"@freeletter.me";
	  
	  String mail2s="ref5_"+Integer.toString(id2);
	  String mail2=mail2s+"@freeletter.me";
	  
	  String mail3s="ref5_"+Integer.toString(id3);
	  String mail3=mail3s+"@freeletter.me";
	 
	 //
	  
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  
	  
	  mail0s="ref4_11";
	  mail0=mail0s+"@freeletter.me";
	  id1=31;
	  id2=32;
	  id3=33;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	  
	  
	
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  
	  
	  
	  mail0s="ref4_12";
	  mail0=mail0s+"@freeletter.me";
	  id1=34;
	  id2=35;
	  id3=36;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	  
	  
	
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  

	  
	  mail0s="ref4_13";
	  mail0=mail0s+"@freeletter.me";
	  id1=37;
	  id2=38;
	  id3=39;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  

	  mail0s="ref4_14";
	  mail0=mail0s+"@freeletter.me";
	  id1=40;
	  id2=41;
	  id3=42;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  

	  mail0s="ref4_15";
	  mail0=mail0s+"@freeletter.me";
	  id1=43;
	  id2=44;
	  id3=45;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  
	  

	  
	  mail0s="ref4_16";
	  mail0=mail0s+"@freeletter.me";
	  id1=46;
	  id2=47;
	  id3=48;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  

	  mail0s="ref4_17";
	  mail0=mail0s+"@freeletter.me";
	  id1=49;
	  id2=50;
	  id3=51;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  

	  mail0s="ref4_18";
	  mail0=mail0s+"@freeletter.me";
	  id1=52;
	  id2=53;
	  id3=54;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  
	  mail0s="ref4_19";
	  mail0=mail0s+"@freeletter.me";
	  id1=55;
	  id2=56;
	  id3=57;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  ///
	  

	  mail0s="ref4_20";
	  mail0=mail0s+"@freeletter.me";
	  id1=58;
	  id2=59;
	  id3=60;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	  
	  
	
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  
	  
	  
	  mail0s="ref4_21";
	  mail0=mail0s+"@freeletter.me";
	  id1=61;
	  id2=62;
	  id3=63;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	  
	  
	
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  

	  
	  mail0s="ref4_22";
	  mail0=mail0s+"@freeletter.me";
	  id1=64;
	  id2=65;
	  id3=66;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  

	  mail0s="ref4_23";
	  mail0=mail0s+"@freeletter.me";
	  id1=67;
	  id2=68;
	  id3=69;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  

	  mail0s="ref4_24";
	  mail0=mail0s+"@freeletter.me";
	  id1=70;
	  id2=71;
	  id3=72;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  
	  

	  
	  mail0s="ref4_25";
	  mail0=mail0s+"@freeletter.me";
	  id1=73;
	  id2=74;
	  id3=75;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	  
	  

	  mail0s="ref4_26";
	  mail0=mail0s+"@freeletter.me";
	  id1=76;
	  id2=77;
	  id3=78;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  

	  mail0s="ref4_27";
	  mail0=mail0s+"@freeletter.me";
	  id1=79;
	  id2=80;
	  id3=81;
	  
	  mail1s="ref5_"+Integer.toString(id1);
	  mail1=mail1s+"@freeletter.me";
	  
	  mail2s="ref5_"+Integer.toString(id2);
	  mail2=mail2s+"@freeletter.me";
	  
	  mail3s="ref5_"+Integer.toString(id3);
	  mail3=mail3s+"@freeletter.me";
	 
	  send_let(mail0, mail1);
	  activ_disk_and_pay(mail1, mail1s);
	  send_let(mail0, mail2);
	  activ_disk_and_pay(mail2, mail2s);
	  send_let(mail0, mail3);
	  activ_disk_and_pay(mail3, mail3s);
	
	  
	    
	  /*
	  login("ref4_1@freeletter.me", "12345", urldisktest);
	  sl(2);
	  driver.get(urldisktest+"profile/card");
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/div[2]/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/div[2]/input")).sendKeys("500");
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/button")).click();
	  sl(7);
	  driver.findElement(By.xpath(".//input[@name='phone']")).sendKeys("1234567890");
	  sl(1);
	  driver.findElement(By.xpath(".//input[@type='submit']")).click();
	  sl(2);
	  driver.findElement(By.xpath(".//input[@type='submit']")).click();
	  sl(3);
	  logout(urldisktest);
	  */
	  
	  
	  
	  /*
	   for (int i=62;i<82;i++)
	  {
		  String temp_mail;
		  temp_mail="ref5_"+Integer.toString(i)+"@freeletter.me";
		  pr(temp_mail);
		  create_rk_acc(temp_mail);
		  temp_mail="ref5_"+Integer.toString(i);
		  sl(1);
		  reg_rk_acc(temp_mail);
			
	  }
	  
	  */
	  
	  
	 // String data0 = what_date("0");
	  //System.out.println(data0);
	 // String data1 = what_date("1");
	//  data0="14_09_2015_11_36";//
	 // data1="11.09.2015";
	  //System.out.println(data1);
	  
	//  driver.get(urldisktest);
	//  sl(2);
	 // pr("dasf;ldsfh;ldfs;jld;fjs;jfsfds;jdfsdfs");
	//  Assert.assertEquals(4, 2 + 2);
	  //   Assert.assertTrue(4 == 2 + 2);
	    // Assert.assertFalse(5 == 2 + 3);
  
	  
	  
	  
	  
	
	  
	  
	  // Используем полученный emailAddress
	  // для входа в приложение
	 /* selenium.type("userID", emailaddress);
	  selenium.type("password", secretPassword);
	  selenium.click("loginButton");
	  selenium.waitForPageToLoad(timeOut);
	  Assert.assertTrue(selenium.isTextPresent("Добро пожаловать" +emailaddress), "Не удалось войти, используя " + */
	  
			  
  
	 
	  
	
	


  }	  

  public void create_rk_acc(String mail) throws Exception{
	  driver.get(urlrktest);
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/div[1]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/div[1]/input-placeholder/div/ng-transclude/input")).sendKeys(mail);
	  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/div[2]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/div[2]/input-placeholder/div/ng-transclude/input")).sendKeys("12345");
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/button")).click();
	  sl(2);
		
  }
  
  public void reg_rk_acc(String mail) throws Exception{
	  driver.get(urlmail);
	  driver.findElement(By.xpath(".//*[@id='click-to-change']")).click();
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='input_mail']")).clear();
	  driver.findElement(By.xpath(".//*[@id='input_mail']")).sendKeys(mail);	  
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='postbut']")).click();
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='click-to-refresh']/span")).click();
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='mails']/tbody/tr[1]/td[2]/a")).click();
	  sl(1);
	  driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/div/div[2]/div/p/a")).click();
	  sl(1);
  }
  
  
  
  public void activ_disk_and_pay(String tmail1, String tmail1s) throws Exception{
	  driver.get(urlmail);
	  driver.findElement(By.xpath(".//*[@id='click-to-change']")).click();
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='input_mail']")).clear();
	  driver.findElement(By.xpath(".//*[@id='input_mail']")).sendKeys(tmail1s);  
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='postbut']")).click();
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='click-to-refresh']/span")).click();
	  sl(1);
	  driver.findElement(By.xpath(".//*[@id='mails']/tbody/tr[1]/td[2]/a")).click();
	  sl(1);
	  driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/div/div[3]/div/div[2]/p[6]/a")).click();
	  sl(1);//
	  driver.findElement(By.xpath("html/body/ui-view/div/div[1]/div[3]/form/div[1]/button")).click();
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[5]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[5]/input-placeholder/div/ng-transclude/input")).sendKeys("11.11.1990"); 
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[6]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[6]/input-placeholder/div/ng-transclude/input")).sendKeys("12345"); 
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[7]/div/label/span")).click();
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div[2]/form/button")).click();
	  //payment
	  sl(2);
	  driver.get(urldisktest+"profile/card");
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/div[2]/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/div[2]/input")).sendKeys("500");
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/button")).click();
	  sl(7);
	  driver.findElement(By.xpath(".//input[@name='phone']")).sendKeys("1234567890");
	  sl(1);
	  driver.findElement(By.xpath(".//input[@type='submit']")).click();
	  sl(2);
	  driver.findElement(By.xpath(".//input[@type='submit']")).click();
	  sl(5);
	  logout(urldisktest);
	 // login(mail1, "12345", urldisktest);
	  sl(2);
  }
  
  public void send_let(String tmail0, String tmail1) throws Exception {
	  pr(tmail0+" send");
	  login(tmail0, "12345", urldisktest);
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[1]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[1]/input-placeholder/div/ng-transclude/input")).sendKeys("Фамилия");
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[2]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[2]/input-placeholder/div/ng-transclude/input")).sendKeys("Имя");
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[3]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[3]/input-placeholder/div/ng-transclude/input")).sendKeys("Отчество");
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[4]/input-placeholder/div/ng-transclude/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[4]/input-placeholder/div/ng-transclude/input")).sendKeys(tmail1);
	  pr("to "+tmail1);
	  sl(1);
	 // driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[5]/button")).click();
	  sudo_click(driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div[2]/div/div[3]/div[1]/div[2]/form/div/div[5]/button")));
	  sl(3);
	  logout(urldisktest);
	  sl(1);
	  
  }
  

  public boolean isElementPresent(String xp) {
      try {
          driver.findElement(By.xpath(xp));
          return true;
      } catch (NoSuchElementException e) {
          return false;
      }
  }

public static void sl(int s) throws InterruptedException {	//пауза в секундах
	  for (int i=s; i>0; i--, Thread.sleep(1000))  {
		 @SuppressWarnings("unused")
		int q=0;
	  	}
  	}
  
  public String what_date(String i) { //узнает дату
	  Date d = new Date();
	  SimpleDateFormat format1;
      if (i == "0") 
      {
    	  format1 = new SimpleDateFormat("dd_MM_yyyy_kk_mm"); //дата для почты
      }
      else {
    	  format1 = new SimpleDateFormat("dd.MM.yyyy"); //дата для поля "дата"
      }
      return format1.format(d);
	  
  }
  
  public void login(String mail, String pass, String url) throws Exception { //авторизация на дискаунтере и рк
	  if (url==urldisktest || url==urldiskprod)
	  {
	  driver.get(url);
	  driver.findElement(By.xpath("html/body/ui-view/div/div[1]/div[2]/div[1]/div/span[1]")).click();
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input")).sendKeys(mail);
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input")).sendKeys(pass);
	  driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/button")).click();
	  }
	  else {
		  if (url==urlrktest || url==urlrkprod)
		  {
			  driver.get(url);
			  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/div[1]/input-placeholder/div/ng-transclude/input")).sendKeys(mail);
			  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/div[2]/input-placeholder/div/ng-transclude/input")).sendKeys(pass);
			  driver.findElement(By.xpath("html/body/ui-view/section[1]/div/div/div/div/div/form/button")).click();
			  
		  }
		  else {
			  System.out.println("Не найден URL="+url);
		  }
	  }
	  sl(2);
  }
  
  public void logout(String url) throws Exception { //разлогин на дискаунтере и рк
	  if (url==urldisktest || url==urldiskprod)
	  {
		  driver.get(url+"profile/invite");
		  sl(1);
		  driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]")).click();
		  sl(1);
		  driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/div/ul/li[3]/a")).click();
	  }
	  else {
		  if (url==urlrktest || url==urlrkprod)
		  {
			  driver.get(url+"profile/mailing");
			  sl(1);
			  driver.findElement(By.xpath("html/body/div[1]/ng-include/div/div/div[1]/p")).click();
			  sl(1);
			  driver.findElement(By.xpath("html/body/div[1]/ng-include/div/div/div[2]/div/ul/li[3]/a/span")).click();
			  
		  }
		  else {
			  System.out.println("Не найден URL="+url);
		  }
	  }
  }
  
 
public String create_mail(String s) {	//создание почты

	
      //System.out.println(m1); 
      driver.get(urlmail);
      driver.findElement(By.xpath(".//*[@id='click-to-change']")).click();
      driver.findElement(By.xpath(".//*[@id='input_mail']")).sendKeys(s);
      driver.findElement(By.xpath(".//*[@id='postbut']")).click();
      driver.findElement(By.xpath(".//*[@id='click-to-refresh']")).click();
      String mailbox=driver.findElement(By.xpath(".//*[@id='mail']")).getAttribute("value");
	  return mailbox;
  }
	  
public void sudo_sendkeys(WebElement el, String s ) {
	Actions actions = new Actions(driver);
	actions.moveToElement(el);
	actions.click();
	actions.sendKeys(s);
	actions.build().perform();
	}

public void sudo_click(WebElement el) {
	Actions actions = new Actions(driver);
	actions.moveToElement(el);
	actions.click();
	actions.build().perform();
	}

public void create_new_mail_by_admin(String url, String topic, String text) throws Exception
{
driver.get(url+"/admin");
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/h1/a")).click();
sl(1);
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/input-placeholder/div/ng-transclude/input")).sendKeys(topic);
sl(1);
sudo_sendkeys(driver.findElement(By.xpath("(.//div[contains(@id,'ta')]/p)[1]")), text);
sl(3);
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div[3]/button[1]")).click();
sl(1);
}

public void check_status_max(String url, String d1,String d2,String topic)  throws Exception
{
d2="15.09.2016";
driver.get(url+"/admin");
sl(1);
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[1]/div[1]/datepicker/input")).clear();
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[1]/div[1]/datepicker/input")).sendKeys(d1);
sl(1);
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[1]/div[2]/datepicker/input")).clear();
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[1]/div[2]/datepicker/input")).sendKeys(d2);
sl(1);
driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[1]/button")).click();
sl(3);
		  
Boolean q5=isElementPresent("html/body/ui-view/ui-view/div/ui-view/div/div/div[2]/ul/li/div/span[2]/a[contains(text(),'"+topic+"')]");
String q6=q5.toString();

if (q6.equals("true"))
{

	  int sec=0;
	  int min=0;
	  
	 			 
	  System.out.println("start "+what_date("0"));
	  while ((driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[2]/ul/li[div/span[2]/a[contains(text(),'"+topic+"')]]/div/span[6]")).getText()).equals("В процессе")) 
	  {			 
		  
		  String q1=driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[2]/ul/li[div/span[2]/a[contains(text(),'"+topic+"')]]/div/span[6]")).getText();
		  System.out.println("статус "+q1+" - "+Integer.toString(min)+" минут "+Integer.toString(sec)+" секунд");
		  if (sec>59)
		  {
			  sec=sec-60;
			  min=min+1;
		  }
		  driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[1]/button")).click();
		  sec=sec+5;
		  sl(5);
	  	  
	  	  }
	  if ((driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[2]/ul/li[div/span[2]/a[contains(text(),'"+topic+"')]]/div/span[6]")).getText()).equals("Завершена")) 
	  {
		  String q1=driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[2]/ul/li[div/span[2]/a[contains(text(),'"+topic+"')]]/div/span[6]")).getText();
		  System.out.println("статус "+q1);
		  System.out.println("end "+what_date("0"));
	  }
	  else{
		  String q1=driver.findElement(By.xpath("html/body/ui-view/ui-view/div/ui-view/div/div/div[2]/ul/li[div/span[2]/a[contains(text(),'"+topic+"')]]/div/span[6]")).getText();
		  System.out.println("Еррор!!!!!! статус "+q1);		  
	  		}
	  
	  
	  sl(1);
	  
	}
else {
	System.out.println("элемент не найден");
}

  } 

public void test_pay (String email, String url) throws Exception
{
	  login(email, "12345", url);
	  sl(2);
	  driver.get(url+"profile/card");
	  sl(1);
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/div[2]/input")).clear();
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/div[2]/input")).sendKeys("500");
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div/div[3]/div[1]/div[2]/button")).click();
	  sl(3);
	  driver.findElement(By.xpath(".//input[@name='phone']")).sendKeys("1234567890");
	  sl(1);
	  driver.findElement(By.xpath(".//input[@type='submit']")).click();
	  sl(2);
	  driver.findElement(By.xpath(".//input[@type='submit']")).click();
	  sl(5);
	  logout(url);
}


  

public void test(String email, String topic) throws Exception {
	 login(email, "12345", urlrkprod);
	  driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/section/div/div[2]/div/ul/li[p[contains(text(),'"+topic+"')]]")).click();
	//  System.out.println(driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/section/div/div[2]/div/ul/li[p[contains(text(),'"+topic+"')]]")).getText());
	  String who;
	  who=driver.findElement(By.xpath("html/body/ui-view/div/ui-view/div/div/div[2]/div/h5")).getText();
	  who=who.substring(13);	  
	  System.out.println(email+">"+who);
	  sl(1);
	  logout(urlrkprod);
	  sl(3);
}

public void pr(String s) { //вывод строки на экран
	System.out.println(s);
}

public void sql(String sql)
{// Create a variable for the connection string.
String connectionUrl = "jdbc:sqlserver://192.168.0.105:1433;" +
   "databaseName=Discounter;user=sa;password=12345";

// Declare the JDBC objects.
Connection con = null;
Statement stmt = null;
ResultSet rs = null;

try {
   // Establish the connection.
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   con = DriverManager.getConnection(connectionUrl);

   // Create and execute an SQL statement that returns some data.
   stmt = con.createStatement();
   rs = stmt.executeQuery(sql);

   // Iterate through the data in the result set and display it.
 /*  while (rs.next()) {
      System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
   }*/
}

// Handle any errors that may have occurred.
catch (Exception e) {
   e.printStackTrace();
}
finally {
   if (rs != null) try { rs.close(); } catch(Exception e) {}
   if (stmt != null) try { stmt.close(); } catch(Exception e) {}
   if (con != null) try { con.close(); } catch(Exception e) {}
}
}

/////////////////////////////////////////////////////////////////////////
 	@After
  public void tearDown() throws Exception {
	  sl(3);
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
  

  

