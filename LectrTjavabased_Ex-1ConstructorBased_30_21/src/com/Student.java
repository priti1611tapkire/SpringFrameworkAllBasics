package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollno;
	private String name;
	@Autowired
	private Address addr;
	public Student(int rollno,String name ){
		super();
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
	}
}
