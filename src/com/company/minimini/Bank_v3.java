package com.company.minimini;

import java.util.Scanner;

public class Bank_v3 {
	private String id;
	private String pass;
	private double balance;
	private double sum;
	static String Company="(주)회사";

	public Bank_v3() {
		super();
		
	}
	public Bank_v3(String id, String pass, double balance, double sum) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "Bank_v3 [id=" + id + ", pass=" + pass + ", balance=" + balance + ", sum=" + sum + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	
	
	

}
