package audPages;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

import browser.User;

public class UserAudAud  extends User implements java.io.Serializable  {
	public String numberAt;
	public String exp;
	public String login;
	public String dateOfBirth;
	public String snils;
	public String passNumber;
	public String city;
	public String street;
	public String house;
	public String flat;
	public String bic;
	public String bill;
	
	public void setDefault() {
		surName="Ivanov";
		name="Ivan";
		middleName="Kuzmich_";
		phoneNumber="9172890647";
		email="faa1192@gmail.com";
		numberAt="12345678";
		exp="5";
		dateOfBirth="25081991";
		snils="18508011113";
		passNumber="0123456789";
		city="Казань";
		street="Баумана";
		house="21";
		flat="12";
		bic="049205603";
		bill="01234567890123456789";
		login="login";
		password="123456";
	}
	
	static FileInputStream fis;
	static ObjectInputStream oin;
	
	public static UserAudAud readLast() throws Exception  {
		System.out.println("1");
		UserAudAud user;
		System.out.println("2");
		fis = new FileInputStream("temp_aud.txt");
		System.out.println("3");
		ObjectInputStream oin = null;
		oin = new ObjectInputStream(fis);
		System.out.println("4");
		user = (UserAudAud) oin.readObject();
		System.out.println("5");
		oin.close();
		System.out.println("6");
		System.out.println("email= " + user.email);
		System.out.println("pass= " + user.password);
		return user;
		}
	
}
