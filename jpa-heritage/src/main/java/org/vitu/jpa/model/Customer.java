package org.vitu.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "CUSTOMER")
public class Customer extends User {

	@Column(name = "ref_cust", length = 10)
	private String refCustomer;
	
	public Customer() {
	}
	
	public Customer(String name, int age, String refCustomer) {
		super(name, age);
		this.refCustomer = refCustomer;
	}

	public String getRefCustomer() {
		return refCustomer;
	}

	public void setRefCustomer(String refCustomer) {
		this.refCustomer = refCustomer;
	}

	@Override
	public String toString() {
		return "Customer [refCustomer=" + refCustomer + ", getId()=" + getId() + ", getNom()=" + getNom()
				+ ", getAge()=" + getAge() + "]";
	}	
}