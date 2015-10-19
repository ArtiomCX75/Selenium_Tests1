package com.example.tests;

import com.example.tests.Element.type;

public class AUD_Anketa2 {
	public static String url = "/#/create";
	public static Element fldDateOfBirth=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[1]/label/input",type.fld);
	public static Element fldSnils=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[2]/label/input",type.fld);
	public static Element fldPassNumber=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[3]/label/input",type.fld);
	public static Element fldCity=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[4]/label/input",type.fld);
	public static Element fldStreet=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[5]/label/input",type.fld);
	public static Element fldHouse=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[6]/label/input",type.fld);
	public static Element fldFlat=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[7]/label/input",type.fld);
	public static Element fldBic=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[3]/div[1]/label/input",type.fld);
	public static Element fldBill=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[3]/div[4]/label/input",type.fld);
	public static Element dwnDownloadFile=new Element("//input[starts-with(@type,'file')][starts-with(@accept,'im')]",type.dwn);
	//public static Element fld=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[3]/div[3]/label/input",type.fld);
}
