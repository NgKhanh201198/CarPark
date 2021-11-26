package com.nguyenkhanh.CarPark.controller;

import com.nguyenkhanh.CarPark.dto.BookingOfficeDTO;
import com.nguyenkhanh.CarPark.service.IBookingOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BookingOfficeController {
    @Autowired
    IBookingOfficeService bookingOfficeService;

    @PostMapping("/bookingOffice")
    public ResponseEntity<?> addBookingOffice(@RequestBody BookingOfficeDTO bookingOfficeDTO) {
        try {
            bookingOfficeService.addBookingOffice(bookingOfficeDTO);
            return ResponseEntity.ok("Success");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("/bookingOffice")
    public  ResponseEntity<?> listBookingOffice(){
        try {
            return ResponseEntity.ok(bookingOfficeService.listBookingOffice());
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
