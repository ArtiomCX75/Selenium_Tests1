package diskHelpers;


public interface Mail {
	public Object open();
	public String getEmail() throws Exception;
	public String setMail(String s);
	//public UserAudAud readMail_aud_reg(UserAudAud user);
}
