package com.java.model;

public class Employee {
  int id;
  String name;
  String dept;
  int salary;
  String city;

  public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
  
public Employee(int id, String name, String dept, int salary, String city) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
	this.city = city;
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

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", city=" + city + "]";
}
}
