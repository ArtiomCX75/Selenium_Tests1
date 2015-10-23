package audPages;

import browser.Element;
import browser.Element.type;

public class AudCabPred {
	public static Element url = new Element("/#/cabinet");
	public static Element btnReloadStatus=new Element("html/body/div[1]/div/ng-view/div/div/div[2]/div[4]/span", type.btn);
	public static Element btnExit=new Element("html/body/div[1]/div/ng-view/header/div/div/a", type.btn);
}
