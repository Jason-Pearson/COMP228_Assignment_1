package exercise_1;

public class Patient {
	//PUBLIC INSTANCE VARIABLES
	public String patientID;
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String province;
	public String postalCode;
	
	//GETTERS AND SETTERS
	public String getPatientID() {
		return this.patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getPostalCode() {
		return this.postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	//EMPTY CONSTRUCTOR
	public Patient(){}
	
	//MULTI-ARGUMENT CONSTRUCTOR~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public Patient(String patientID, String firstName, String lastName, String address, String city, String province, String postalCode)
	{
		this.patientID = patientID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		
	}
	
	//PUBLIC METHODS
	public void getPatientInfo() //display by returning the (get) results from user input in the setters - constructor was not used to produce these results...
	{
		System.out.printf("%n%s %s - Patient ID: %s%nLives in %s, %s, %s %s", this.firstName, this.lastName, this.patientID, this.address, this.city, this.province, this.postalCode);
	}
}
