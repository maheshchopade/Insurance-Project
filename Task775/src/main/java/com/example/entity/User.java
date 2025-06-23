package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uId;

	private String Firstname;

	private String Lastname;

	private String Email_Id;

	private Long Mobile_Number;

	@OneToOne
	private Address address;

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail_Id() {
		return Email_Id;
	}

	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}

	public Long getMobile_Number() {
		return Mobile_Number;
	}

	public void setMobile_Number(Long mobile_Number) {
		Mobile_Number = mobile_Number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email_Id=" + Email_Id
				+ ", Mobile_Number=" + Mobile_Number + ", address=" + address + "]";
	}

}
