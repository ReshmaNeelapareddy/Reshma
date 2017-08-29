package com.duke.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Transaction {

	@Id
	private int tx_id;
	@Column
	private long acc_id;
	@Column
	private Date time_stamp;
	@Column
	private double amount;
	@Column
	private double balance;
	@Column
	private String description;

	public int getTx_id() {
		return tx_id;
	}

	public void setTx_id(int tx_id) {
		this.tx_id = tx_id;
	}

	public long getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(long acc_id) {
		this.acc_id = acc_id;
	}

	public Date getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(java.sql.Date time_stamp) {
		this.time_stamp = time_stamp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Transaction() {
		super();
	}

	public Transaction(int tx_id, long acc_id, Date time_stamp, double amount, double balance, String description) {
		super();
		this.tx_id = tx_id;
		this.acc_id = acc_id;
		this.time_stamp = time_stamp;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

}
