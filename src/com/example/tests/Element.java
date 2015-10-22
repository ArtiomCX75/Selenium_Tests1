package com.example.tests;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Element {
	private double t = 0.0;
	public String adres;
	public type mytype;
	public int id;
	private static int counter = 0;

	Element(String s1) {
		adres = s1;
		mytype = type.url;
		id = counter;
		counter++;
	}

	Element(String s1, type s2) {
		adres = s1;
		mytype = s2;
		id = counter;
		counter++;
	}

	enum type {
		btn, lnk, chk, dwn, fld, url

	}

	public void click(WebDriver driver) throws Exception {

		click(driver, adres);
	}

	private void click(WebDriver driver, String adr) throws Exception {
		Browser.sl(t);
		driver.findElement(By.xpath(adr)).click();
		Browser.sl(t);
	}

	///
	public void type(WebDriver driver, String s) throws Exception {
		type(driver, adres, s);

	}

	public void type(WebDriver driver, int i) throws Exception {
		type(driver, adres, Integer.toString(i));

	}

	private void type(WebDriver driver, String adr, String s) throws Exception {
		Browser.sl(t);
		driver.findElement(By.xpath(adr)).sendKeys(s);
		//Browser.sl(t);
	}

	///
	public void load(WebDriver driver, String s) throws Exception {
		load(driver, adres, s);

	}

	private void load(WebDriver driver, String adr, String s) throws Exception {
		Browser.sl(t);
		driver.findElement(By.xpath(adr)).sendKeys(s);
		Browser.sl(0.5);
	}

	///
	public void go(WebDriver driver, String server) throws Exception {
		String adresnew=server+adres;
		get(driver, adresnew);

	}
	public void go(WebDriver driver) throws Exception {
		get(driver, adres);

	}
	public void get(WebDriver driver, String s) throws Exception {
		System.out.println("go to " + s);
		driver.get(s);
		Browser.waitFor(driver, s);
		System.out.println("OK");

	}

	///
	

}
