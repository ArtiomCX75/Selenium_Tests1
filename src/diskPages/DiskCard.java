package diskPages;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import diskPages.ApplicationManager;
import diskHelpers.Element;

public class DiskCard {
	private ApplicationManager manager;
	private WebDriver wd;
	private String url = "/profile/card";

	public DiskCard(ApplicationManager manager) {
		this.manager = manager;
		this.wd = manager.Driver;

	}

	public DiskCard open() {
		wd.get(manager.BaseUrl + url);
		return new DiskCard(manager);
	}

	public DiskCard waitFor() {
		int i = 0;
		for (i = 0; i < 50; i = i + 1) {
			Element.sl(0.1);
			if (url.equals(wd.getCurrentUrl())) {
				break;
			}
		}
		if (i > 48) {
			System.err.println("\nwait for " + url);
			System.err.println("now is   " + wd.getCurrentUrl());
			assertFalse("url doesn't load", true);
		}
		System.out.println("url OK \n");
		return new DiskCard(manager);
	}
	
	

	public Element fldMoney = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input");
	public Element btnPay = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[1]/div[2]/button");
	public Element fldIndex = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div/div/input-placeher/div/ng-transclude/input");
	public Element fldRegion = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/input-placeher/div/ng-transclude/input");
	public Element fldCity = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/input-placeher/div/ng-transclude/input");
	public Element fldStreet = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/oi-select/div[1]/ul/li[2]/input");
	public Element fldHouse = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[4]/input-placeher/div/ng-transclude/input");
	public Element fldBuil = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[5]/input-placeher/div/ng-transclude/input");
	public Element fldFlat = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[6]/input-placeher/div/ng-transclude/input");
	public Element btnSendCard = new Element(
			"html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[7]/button");


}
