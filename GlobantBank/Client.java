package GlobantBank;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String dni;
	private String name;
	private String gender;

	public Client(String dni, String name, String gender) {
		this.dni = dni;
		this.name = name;
		this.gender = gender;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void showClient() {
		 List<Client> myclients = new ArrayList<Client>();
		for (Client j : myclients) {
			System.out.println("Clients information loca" + j.toString());

		}
	}

	public String toString() {
		return "Dni: " + dni + " Name:  " + name + " Gender: " + gender;
	}

}
