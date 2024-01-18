package com;

public class AdharCardDetails {
	private String adharno;
	private String adharregno;
	public AdharCardDetails(String adharno, String adharregno) {
		super();
		this.adharno = adharno;
		this.adharregno = adharregno;
	}
	@Override
	public String toString() {
		return "AdharCardDetails [adharno=" + adharno + ", adharregno=" + adharregno + "]";
	}
}
