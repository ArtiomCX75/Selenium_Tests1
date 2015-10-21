package com.example.tests;

import java.io.Serializable;

public class UserAudPred extends User implements Serializable{
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
	urSusch[1]=10;
	urSusch[2]=10;
	urSusch[3]=10;
	urSusch[4]=10;
	urSusch[5]=10;
	urSusch[6]=10;
	urSusch[7]=10;
	urSusch[8]=10;
	FIO=surName+" "+ name+" "+middleName;
}
}
