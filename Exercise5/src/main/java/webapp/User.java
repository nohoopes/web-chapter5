package webapp;

import java.io.Serializable;

public class User implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	
	public User() {
		firstName ="";
		lastName ="";
		email ="";
			
	}
	
	public User (String a, String b, String c)
	{
		this.firstName = a;
		this.lastName = b;
		this.email =c;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	public void setFirstName(String a) {
		this.firstName = a;
	}
	public void setLastName(String a) {
		this.lastName = a;
	}
	public void setEmail(String a) {
		this.email = a;
	}
 
}
