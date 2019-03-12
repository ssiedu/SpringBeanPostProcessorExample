package com.ssi;

import org.springframework.beans.factory.InitializingBean;

public class Customer  {
	private int code;
	private String cname;
	
	public Customer() {
		System.out.println("Customer Object Created");
	}

	public Customer(int code, String cname) {
		super();
		this.code = code;
		this.cname = cname;
	}


	public void showInfo(){
		System.out.println("Code  : "+code);
		System.out.println("Name  : "+cname);
		System.out.println("_______________________________________________");
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
		System.out.println("Customer Code Set");
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
		System.out.println("Customer Name Set");
	}

	@Override
	public String toString() {
		return "Customer [code=" + code + ", cname=" + cname + "]";
	}

}
