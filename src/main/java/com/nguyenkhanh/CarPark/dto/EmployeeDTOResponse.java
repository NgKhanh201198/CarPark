package com.nguyenkhanh.CarPark.dto;

import lombok.Data;

@Data
public class EmployeeDTOResponse {
    private long employeeId;
    private String department;
    private String employeeAddress;
    private String employeeBirthDate;
    private String employeeName;
    private String employeePhone;

    public EmployeeDTOResponse() {
        super();
    }

    public EmployeeDTOResponse(long employeeId, String department, String employeeAddress, String employeeBirthDate, String employeeName, String employeePhone) {
        this.employeeId = employeeId;
        this.department = department;
        this.employeeAddress = employeeAddress;
        this.employeeBirthDate = employeeBirthDate;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
    }
}
