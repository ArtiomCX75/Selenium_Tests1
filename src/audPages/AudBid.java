package audPages;

import browser.Element;
import browser.Element.type;

public class AudBid {
	public static Element url = new Element("/#/bid");
	public static Element dwnDownloadFile=new Element("//input[@type='file']",type.dwn);
	public static Element btnSendOrder=new Element("html/body/div[1]/div/ng-view/div/div/div[2]/div[2]/button", type.btn);
	public static Element lnkZajavka=new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[1]", type.lnk);
	
	public static Element lnkAudZakl=new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[2]", type.lnk);
	public static Element chkVeryGood=new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[3]/div[1]/div[1]", type.chk);
	
	public static Element lnkAudRabDoc=new Element("html/body/div[1]/div/ng-view/div/div/div[3]/div[1]/div[3]", type.lnk);

	
	public static Element btnSend=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/form/div[2]/div/div[5]/button", type.btn);
	public static Element btnSendNext=new Element("html/body/div[1]/div/ng-view/div/div[2]/div/a", type.btn);
	//input[@type='file']
}
