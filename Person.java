
public class Person {

	
	private String firstName;
	private String lastName;
	Address address;
	private String birthday;

	
	public Person(String firstName, String lastNmae, Address address, String birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastNmae;
		this.address = address;
		this.birthday = birthday;
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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	@Override
	public String toString() {
		return "Person [First Name= " + firstName + ", Last Name= " + lastName + ", Birthday= "+ birthday + ", " + address +  "]";
	}
	
	
	
}
