package com.itheima.po;

public class Student {
	private Integer id;
	private String username; 
	private Integer balance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String toString() {
		return "student [id=" + id + ", "+"username=" + username + ", "
				+ "balance=" + balance + 
				"]";
	}
	public static void main(String[] args) {
		System.out.println("false");
	}
}
