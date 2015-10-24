package diskPages;

import browser.Element;
import browser.Element.type;

public class DiskProfile extends DiskHeader {
	public static Element url = new Element("/profile/invite");
	public static Element fldSurname=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[1]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldMiddleName=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[3]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldEmailOrPhone=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element btnInvite=new Element("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[5]/button", type.btn);

}
