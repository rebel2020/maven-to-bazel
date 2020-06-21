package com.thrillio.entities;

import com.thrillio.constants.Gender;
import com.thrillio.constants.Usertype;

public class User {
	private long id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Usertype userType;
	private Gender gender;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Usertype getUserType() {
		return userType;
	}

	public void setUserType(Usertype userType) {
		this.userType = userType;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", userType=" + userType + ", gender=" + gender + "]";
	}
}
