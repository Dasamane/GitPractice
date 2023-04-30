package com.vaadin.employeesdirectory.modules.dashboard;

import com.sun.javafx.scene.control.skin.TableHeaderRow;
import com.vaadin.employeesdirectory.entity.Company;
import com.vaadin.employeesdirectory.entity.Employee;
import com.vaadin.employeesdirectory.mvputils.BaseView;
import com.vaadin.employeesdirectory.template.MainTemplate;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "/employee-list", layout = MainTemplate.class)
public class EmployeeListView extends BaseView<EmployeeListPresenter> {


    private FormLayout signUpForm;

    private TextField searchByFirstName, searchByLastName, searchByCompanyName, searchByAddress;

    private PasswordField password;

    private ComboBox<Company> companyComboBox;

    private Grid<Employee> employeeGrid;
    private HeaderRow headerRow;


    @Override
    protected void init() {

        //getStyle().set("background-color","transparent");
        setUpHeader();
        setUpTextFields();
        setSizeFull();
        add(setUpGrid());


    }
    private void setUpTextFields(){
        searchByFirstName = new TextField();
        searchByLastName = new TextField();
        searchByAddress = new TextField();
        searchByCompanyName = new TextField();
    }

    private Grid<Employee> setUpGrid() {
        employeeGrid = new Grid<>();
        Grid.Column<Employee> fNameCol = employeeGrid.addColumn(Employee::getEmployeeFirstName)
                .setHeader("First Name").setAutoWidth(true);
        Grid.Column<Employee> lNameCol = employeeGrid.addColumn(Employee::getEmployeeLastName)
                .setHeader("Last Name").setAutoWidth(true);
        Grid.Column<Employee> addressCol = employeeGrid.addColumn(Employee::getEmployeeAddress)
                .setHeader("Address").setAutoWidth(true);
        Grid.Column<Employee> companyNameCol = employeeGrid.addColumn(e -> e.getCompany().getCompanyName())
                .setHeader("Company Name").setAutoWidth(true);

        employeeGrid.setItems(getPresenter().getEmployeeList());


        headerRow = employeeGrid.appendHeaderRow();
        headerRow.getCell(fNameCol).setComponent(searchByLastName);
        headerRow.getCell(lNameCol).setComponent(searchByLastName);
        headerRow.getCell(addressCol).setComponent(searchByAddress);
        headerRow.getCell(companyNameCol).setComponent(searchByCompanyName);


        return employeeGrid;

    }

    private void setUpHeader() {


    }


}
