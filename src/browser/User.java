package browser;

import org.junit.Test;


public class User implements java.io.Serializable  {
	public String email;
	public String password;
	public String phoneNumber;
	public String name;
	public String middleName;
	public String surName;
	public String FIO=name+" "+middleName+" "+surName;
	
}
