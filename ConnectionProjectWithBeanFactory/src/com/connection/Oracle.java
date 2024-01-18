package com.connection;

public class Oracle implements Connection {

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Commit Method");
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Rollback Method");
	}

}
