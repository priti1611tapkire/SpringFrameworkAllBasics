package com;

public class Employee {
	private int eid;
	private String ename;
	
	private AdharCardDetails adhardetails;

	public Employee(int eid, String ename, AdharCardDetails adhardetails) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.adhardetails = adhardetails;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", adhardetails=" + adhardetails + "]";
	}

}
