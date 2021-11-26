package com.nguyenkhanh.CarPark.controller;

import com.nguyenkhanh.CarPark.dto.CarDTO;
import com.nguyenkhanh.CarPark.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CarController {
    @Autowired
    private ICarService carService;

    @PostMapping("car")
    public ResponseEntity<?> addCar(@RequestBody CarDTO carDTO){
        try {
            carService.addCar(carDTO);
            return ResponseEntity.ok("Success");
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
    @GetMapping("car")
    public ResponseEntity<?> listCar(){
        try {
            return ResponseEntity.ok(carService.listCar());
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
