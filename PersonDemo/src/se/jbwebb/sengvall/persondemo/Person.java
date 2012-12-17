package se.jbwebb.sengvall.persondemo;

public class Person {
	
	private String name;
	private String address;
	private String zipcity;
	private String mobile;
	
	public Person(String name, String address, String zipcity, String mobile) {
		this.name = name;
		this.address = address;
		this.zipcity = zipcity;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcity() {
		return zipcity;
	}
	public void setZipcity(String zipcity) {
		this.zipcity = zipcity;
	}	
	public String getMobile() {
		return mobile;
	}	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


}
