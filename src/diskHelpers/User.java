package diskHelpers;

@SuppressWarnings("serial")
public class User implements java.io.Serializable  {
	public String email;
	public String semiEmail;
	public String password;
	public String phoneNumber;
	public String name;
	public String middleName;
	public String surName;
	public String FIO=name+" "+middleName+" "+surName;
	public String birthDay;
}
