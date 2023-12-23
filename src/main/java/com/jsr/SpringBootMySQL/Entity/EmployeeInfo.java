package com.jsr.SpringBootMySQL.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "EMPLOYEE_INFO")
public class EmployeeInfo {

    @Id
    private int id;

    @Column(name = "Last_Name")
    private String LastName;

    @Column(name = "First_Name")
    private String FirstName;

    @Column(name = "City")
    private String City;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Salary")
    private int Salary;

}
