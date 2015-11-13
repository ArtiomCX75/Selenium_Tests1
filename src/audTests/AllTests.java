package audTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
//@SuiteClasses({ Test_Reg_Aud.class, Test_Reg_Pred.class })
@Suite.SuiteClasses({
TestRegAud.class, 
TestRegPred.class,
TestAuth.class,
TestRecPass.class,
TestDeal.class

})
public class AllTests {
}
/*
 * // Google's search is rendered dynamically with JavaScript. // Wait for the
 * page to load, timeout after 10 seconds (new WebDriverWait(driver,
 * 10)).until(new ExpectedCondition<Boolean>() { public Boolean apply(WebDriver
 * d) { return d.getTitle().toLowerCase().startsWith("cheese!"); } });
 * 
 * 
 * public void safeClick(String elementLocator) { WebElement webElement =
 * getDriver().findElement(By.XXXX(elementLocator)); if(webElement != null) {
 * selenium.click(elementLocator); } else { // ���������� TestNG API ���
 * ����������� Reporter.log("Element: " +elementLocator+
 * ", is not available on page - " + getDriver().getUrl()); } }
 *  
 * 
 * 
 * public static File captureElementBitmap(WebDriver, driver, WebElement
 * element) throws Exception { // ������ �������� �������� File screen =
 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // �������
 * ��������� BufferedImage ��� ������ � ������������ BufferedImage img =
 * ImageIO.read(screen); // �������� ������� �������� int width =
 * element.getSize().getWidth(); int height = element.getSize().getHeight(); //
 * ������� ������������ (Rectangle) � ��������� �������� Rectangle rect = new
 * Rectangle(width, height); // �������� ���������� �������� Point p =
 * element.getLocation(); // �������� ����������� �������� �� ������ �����������
 * BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width,
 * rect.height); // �������������� File screen ImageIO.write(dest, "png",
 * screen); // ���������� File c ������������ �������� return screen; }
 *  
 * 
 */
