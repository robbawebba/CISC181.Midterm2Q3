package customerInformation.model;

public class Customer {

	private String firstName;
	private String middleInit;
	private String lastName;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	// default no-arg constructor
	public Customer() {
		
	}
	
	public Customer(String firstName, String middleInit, String lastName, 
			String gender, String address, String city, String state, String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInit = middleInit;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInit() {
		return middleInit;
	}

	public void setMiddleInit(String middleInit) {
		this.middleInit = middleInit;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	

}
