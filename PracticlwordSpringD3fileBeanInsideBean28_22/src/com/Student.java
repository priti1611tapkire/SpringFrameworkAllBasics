package com;

import java.util.Arrays;

public class Student {
	private int rollno;
	private String name;
	private Mobno[] mobno;
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
	public Mobno[] getMobno() {
		return mobno;
	}
	public void setMobno(Mobno[] mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}
