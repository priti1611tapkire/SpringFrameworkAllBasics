package com;

import java.util.Arrays;

public class ArrayClass {
	private String[] mobileno;

	public String[] getMobileno() {
		return mobileno;
	}

	public void setMobileno(String[] mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "ArrayClass [mobileno=" + Arrays.toString(mobileno) + "]";
	}

}
