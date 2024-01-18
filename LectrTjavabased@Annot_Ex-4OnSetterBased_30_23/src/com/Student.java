package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
@Value(value = "s1")
private int rollno;
private String name;
@Autowired
private Address addr;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
}

}
