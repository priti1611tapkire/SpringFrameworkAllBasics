package com;

public class Student {
	private Address addr;

	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Student(){
		System.out.println("constrctor of Student");
	}
}
