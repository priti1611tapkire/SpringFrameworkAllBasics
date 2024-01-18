package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HrPannel {
	private int hid;
	private String hname;
	@Autowired
	@Qualifier("addetails")
	private AdharCardDetails adhrdetails;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public AdharCardDetails getAdhrdetails() {
		return adhrdetails;
	}

	public void setAdhrdetails(AdharCardDetails adhrdetails) {
		this.adhrdetails = adhrdetails;
	}

	@Override
	public String toString() {
		return "HrPannel [hid=" + hid + ", hname=" + hname + ", adhrdetails=" + adhrdetails + "]";
	}
}
