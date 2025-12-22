package com.tcs.schoolManagement.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mystudent")
public class Student {
	@Value("1019112")
	private int roll;
	
	@Value("Bunny")
	private String name;
	
	@Autowired
	private Address address;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return roll + " " + name + " " + address;
	}
}
