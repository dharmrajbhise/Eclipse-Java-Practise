package com.model;

import java.security.interfaces.RSAPublicKey;

public class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;
	
	public Address(String address1, String address2, String city, String state) {
		this.address1 =address1;
		this.address2 =address2;
		this.city =city;
		this.state = state;
	}

	public String getAddress1() {
		return address1;
	}

}
