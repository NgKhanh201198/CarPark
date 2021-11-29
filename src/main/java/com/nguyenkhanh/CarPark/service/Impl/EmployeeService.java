package com.nguyenkhanh.CarPark.service.Impl;

import com.nguyenkhanh.CarPark.Repository.IEmployeeRepository;
import com.nguyenkhanh.CarPark.convertor.EmployeeConvertor;
import com.nguyenkhanh.CarPark.dto.EmployeeDTO;
import com.nguyenkhanh.CarPark.dto.EmployeeDTOResponse;
import com.nguyenkhanh.CarPark.entity.EmployeeEntity;
import com.nguyenkhanh.CarPark.service.IEmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService {
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @Autowired
//    private IEmployeeRepository employeeRepository;
//
//    @Autowired
//    private EmployeeConvertor employeeConvertor;

    private final ModelMapper modelMapper;
    private final IEmployeeRepository employeeRepository;
    private final EmployeeConvertor employeeConvertor;

    public EmployeeService(ModelMapper modelMapper, IEmployeeRepository employeeRepository, EmployeeConvertor employeeConvertor) {
        this.modelMapper = modelMapper;
        this.employeeRepository = employeeRepository;
        this.employeeConvertor = employeeConvertor;
    }

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
    public EmployeeDTOResponse findByID(long id) {
//        Optional<EmployeeEntity> employee = employeeRepository.findById(id);
        EmployeeEntity employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found id = " + id));

//        EmployeeDTOResponse employeeDTO = modelMapper.map(employee, EmployeeDTOResponse.class);
        EmployeeDTOResponse employeeDTOResponse = employeeConvertor.entityToDTOResponse(employee);


        return employeeDTOResponse;
    }

    @Override
    public List<EmployeeDTOResponse> listEmployeeResponse() {
        List<EmployeeEntity> list = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "employeeId"));
        List<EmployeeDTOResponse> listEmployeeDTO = list.stream().map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTOResponse.class)).collect(Collectors.toList());
        return listEmployeeDTO;
    }
}
