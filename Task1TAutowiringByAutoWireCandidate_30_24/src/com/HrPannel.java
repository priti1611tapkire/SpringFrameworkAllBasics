package com;




public class HrPannel {
	private int hid;
	private String hname;

	private AdharCardDetails adhrdet;

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

	public AdharCardDetails getAdhrdet() {
		return adhrdet;
	}

	public void setAdhrdet(AdharCardDetails adhrdet) {
		this.adhrdet = adhrdet;
	}

	@Override
	public String toString() {
		return "HrPannel [hid=" + hid + ", hname=" + hname + ", adhrdet=" + adhrdet + "]";
	}


}
