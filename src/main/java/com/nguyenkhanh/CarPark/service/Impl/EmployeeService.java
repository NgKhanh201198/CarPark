package com.nguyenkhanh.CarPark.service.Impl;

import com.nguyenkhanh.CarPark.Repository.IEmployeeRepository;
import com.nguyenkhanh.CarPark.dto.EmployeeDTO;
import com.nguyenkhanh.CarPark.dto.EmployeeDTOResponse;
import com.nguyenkhanh.CarPark.entity.EmployeeEntity;
import com.nguyenkhanh.CarPark.service.IEmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        employeeRepository.save(employeeEntity);
    }

    @Override
    public List<EmployeeDTO> listEmployee() {
        List<EmployeeEntity> list = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "employeeId"));
        List<EmployeeDTO> listEmployeeDTO = list.stream().map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class)).collect(Collectors.toList());
        return listEmployeeDTO;
    }

    @Override
    public List<EmployeeDTOResponse> listEmployeeResponse() {
        List<EmployeeEntity> list = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "employeeId"));
        List<EmployeeDTOResponse> listEmployeeDTO = list.stream().map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTOResponse.class)).collect(Collectors.toList());
        return listEmployeeDTO;
    }
}
