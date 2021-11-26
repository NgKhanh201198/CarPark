package com.nguyenkhanh.CarPark.controller;

import com.nguyenkhanh.CarPark.dto.ParkingLotDTO;
import com.nguyenkhanh.CarPark.service.IParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ParkingLotController {
    @Autowired
    private IParkingLotService parkingLotService;

    @PostMapping("/parkingLot")
    public ResponseEntity<?> addParkingLot(@RequestBody ParkingLotDTO parkingLotDTO){
        try {
            parkingLotService.addParkingLot(parkingLotDTO);
            return ResponseEntity.ok("Success");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("/parkingLot")
    public ResponseEntity<?> listParkingLot(){
        try {
            return ResponseEntity.ok(parkingLotService.listParkingLot());
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
