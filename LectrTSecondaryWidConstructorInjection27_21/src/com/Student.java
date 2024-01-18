package com;

public class Student {
private int rollno;
private String name;
private Address addr;

public Student(int rollno, String name, Address addr){
	this.rollno=rollno;
	this.name=name;
	this.addr=addr;
}

public String toString(){
	return "Rollno-"+rollno+", Name-"+name+", Address-"+addr+"";
	
}
}
