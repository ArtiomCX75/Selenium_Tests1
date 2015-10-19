package com.example.tests;

public class AUD_Docs {
	public static String url = "/#/documents";
	public static Element dwnDownloadFile=new Element("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]","dwn");
	public static Element fldSearch=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[4]/div[1]/input", "fld");
	public static Element chkAnyAuditor=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[3]/div/div/label", "chk");
	public static Element chkAuditor1=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[4]/div[2]/div[1]", "chk");
	public static Element btnSend=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/button", "btn");
	public static Element btnSendNext=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/a", "btn");
	
}
