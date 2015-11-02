package diskPages;

import browser.OldElement;
import browser.OldElement.type;

public class DiskReg {
	public static OldElement url = new OldElement("/signin");
	public static OldElement lnkLogin=new OldElement("html/body/ui-view/div/div/div[2]/div[1]/div/span[1]", type.lnk);
	public static OldElement lnkLogo=new OldElement("html/body/ui-view/div/div/div[1]", type.lnk);
	public static OldElement fldCodeReg=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[1]/ng-form/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldSurname=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldName=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[3]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldMiddleName=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[4]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldEmail=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[5]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldPhone=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[6]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldBirthday=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[7]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement fldPass=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[8]/input-placeholder/div/ng-transclude/input", type.fld);
	public static OldElement chkAgree=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/div[1]/div[9]/div/label/span", type.chk);
	public static OldElement btnSubmit=new OldElement("html/body/ui-view/div/div/div[4]/div/div[2]/form/button", type.btn);
	
}
