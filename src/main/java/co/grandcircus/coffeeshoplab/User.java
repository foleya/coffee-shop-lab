package co.grandcircus.coffeeshoplab;

public class User {
	
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private String password;
	
	public User () {};
	
	public User(String firstName, String lastName, String emailAddress, String phoneNumber, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}
	
	
	
	

}
