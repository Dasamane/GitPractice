package com.vaadin.employeesdirectory.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Company {
    @Id
    private Integer companyId;

    private String companyName;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Employee> employees;
}
