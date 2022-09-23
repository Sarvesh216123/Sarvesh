 package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
  
  @Table(name="Employee" ) 
  public class Employee {
  
  
  @Id
  @Column(name="id") 
  private int id;
  
  @Column(name="name") 
  private String name;
  
  @Column(name="email") 
  private String email;
  
  @Column(name="gender") 
  private String gender;
  
  @Column(name="status") 
  private String status;
  
  @Transient
  private String Message;
  
  public Employee() { 
	  super(); // TODO Auto-generated constructor stub } public
  }

public int getId() {
	return id;
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

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getMessage() {
	return Message;
}

public void setMessage(String message) {
	Message = message;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", status=" + status
			+ ", Message=" + Message + "]";
}
  
  
  
  
  
 }
 