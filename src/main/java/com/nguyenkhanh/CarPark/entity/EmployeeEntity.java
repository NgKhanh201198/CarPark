package com.nguyenkhanh.CarPark.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "employee")
@Data
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private long employeeId;

    @Column(name = "account", length = 50)
    private String account;
    @Column(name = "department", length = 50)
    private String department;
    @Column(name = "employeeAddress", length = 50)
    private String employeeAddress;
    @Column(name = "employeeBirthDate")
    private Date employeeBirthDate;
    @Column(name = "employeeEmail", length = 50)
    private String employeeEmail;
    @Column(name = "employeeName", length = 50)
    private String employeeName;
    @Column(name = "employeePhone", length = 10)
    private String employeePhone;
    @Column(name = "password", length = 20)
    private String password;
    @Column(name = "sex", length = 1)
    private String sex;

    public EmployeeEntity() {
        super();
    }

    public EmployeeEntity(long employeeId, String account, String department, String employeeAddress, Date employeeBirthDate, String employeeEmail, String employeeName, String employeePhone, String password, String sex) {
        this.employeeId = employeeId;
        this.account = account;
        this.department = department;
        this.employeeAddress = employeeAddress;
        this.employeeBirthDate = employeeBirthDate;
        this.employeeEmail = employeeEmail;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.password = password;
        this.sex = sex;
    }
}
