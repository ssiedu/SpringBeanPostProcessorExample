package com.ssi;

public class Product {
	
	private String pcode;
	private String pname;
	
	
	
	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
		System.out.println("PCode Set");
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
		System.out.println("PName Set");
	}



	public Product(){
		System.out.println("Product Object Created");
	}

	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + "]";
	}
	
}
