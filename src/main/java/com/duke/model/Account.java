package com.duke.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Account {
	@Id
	private int acc_id;
	@Column
	private String type;
	@Column
	private String description;
	@Column
	private double balance;
	@Column
	private double credit_line;
	@Column
	private double beginBalance;
	@Column
	private Date beginBalanceTime;

	/*@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)*/
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCredit_line() {
		return credit_line;
	}

	public void setCredit_line(double credit_line) {
		this.credit_line = credit_line;
	}

	public double getBeginBalance() {
		return beginBalance;
	}

	public void setBeginBalance(double beginBalance) {
		this.beginBalance = beginBalance;
	}

	public Date getBeginBalanceTime() {
		return beginBalanceTime;
	}

	public void setBeginBalanceTime(java.sql.Date beginBalanceTime) {
		this.beginBalanceTime = beginBalanceTime;
	}

	public Account() {
		super();
	}

	public Account(int acc_id, String type, String description, double balance, double credit_line, double beginBalance,
			Date beginBalanceTime, Customer customer) {
		super();
		this.acc_id = acc_id;
		this.type = type;
		this.description = description;
		this.balance = balance;
		this.credit_line = credit_line;
		this.beginBalance = beginBalance;
		this.beginBalanceTime = beginBalanceTime;
		this.customer = customer;
	}

	

}
