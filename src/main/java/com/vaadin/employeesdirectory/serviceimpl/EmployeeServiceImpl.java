package com.vaadin.employeesdirectory.serviceimpl;

import com.vaadin.employeesdirectory.entity.Employee;
import com.vaadin.employeesdirectory.repository.EmployeeRepo;
import com.vaadin.employeesdirectory.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepo.findAll();
    }
}
