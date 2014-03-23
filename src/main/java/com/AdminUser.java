package main.java.com;

public class AdminUser implements UserFunctionality{

	
	private String name;
	private String lastName;
	
	public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminUser(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public boolean isUserInSystem() {
		if(lastName != null) {
			return true;
		}
		return false;
	}
	
	
}
