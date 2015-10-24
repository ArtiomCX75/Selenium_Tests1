package audPages;

import browser.Element;
import browser.Element.type;

public class AudLandAud {
	public static Element url = new Element("/#/auditors");
	public static Element lnkLogoHeader=new Element("html/body/div[1]/div/ng-view/div[1]/header/span",type.lnk);
	public static Element lnkONas=new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[1]/span",type.lnk);
	public static Element lnkKakRab=new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[2]/span",type.lnk);
	public static Element lnkChtoPredl=new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[3]/span",type.lnk);
	public static Element lnkKogoIsch=new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[4]/span",type.lnk);
	public static Element lnkOtzivi=new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[5]/span",type.lnk);
	public static Element lnkVoprosi=new Element("html/body/div[1]/div/ng-view/div[1]/header/nav/ul/li[6]/span",type.lnk);
	public static Element btnVhod=new Element("html/body/div[1]/div/ng-view/div[1]/header/div/span",type.btn);
	public static Element fldLogin=new Element("html/body/div[4]/table/tbody/tr/td/div/div/form[1]/label[1]/input",type.fld);
	public static Element fldPass=new Element("html/body/div[4]/table/tbody/tr/td/div/div/form[1]/label[2]/input",type.fld);
	public static Element btnEsc=new Element("html/body/div[4]/table/tbody/tr/td/div/span[2]",type.btn);
	public static Element btnLoginSubmit=new Element("html/body/div[4]/table/tbody/tr/td/div/div/form[1]/input",type.btn);
	public static Element lnkVosstanParol=new Element("html/body/div[4]/table/tbody/tr/td/div/div/form[1]/span",type.lnk);
	public static Element btnStartWork=new Element("html/body/div[1]/div/ng-view/div[1]/section[1]/div/div/div/div[2]/a",type.btn);
}
