package com.vaadin.employeesdirectory.modules.dashboard;

import com.vaadin.employeesdirectory.entity.Employee;
import com.vaadin.employeesdirectory.mvputils.BasePresenter;
import com.vaadin.employeesdirectory.service.EmployeeService;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.util.List;
@UIScope
@SpringComponent
public class EmployeeListPresenter extends BasePresenter<EmployeeListView> {

    @Autowired
    private EmployeeService employeeService;

    protected List<Employee> getEmployeeList(){
        return employeeService.getEmployeeList();
    }
}
