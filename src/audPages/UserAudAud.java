package audPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import audHelpers.User;

@SuppressWarnings("serial")
public class UserAudAud  extends User  {
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
	public String semiEmail;
	
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
	
	public static UserAudAud readLast()   {
		UserAudAud user=null;
		try {
			fis = new FileInputStream("temp_aud.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectInputStream oin = null;
		try {
			oin = new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			user = (UserAudAud) oin.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("A login= " + user.login);
		System.out.println("A pass= " + user.password);
		return user;
		}
	
}
