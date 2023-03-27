package com.example.pojos;

import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean {
	String line1;
	String city;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception { // run this method as we implements initializingBean interface. 
		this.line1="Street Name";
		this.city="City Name";
		
	}
	
	
}
