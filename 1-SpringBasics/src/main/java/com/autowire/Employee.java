package com.autowire;

public class Employee {
	private String name;
	private Address address;
	
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
	
	public Employee(Address address, String name) {
		super();
		this.address = address;
		this.name = name;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

}
