package diskPages;

import browser.Element;
import browser.Element.type;

public class DiskReg {
	public static Element url = new Element("/signin");
	public static Element lnkLogin=new Element("html/body/ui-view/div/div/div[2]/div[1]/div/span[1]", type.lnk);
	public static Element lnkLogo=new Element("html/body/ui-view/div/div/div[1]", type.lnk);
	public static Element fldCodeReg=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[1]/ng-form/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldSurname=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldName=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[3]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldMiddleName=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldEmail=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[5]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldPhone=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[6]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldBirthday=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[7]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldPass=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[8]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element chkAgree=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[9]/div/label/span", type.chk);
	public static Element btnSubmit=new Element("html/body/ui-view/div/div/div[4]/div/div[2]/form/button", type.btn);
	
}
