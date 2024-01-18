package com;

public class Mobno {
	private String tmobno;
	private String pmobno;
	public String getTmobno() {
		return tmobno;
	}
	public void setTmobno(String tmobno) {
		this.tmobno = tmobno;
	}
	public String getPmobno() {
		return pmobno;
	}
	public void setPmobno(String pmobno) {
		this.pmobno = pmobno;
	}
	@Override
	public String toString() {
		return "Mobno [tmobno=" + tmobno + ", pmobno=" + pmobno + "]";
	}
}
