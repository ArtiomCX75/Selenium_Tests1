package com.example.tests;

import com.example.tests.Element.type;

public class AudAnketa1 {
	public static Element url = new Element("/#/questionnaire");
	public static Element fldSurname=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[1]/label/input",type.fld);
	public static Element fldName=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[2]/label/input",type.fld);
	public static Element fldMiddlename=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[3]/label/input",type.fld);
	public static Element fldPhone=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[4]/label/input",type.fld);
	public static Element fldEmail=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[1]/div[5]/label/input",type.fld);
	public static Element fldNumberAt=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[2]/div[1]/label/input",type.fld);
	public static Element fldExp=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[2]/div[2]/label/input",type.fld);
	public static Element dwnDownloadFile=new Element("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]",type.dwn);
	public static Element chkAgr1=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[4]/label/span[1]",type.chk);
	public static Element chkAgr2=new Element("html/body/div[1]/div/ng-view/div/div[2]/div[2]/form/div[5]/label/span[1]",type.chk);
	public static Element btnSend=new Element("html/body/div[1]/div/ng-view/div/div/div[2]/form/button",type.btn);
	public static Element btnNext=new Element("html/body/div[1]/div/ng-view/div/div/div[1]/a",type.btn);
	
	/*public static Element fld=new Element("",type.fld);
	public static Element fld=new Element("",type.fld);*/
}
