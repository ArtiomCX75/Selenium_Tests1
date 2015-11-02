package diskPages;

import browser.OldElement;
import browser.OldElement.type;

public class DiskLogin {
	public static OldElement url = new OldElement("/login");
	public static OldElement fldEmail=new OldElement("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[1]/input-placeholder/div/ng-transclude/input",type.fld);
	public static OldElement fldPass=new OldElement("html/body/ui-view/div/div/div[4]/div/div/form/div[1]/div[2]/input-placeholder/div/ng-transclude/input",type.fld);
	public static OldElement btnSubmitLogin=new OldElement("html/body/ui-view/div/div/div[4]/div/div/form/button",type.btn);
	public static OldElement lnkRecPass=new OldElement("html/body/ui-view/div/div/div[4]/div/div/form/a", type.lnk);
	public static OldElement lnkReg=new OldElement("html/body/ui-view/div/div/div[2]/div[1]/div/span[2]", type.lnk);
	public static OldElement lnkLogo=new OldElement("html/body/ui-view/div/div/div[1]", type.lnk);
	

}
