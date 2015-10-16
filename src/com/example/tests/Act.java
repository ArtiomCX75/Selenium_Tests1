package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.regex.Pattern;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.thoughtworks.selenium.webdriven.commands.Click;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

public class Act {
	WebDriver driver;
	
		Act() {
		
		
		}
	
	public void click(String adr) throws Exception {
		Browser.sl(0.2);
		Browser.driver.findElement(By.xpath(adr)).click();
		//System.out.println("click "+adr);
		Browser.sl(0.2);
		
	}
	
	
	public void type(String adr, String s) throws Exception {
		Browser.sl(0.1);
		//Browser.driver.findElement(By.xpath(adr)).click();
		Browser.driver.findElement(By.xpath(adr)).clear();
		Browser.driver.findElement(By.xpath(adr)).sendKeys(s);
		//System.out.println("type "+s+" in "+ adr);
		//Browser.sl(0.5);
	}
	


}