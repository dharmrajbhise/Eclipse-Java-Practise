package com.model;

import java.time.LocalDate;

public class Pet {
	private String name;
	private LocalDate dob;
	
	public Pet() {
		
	}

	public Pet(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	public String getname() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
