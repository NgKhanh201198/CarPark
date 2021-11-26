package com.nguyenkhanh.CarPark.controller;

import com.nguyenkhanh.CarPark.dto.TripDTO;
import com.nguyenkhanh.CarPark.service.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TripController {
    @Autowired
    private ITripService tripService;

    @PostMapping("/trip")
    public ResponseEntity<?> addTrip(@RequestBody TripDTO tripDTO){
        try {
            tripService.addTrip(tripDTO);
            return ResponseEntity.ok("Success");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("/trip")
    public ResponseEntity<?> listTrip(){
        try {
            return ResponseEntity.ok(tripService.listTrip());
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
