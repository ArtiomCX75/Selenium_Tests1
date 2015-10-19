package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class Discounter {
	
	void login(String url, String email, String password) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		//Element lan = new Element();
		driver.get(Constants.urlAudTest+AUD_Land_Pred.url);
		
		
		
	//	driver.get(url);
	//	driver.findElement(By.xpath("html/body/ui-view/div/div[1]/div[2]/div[1]/div/span[1]")).click();
	//	sl(1);
	//	driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input")).sendKeys(mail);
	//	driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input")).sendKeys(pass);
	//	driver.findElement(By.xpath("html/body/ui-view/div/div/div[4]/div/div/form/button")).click();
	}
	

}
