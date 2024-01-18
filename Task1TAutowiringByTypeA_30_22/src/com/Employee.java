package com;

public class Employee {
	private int eid;
	private String ename;
	private AdharCardDetails adhrdetails;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public AdharCardDetails getAdhrdetails() {
		return adhrdetails;
	}
	public void setAdhrdetails(AdharCardDetails adhrdetails) {
		this.adhrdetails = adhrdetails;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", adhrdetails=" + adhrdetails + "]";
	}
	
	
}
