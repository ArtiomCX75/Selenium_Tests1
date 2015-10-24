package diskPages;

import browser.Element;
import browser.Element.type;

public class DiskLogin {
	public static Element url = new Element("/login");
	public static Element fldEmail=new Element("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input",type.fld);
	public static Element fldPass=new Element("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input",type.fld);
	public static Element btnSubmitLogin=new Element("html/body/ui-view/div/div/div[4]/div/div/form/button",type.btn);
	public static Element lnkRecPass=new Element("html/body/ui-view/div/div/div[4]/div/div/form/a", type.lnk);
	public static Element lnkReg=new Element("html/body/ui-view/div/div/div[2]/div[1]/div/span[2]", type.lnk);
	public static Element lnkLogo=new Element("html/body/ui-view/div/div/div[1]", type.lnk);
	

}
