package com.nguyenkhanh.CarPark.convertor;

import com.nguyenkhanh.CarPark.dto.EmployeeDTO;
import com.nguyenkhanh.CarPark.entity.EmployeeEntity;

import java.sql.Date;

public class EmployeeConvertor {
    public EmployeeDTO entityToDTO(EmployeeEntity employeeEntity) {
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setAccount(employeeEntity.getAccount());
        employeeDTO.setDepartment(employeeEntity.getDepartment());
        employeeDTO.setEmployeeAddress(employeeEntity.getEmployeeAddress());
        employeeDTO.setEmployeeBirthDate(employeeEntity.getEmployeeBirthDate().toString());
        employeeDTO.setEmployeeEmail(employeeEntity.getEmployeeEmail());
        employeeDTO.setEmployeeName(employeeEntity.getEmployeeName());
        employeeDTO.setEmployeePhone(employeeEntity.getEmployeePhone());
        employeeDTO.setPassword(employeeEntity.getPassword());
        employeeDTO.setSex(employeeEntity.getSex());

        return employeeDTO;
    }

    public EmployeeEntity dtoToEntity(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setAccount(employeeDTO.getAccount());
        employeeEntity.setDepartment(employeeDTO.getDepartment());
        employeeEntity.setEmployeeAddress(employeeDTO.getEmployeeAddress());
        employeeEntity.setEmployeeBirthDate(Date.valueOf(employeeDTO.getEmployeeBirthDate()));
        employeeEntity.setEmployeeEmail(employeeDTO.getEmployeeEmail());
        employeeEntity.setEmployeeName(employeeDTO.getEmployeeName());
        employeeEntity.setEmployeePhone(employeeDTO.getEmployeePhone());
        employeeEntity.setPassword(employeeDTO.getPassword());
        employeeEntity.setSex(employeeDTO.getSex());

        return employeeEntity;
    }

}
