package com.example.tests;

import org.junit.BeforeClass;
import org.apache.commons.collections.functors.ChainedClosure;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.example.tests.Element.type;

public class Paral {

	@Test
	public void test() throws Exception {
		String server = Constants.urlAudTest;
		WebDriver wdr1 = Browser.on();
		WebDriver wdr2;
		WebDriver d = null;
		d=wdr1;
		
		d.manage().window().setPosition(new Point(2000, 0));
		d.manage().window().maximize();
		d=wdr1;
		AUD_Land_Pred.url.go(d, server);
		Browser.sl(3);
		wdr2=Browser.on();
		d=wdr2;
		AUD_Land_Aud.url.go(d, server);
		d=wdr1;
		d.get("http://google.com/");
		d=wdr2;
		d.get("http://yandex.ru/");
		
		
		Browser.sl(10);
		wdr1.quit();
		wdr2.quit();
		
		
	//	WebDriver dr = new ChromeDriver();
		// br.wd.findElement(By.xpath("html/body/div[1]/div/ng-view/div[1]/header/div/span")).click();
		// String
		// s="html/body/div[1]/div/ng-view/div[1]/section[1]/div/div/div/div/span[2]";
		// br.wd.findElement(By.xpath(s)).click();
		// br.click(s);
		// Element el = new Element(s, type.btn);
		// el.click_el();
	}
}
