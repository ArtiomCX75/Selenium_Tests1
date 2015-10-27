package audPages;

import java.io.Serializable;

import browser.User;

public class UserAudPred extends User implements java.io.Serializable {
public int[] urSusch=new int[9];
public String orgName;
public String contactName;
public String genDir;
public String vidDej;
public String usualPhone;

public void setDefault() {
	name="Ivan";
	middleName="Ivanovich";
	surName="Ivanov";
	email="faa1192@gmail.com";
	password="123456";
	phoneNumber="9172890647";
	orgName="OOO DefaultName";
	contactName="Petrov Petr Petrovich";
	genDir="Ivanov Ivan Ivanovich";
	vidDej="prodaja";
	usualPhone="9172890647";
	urSusch[0]=10;
	urSusch[1]=20;
	urSusch[2]=30;
	urSusch[3]=40;
	urSusch[4]=50;
	urSusch[5]=60;
	urSusch[6]=70;
	urSusch[7]=80;
	FIO=surName+" "+ name+" "+middleName;
}
}
