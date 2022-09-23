
  package com.example.demo.Dao;
  
  import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
  
  @Repository 
  public interface BasicInterface extends JpaRepository<Employee,
  Integer> {
  
  
 public Employee findByName(String name); 
 public Employee findById(int id); }
