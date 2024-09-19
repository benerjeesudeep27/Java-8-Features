package com.java8.features;

import java.util.Optional;

class Students {
	String name ;
	String email;
	long phone;
	public Students(String name, String email, long phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}	
}

class Excess {
	Optional<Student> op = Optional.empty();
	
	
}
public class OptionalClass {

	public static void main(String[] args) {
	}

}
