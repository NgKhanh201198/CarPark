package com.nguyenkhanh.CarPark.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private long employeeId;
    private String account;
    private String department;
    private String employeeAddress;
    private String employeeBirthDate;
    private String employeeEmail;
    private String employeeName;
    private String employeePhone;
    private String password;
    private String sex;

    public EmployeeDTO() {
        super();
    }

    public EmployeeDTO(String account, String department, String employeeAddress, String employeeBirthDate, String employeeEmail, String employeeName, String employeePhone, String password, String sex) {
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
