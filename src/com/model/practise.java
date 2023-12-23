package com.model;
import java.time.LocalDate;
public class practise{
	private String firstname;
	private String lastname;
	private LocalDate dob;
	private Address address;
	private practise spouse;
	private Pet pet;
	public practise(String firstname, String lastname, LocalDate dob, Address address, practise spouse, Pet pet) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
		this.spouse = spouse;
		this.pet = pet;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public practise getSpouse() {
		return spouse;
	}
	public void setSpouse(practise spouse) {
		this.spouse = spouse;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
}
