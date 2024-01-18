package com.applicationcontext;

public class Oracle implements Connection {

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("Oracle commit Method");
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Rollback Method");
	}

}
