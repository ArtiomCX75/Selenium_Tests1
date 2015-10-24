package diskPages;

import browser.Element;
import browser.Element.type;

public class DiskSettings extends DiskHeader {
	public static Element url = new Element("/profile/settings");
	public static Element fldSurname=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldMiddleName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[3]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldEmail=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldBirthday=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[5]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldOldPass=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[6]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldNewPass=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[7]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element btnSubmitChanges=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/button", type.btn);
}
