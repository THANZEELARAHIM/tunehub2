package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	int id;
	String username;
	String password;
	String email;
	String gender;
	String role;
	String address;
	boolean ispremium;
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", gender=" + gender + ", role=" + role + ", address=" + address + ", ispremium=" + ispremium
				+ ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getEmail()=" + getEmail() + ", getGender()=" + getGender() + ", getRole()=" + getRole()
				+ ", getAddress()=" + getAddress() + ", isIspremium()=" + isIspremium() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isIspremium() {
		return ispremium;
	}
	public void setIspremium(boolean ispremium) {
		this.ispremium = ispremium;
	}
	public Users(boolean ispremium) {
		super();
		this.ispremium = ispremium;
	}
	public Users() {
		super();
	}
	public String getRole1() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPremium(boolean b) {
		// TODO Auto-generated method stub
		
		
	}
	
}
