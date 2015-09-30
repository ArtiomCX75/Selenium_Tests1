package com.example.tests;

import org.openqa.selenium.By;

public class Element extends Act {
	
	public String adres;
	public String type;
	
	

	public void click() throws Exception
	{	
		//System.out.println(adres);
		click(adres);
		
	}
	public void type(String s) throws Exception
	{	
		//System.out.println(adres);
		type(adres, s);
		
	}
	
	
}
