package com.asr.Opration;

public class Product {
	private String pname;
	private int pid;
	private double price;
	private String pdetails;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pname, double price, String pdetails) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.price = price;
		this.pdetails = pdetails;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPdetails() {
		return pdetails;
	}
	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pid=" + pid + ", price=" + price + ", pdetails=" + pdetails + "]";
	}
	
	

}
