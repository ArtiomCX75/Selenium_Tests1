package diskHelpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

@SuppressWarnings("serial")
public class UserDisc extends User{


public static UserDisc createNew(String email, String pass) {
	UserDisc user = new UserDisc();
	user.email=email;
	user.password=pass;
	return user;
}

public static UserDisc makeAdmin() {
	UserDisc user = new UserDisc();
	user.email=Constants.adminDiskEmail;
	user.password=Constants.adminDiskPassword;
	return user;
}

public void setDeault() {
	email="faa1192@gmail.com";
	password="12345";
	phoneNumber="+79172890647";
	name="Иван";
	middleName="Петрович";
	surName="Сидоров";
	birthDay = "25081992";
}
public static UserDisc readLast()   {
	UserDisc user=null;
	FileInputStream fis = null;
	try {
		fis = new FileInputStream("temp_disk.txt");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	ObjectInputStream oin = null;
	try {
		oin = new ObjectInputStream(fis);
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		user = (UserDisc) oin.readObject();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		oin.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("login= " + user.email);
	System.out.println("pass= " + user.password);
	return user;
	}

}
