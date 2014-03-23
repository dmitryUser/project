package main.java.com;

import javax.jws.soap.SOAPBinding.Use;

public class MainFunctionality {

	
	
	public boolean checkUser(UserFunctionality userFunctionality) {
//		System.out.println("***" + ((User)userFunctionality).getName());
		return userFunctionality.isUserInSystem();
	}
	
//	public boolean checkUserOfUserType(User user) {
//		return user.isUserInSystem();
//	}
//
//	public boolean checkUserOfTypeAdminUser(AdminUser adminUser) {
//		return adminUser.isUserInSystem();
//	}
	
}
