package com.nguyenkhanh.CarPark.controller;

import com.nguyenkhanh.CarPark.dto.EmployeeDTO;
import com.nguyenkhanh.CarPark.dto.EmployeeDTOResponse;
import com.nguyenkhanh.CarPark.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        try {
            employeeService.addEmployee(employeeDTO);
            return ResponseEntity.ok("Success");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("/employee")
    public ResponseEntity<?> listEmployee() {
        try {
            List<EmployeeDTO> list = employeeService.listEmployee();

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> listEmployeeResponse(@PathVariable("id") long id) {
        try {
            EmployeeDTOResponse employeeDTOResponse = employeeService.findByID(id);

            return new ResponseEntity<>(employeeDTOResponse, HttpStatus.OK);
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("/employee/search")
    public ResponseEntity<?> searchEmployee(@RequestParam("keyword") String keyword) {
        try {
            List<EmployeeDTO> list = employeeService.listEmployee();
//            list = list.stream().map()

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
