package audPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
}//FileNotFoundException


	public static UserAudPred readLast()  {
	System.out.println("1");
	UserAudPred user = new UserAudPred();
	user.setDefault();
	System.out.println("2");
	FileInputStream fis = null;
	try {
		fis = new FileInputStream("temp_pred.txt");
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	System.out.println("3");
	ObjectInputStream oin = null;
	try {
		oin = new ObjectInputStream(fis);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println("4");
	try {
		user = (UserAudPred) oin.readObject();
	} catch (ClassNotFoundException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("5");
	try {
		oin.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("6");
	System.out.println("email= " + user.email);
	System.out.println("pass= " + user.password);
	return user;
	}

}
