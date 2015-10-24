package diskPages;

import browser.Element;
import browser.Element.type;

public class DiskCard extends DiskHeader{
	public static Element url = new Element("/profile/card");
	public static Element fldMoney=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input", type.fld);
	public static Element btnPay=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[1]/div[2]/button", type.btn);
	public static Element fldIndex=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div/div/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldRegion=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldCity=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldStreet=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/oi-select/div[1]/ul/li[2]/input", type.fld);
	public static Element fldHouse=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldBuil=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[5]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element fldFlat=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[6]/input-placeholder/div/ng-transclude/input", type.fld);
	public static Element btnSendCard=new Element("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[7]/button", type.btn);
}
