package com.example.tests;

import org.openqa.selenium.By;

public class Element extends Act {
	
	public  String adres;
	public  String type;
	public  int id;
	private static int counter=0;
	
	
	Element(String s1, String s2)
	{
		adres=s1;
		type=s2;
		id=counter;
		counter++;
	}
	
	enum type {
		btn,
		lnk,
		chk
		
	}
	
	
	public void click() throws Exception
	{	
		//System.out.println(adres);
		click(adres);
		
	}
	public void type(String s) throws Exception
	{	
		type(adres, s);
		
	}
	public void type(int i) throws Exception
	{	
		type(adres, Integer.toString(i));
		
	}
	public void load(String s) throws Exception
	{	
		load(adres, s);
		
	}
	
	
	
}
