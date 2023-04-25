package com.twitterdemo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TwitterModel
{
	@Id
	private int id;
	private String name;
	private String department;
	private String email;
	private String year;
	private String age;
	public int getId() {
		return id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
