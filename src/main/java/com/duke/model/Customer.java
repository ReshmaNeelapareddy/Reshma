package com.duke.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerDuke")
public class Customer {
	@Id
	private int cust_id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;
	@Column
	private int phone;
	@Column
	private String email;
	
	//@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Account> accunt=new ArrayList<Account>();

	public List<Account> getAccunt() {
		return accunt;
	}

	public void setAccunt(List<Account> accunt) {
		this.accunt = accunt;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer() {
		super();
	}

	public Customer(int cust_id, String firstName, String lastName, String street, String city, String state,
			int pincode, int phone, String email) {
		super();
		this.cust_id = cust_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phone = phone;
		this.email = email;
	}

}
