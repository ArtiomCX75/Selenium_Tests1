package com.example.tests;

import com.example.tests.Element.type;

public class AudDocs {
	public static Element url = new Element("/#/documents");
	public static Element dwnDownloadFile=new Element("//input[starts-with(@type,'file')][starts-with(@accept,'ap')]",type.dwn);
	public static Element fldSearch=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[4]/div[1]/input", type.btn);
	public static Element chkAnyAuditor=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[3]/div/div/label", type.chk);
	public static Element chkAuditor1=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[4]/div[2]/div[1]", type.chk);
	public static Element btnSend=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/button", type.btn);
	public static Element btnSendNext=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/a", type.btn);
	
}
