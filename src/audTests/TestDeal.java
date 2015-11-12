package audTests;
import static org.junit.Assert.*;
import org.junit.Test;
import audHelpers.Constants;
import audHelpers.Element;
import audHelpers.Files;
import audPages.AudBid.Mark;
import audPages.UserAudAud;
import audPages.UserAudPred;
public class TestDeal extends TestBase {
	UserAudPred Pred1 = UserAudPred.readLast();
	UserAudAud Aud1 = UserAudAud.readLast();
	@Test
	public void makeDeal() throws Exception {
		app.landPred.open().btnVhodClick().login(Pred1).btnReloadStatus.click();
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusNaProverke));
		app.cabPred.btnExit.click();
		app.landAud.open().btnVhodClick().login(Aud1);
		app.list.chooseBid(Pred1).downloadOrder().makeZakl(Mark.notBad, "notbad1","notbad2").checkAll().btnSendOrder.click();
		Element.sl(50);
		app.audbid.btnExit.click();
		app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.naDorabotku("aufull", Files.pdffile2);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusNaDorab));
		app.cabPred.btnExit.click();
		app.landAud.open().btnVhodClick().login(Aud1).chooseCurrent().makeZakl(Mark.good).btnSendOrder.click();
		Element.sl(50);
		app.audbid.btnExit.click();
		app.landPred.open().btnVhodClick().login(Pred1);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusVipoln));
		app.cabPred.btnAcceptWork.click();
		Element.sl(2);
		assertTrue("Некорректный статус", app.cabPred.verifyStatus(Constants.statusRabPrin));
		app.cabPred.fldPost.sendKeys("faa1192@gmail.com");
		app.cabPred.btnSendPost.click();
		app.cabPred.btnExit.click();
	}
}

/*login(aud1) 
 bool1=isCurrentPresent 
 bool2=isBidAvailable(Pred1)
 if bool1==true {reg_aud()}
 if bool2==false {
 	make_new bid;
 	is status!=done {
 	reg_pred
 	}
 	Pred1 = UserAudPred.readLast();
	Aud1 = UserAudAud.readLast();
 this.makeDeal()
 	*/

/*функция, которая на входе принимает заявку (Пред1), архив с документами(?), файл с отчетом(?) оценку, комментарии
 ф-ция проваливается в текущую, если совпадает. берет эту заявку, если нет текущей, и проваливается. чекает только то, что не чекнуто
 */


