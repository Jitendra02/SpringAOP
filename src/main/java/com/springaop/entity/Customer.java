package com.springaop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name = "Id")
	@GeneratedValue
	private int Id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="AdmissionDate")
	private Date admissionDate;
	
	//-------------------------------------------------------------------------

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the admissionDate
	 */
	public Date getAdmissionDate() {
		return admissionDate;
	}

	/**
	 * @param admissionDate the admissionDate to set
	 */
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	
//-----------------------------------------------------------------------------
}
