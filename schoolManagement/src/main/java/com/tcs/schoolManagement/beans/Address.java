package com.tcs.schoolManagement.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myaddress")
public class Address {
	@Value("Kurla")
	String area;
	
	@Value("400070")
	int pincode;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return area + " " + pincode;
	}
}
