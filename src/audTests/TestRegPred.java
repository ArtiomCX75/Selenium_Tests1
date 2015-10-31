
package audTests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import audPages.AudAnketPred;
import audPages.AudCabPred;
import audPages.AudDocs;
import audPages.AudLandPred;
import audPages.AudPaid;
import audPages.AudPay;
import audPages.TempMail;
import audPages.UserAudPred;
import browser.Browser;
import browser.Constants;
import browser.Files;
import diskTests.AllPages;

public class TestRegPred extends TestBase {
	
	static String email;
	static String date;
	static UserAudPred Pred1 = new UserAudPred();
	
	
	@Test
	public void regPred() throws Exception {
		reg_pred();
		/*reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();
		reg_pred();*/
	}
	public static void reg_pred() throws Exception {
		date = Browser.what_date("post");
		Pred1.setDefault();
		Pred1.email="";
		email = app.tempMail.setMail("pred"+date);
		Pred1.email = email;
		Pred1.contactName=Pred1.contactName+date;
		//Thread.sleep(100);
		app.landPred.open().btnZakazAudClick().fillTheFields(100, 100, 100, 100, 100, 100, 100, 100).fillTheCompany(Pred1).fillAccount(Pred1).chkAgree.click();
		app.anketaPred.btnZakaz.click();
		app.pay.btnGetBill.click();
		Thread.sleep(500);
		app.paid.btnDwnloadDocs.click();
		Thread.sleep(1000);
		app.doc.dwnDownloadFile.sendKeys(Files.pdffile1);
		Thread.sleep(1000);
		
		app.doc.btnSend.click();
		app.cabPred.btnReloadStatus.click();
        
		writeObject(Pred1, "temp_pred.txt");
		app.cabPred.btnExit.click();
		//Thread.sleep(500);
		
	}
}

/*
 // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
        
        
        

public void safeClick(String elementLocator) {
        WebElement webElement = getDriver().findElement(By.XXXX(elementLocator));
        if(webElement != null) {
                selenium.click(elementLocator);
        } else {
                // Используем TestNG API для логирования
                Reporter.log("Element: " +elementLocator+ ", is not available on page - "
                                + getDriver().getUrl());
        }
}
        
        
     
        
        
        public static File captureElementBitmap(WebDriver, driver, WebElement element) throws Exception {
    // Делаем скриншот страницы 
    File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    // Создаем экземпляр BufferedImage для работы с изображением
    BufferedImage img = ImageIO.read(screen);
    // Получаем размеры элемента
    int width = element.getSize().getWidth();
    int height = element.getSize().getHeight();
    // Создаем прямоуголник (Rectangle) с размерами элемента
    Rectangle rect = new Rectangle(width, height);
    // Получаем координаты элемента
    Point p = element.getLocation();
    // Вырезаем изображенеи элемента из общего изображения
    BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);
    // Перезаписываем File screen
    ImageIO.write(dest, "png", screen);
    // Возвращаем File c изображением элемента
    return screen;
}











        
        
        
        
        
        
        
        
        */
