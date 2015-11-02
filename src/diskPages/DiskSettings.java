package diskPages;

import browser.OldElement;
import browser.OldElement.type;

public class DiskSettings extends DiskHeader {
	public static OldElement url = new OldElement("/profile/settings");
	public static OldElement fldSurname=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldName=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldMiddleName=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[3]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldEmail=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldBirthday=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[5]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldOldPass=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[6]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldNewPass=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/div[1]/div[7]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement btnSubmitChanges=new OldElement("html/body/ui-view/div/ui-view/div/div/div[2]/div/div/form/button", type.btn);
}
