package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import audPages.AllPages;
import audPages.ApplicationManager;

public class Element extends AllPages {
	public String xp;
	private static WebDriver wd;
	Double t = 0.50;
	@SuppressWarnings("unused")
	private ApplicationManager manager;

	public Element(String s) {
		this.xp = s;
		
	}

	public Element(ApplicationManager manager) {
		this.manager = manager;
		wd = manager.Driver;
		
	}

	public void click(){
		
			Browser.sl(t);
		
		while (wd.findElements(By.xpath(xp)).isEmpty()) {
			try {
				System.out.println("sleep............");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		wd.findElement(By.xpath(xp)).click();
	}

	public void clear() {
		wd.findElement(By.xpath(xp)).clear();
	}

	public String getTagName() {
		return wd.findElement(By.xpath(xp)).getTagName();
	}

	public String getText() {
		return wd.findElement(By.xpath(xp)).getText();
	}

	public boolean isDisplayed() {
		return wd.findElement(By.xpath(xp)).isDisplayed();
	}

	public boolean isEnabled() {
		return wd.findElement(By.xpath(xp)).isEnabled();
	}

	public boolean isSelected() {
		return wd.findElement(By.xpath(xp)).isSelected();
	}

	public void sendKeys(CharSequence... arg0) {
		Browser.sl(t);
		wd.findElement(By.xpath(xp)).sendKeys(arg0);
		
	}

	public void submit() {
		wd.findElement(By.xpath(xp)).submit();

	}

	public String getAttribute(String arg0) {
		return wd.findElement(By.xpath(xp)).getAttribute(arg0);
	}

	/*
	 * @Override public <X> X getScreenshotAs(OutputType<X> arg0) throws
	 * WebDriverException { // Auto-generated method stub return null; }
	 * 
	 * public WebElement findElement(By arg0) { // Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public List<WebElement> findElements(By arg0) { //
	 * Auto-generated method stub return null; }
	 * 
	 * @Override
	 * 
	 * 
	 * @Override public String getCssValue(String arg0) { // Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public Point getLocation() { // Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public Dimension getSize() { // Auto-generated method stub
	 * return null; }
	 * 
	 * 
	 */
}
