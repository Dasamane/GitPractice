package com.vaadin.employeesdirectory.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    private Integer employeeId;

    private String employeeFirstName;

    private String employeeLastName;

    private Long mobileNumber;

    private String employeeAddress;

    private String userName;

    private String password;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

}
