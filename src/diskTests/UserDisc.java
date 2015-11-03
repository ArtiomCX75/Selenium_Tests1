package diskTests;

import diskHelpers.Constants;
import diskHelpers.User;

@SuppressWarnings("serial")
public class UserDisc extends User{


public static UserDisc createNew(String email, String pass) {
	UserDisc user = new UserDisc();
	user.email=email;
	user.password=pass;
	return user;
}

public UserDisc makeAdmin() {
	UserDisc user = new UserDisc();
	user.email=Constants.adminDiskEmail;
	user.password=Constants.adminDiskPassword;
	return user;
}


}
