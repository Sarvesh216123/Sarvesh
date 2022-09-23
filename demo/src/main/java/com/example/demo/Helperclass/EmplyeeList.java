package com.example.demo.Helperclass;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Employee;

public class EmplyeeList {
	
	private List<Employee> listEmployee;
	
	public EmplyeeList() {
		listEmployee =new ArrayList<>();
	}
	

	public EmplyeeList(List<Employee> listEmployee) {
		super();
		this.listEmployee = listEmployee;
	}


	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	
}
