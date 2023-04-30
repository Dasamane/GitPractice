package com.vaadin.employeesdirectory.service;

import com.vaadin.employeesdirectory.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService  {
    List<Employee>  getEmployeeList();
}
