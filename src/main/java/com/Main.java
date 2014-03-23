package main.java.com;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		User userSasha = new User();
		userSasha.setName("Sasha");
		userSasha.setLastName("Romanov");

		User userIra = new User("Ira", "Romanova");
//		userIra.setName(null);s
		
		System.out.println(" User names: ");
		System.out.println(userIra.getName());
		System.out.println(userSasha.getName());
		
		AdminUser userPit = new AdminUser("Pit", "Ivanov");
//		userPit.setLastName(null);
		System.out.println(userPit.getName());
		
		System.out.println(" Check instances:");
		System.out.println(userSasha instanceof UserFunctionality);
		System.out.println(userPit instanceof UserFunctionality);
		
		System.out.println(" Validation:");
		MainFunctionality functionality = new MainFunctionality();
		
//		System.out.println(functionality.checkUserOfUserType((userSasha)));
//		System.out.println(functionality.checkUserOfUserType((userIra)));
//		
//		System.out.println(functionality.checkUserOfTypeAdminUser((userPit)));
		
		System.out.println(functionality.checkUser(userSasha));
		System.out.println(functionality.checkUser(userIra));
//		System.out.println(functionality.checkUser(userPit));
//		System.out.println(functionality.checkUser());
		
		/* Dmitry, please check this functionality */
		List<UserFunctionality> usersList = new ArrayList<>();
		usersList.add(userIra);
		usersList.add(userSasha);
		usersList.add(userPit);
		System.out.println(" Start checking from list:");
		for(UserFunctionality currentUser : usersList) {
			System.out.println(currentUser.isUserInSystem());
		}
		
	}

}
