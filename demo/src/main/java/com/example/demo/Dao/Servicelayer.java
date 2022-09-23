
package com.example.demo.Dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jdt.internal.compiler.ast.ForeachStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Helperclass.ControllerException;
import com.example.demo.entity.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Servicelayer {

	@Autowired
	BasicInterface inter;

	RestTemplate template = new RestTemplate();

	public Employee addEmployee(int id) {
		Employee body=null;
		try {
			System.out.println("adddddd service");
			String url = "https://gorest.co.in/public/v2/users";
			String url1 = url + "/" + id;
			 body = template.getForObject(url1, Employee.class);
			 System.out.println("bodtt        "+body.getMessage());
			System.out.println(body);
			
			if(body.getEmail().equals(null)) {
				
				inter.save(body);
			}else {
				System.out.println("resource not found");
			}
		}catch(Exception e) {
			new ControllerException("ID Not Found");
		}
		return body;
		

		

	}

	public List<Employee> addEmployeeAll(Employee e) {

		System.out.println("service alll emp");
		//System.out.println("iddd    " + id);

		String url = "https://gorest.co.in/public/v2/users";
		//String url1 = url + "/" + id;
		System.out.println("sssss ttt ");
		//ObjectMapper mapper=new ObjectMapper();
		Employee[] res=template.getForObject(url,Employee[].class);
		//List<Employee> l = Arrays.stream(res).map(obj->mapper.convertValue(obj, Employee.class)).collect(Collectors.toList());
		/*
		 * l.forEach(el->{ System.out.println(el.toString()); inter.save(el); });
		 */
		List<Employee> le=new ArrayList<>();
		System.out.println(res.toString());
		for(int i=0;i<res.length;i++) {
			le.add(res[i]);
			System.out.println(res[i]);
			
		}
		
		System.out.println("leeeee     "+le);
		inter.saveAll(le);
		
		for (Employee employee : le) {

			System.out.println(employee);
		}
		System.out.println(le);	
		
		return le;

	}
	private void foreach() {
		// TODO Auto-generated method stub
		
	}

	public Employee getByName(String name) {
		Employee e=new Employee();
		try {
			e = inter.findByName(name);
			System.out.println(e);
			return e;
		}catch(Exception e1){
			 new ControllerException("Name Not Present");
		}
		return e;
		
	}

	public Employee getByempid(int id) {
		Employee e = inter.findById(id);
		return e;
	}
}
