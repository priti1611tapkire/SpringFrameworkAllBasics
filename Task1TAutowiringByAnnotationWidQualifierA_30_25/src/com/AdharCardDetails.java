package com;

public class AdharCardDetails {
	private String adharno;
	private String adharregno;
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getAdharregno() {
		return adharregno;
	}
	public void setAdharregno(String adharregno) {
		this.adharregno = adharregno;
	}
	@Override
	public String toString() {
		return "AdharCardDetails [adharno=" + adharno + ", adharregno=" + adharregno + "]";
	}


}
