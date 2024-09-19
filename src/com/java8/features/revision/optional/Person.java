package com.java8.features.revision.optional;

public class Person {
	private String name;
	private String city;
	private int age;
	private String gender;
	
	public Person(String name, String city, int age, String gender) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + ", gender=" + gender + "]";
	}
}
