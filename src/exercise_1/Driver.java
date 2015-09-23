package exercise_1;

import java.util.Scanner;

public class Driver {

	public static Patient patient; // create object for Patient class
	
	public static void main(String[] args) {
		patient = new Patient(); // instantiate object
		Scanner input = new Scanner(System.in);
		String ID, first, last, address, city, province, postalCode;
		
		System.out.print("Enter Patient ID: ");
		ID = input.nextLine(); // user inputs to this local variable -
		patient.setPatientID(ID); // - sets Patient ID in Patient Class with local variable

		System.out.print("Enter First Name: ");
		first = input.nextLine(); // user input to local variable -
		patient.setFirstName(first); // - set Patient class variable
		
		System.out.print("Enter Last Name: ");
		last = input.nextLine(); // user input to local variable -
		patient.setLastName(last); // - set Patient class variable
		
		System.out.print("Enter Address: ");
		address = input.nextLine(); // user input to local variable -
		patient.setAddress(address); // - set Patient class variable
		
		System.out.print("Enter City: ");
		city = input.nextLine(); // user input to local variable -
		patient.setCity(city); // - set Patient class variable
		
		System.out.print("Enter Province: ");
		province = input.nextLine(); // user input to local variable -
		patient.setProvince(province);
		
		System.out.print("Enter Postal Code: ");
		postalCode = input.nextLine(); // user input to local variable -
		patient.setPostalCode(postalCode); // - set Patient class variable
		
		patient.getPatientInfo(); //display the method from Patient class
	}

}
