package diskPages;

import browser.OldElement;
import browser.OldElement.type;

public class DiskCard extends DiskHeader{
	public static OldElement url = new OldElement("/profile/card");
	public static OldElement fldMoney=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input", type.fld);
	public static OldElement btnPay=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[1]/div[2]/button", type.btn);
	public static OldElement fldIndex=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div/div/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldRegion=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldCity=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldStreet=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/oi-select/div[1]/ul/li[2]/input", type.fld);
	public static OldElement fldHouse=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldBuil=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[5]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldFlat=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[6]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement btnSendCard=new OldElement("html/body/ui-view/div/ui-view/div/div/div/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[7]/button", type.btn);
}
