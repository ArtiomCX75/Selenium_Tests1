package diskPages;

import browser.OldElement;
import browser.OldElement.type;

public class DiskProfile extends DiskHeader {
	public static OldElement url = new OldElement("/profile/invite");
	public static OldElement fldSurname=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[1]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldName=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldMiddleName=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[3]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldEmailOrPhone=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement btnInvite=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div[1]/div[2]/form/div/div[5]/button", type.btn);

}
