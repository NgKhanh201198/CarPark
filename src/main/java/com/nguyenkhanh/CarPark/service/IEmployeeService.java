package com.nguyenkhanh.CarPark.service;

import com.nguyenkhanh.CarPark.dto.EmployeeDTO;
import com.nguyenkhanh.CarPark.dto.EmployeeDTOResponse;

import java.util.List;

public interface IEmployeeService {
    public void addEmployee(EmployeeDTO employeeDTO);

    public List<EmployeeDTO> listEmployee();

    public EmployeeDTOResponse findByID(long id);

    public List<EmployeeDTOResponse> listEmployeeResponse();
}
