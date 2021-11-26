package com.nguyenkhanh.CarPark.controller;

import com.nguyenkhanh.CarPark.dto.TicketDTO;
import com.nguyenkhanh.CarPark.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TicketController {
    @Autowired
    private ITicketService ticketService;

    @PostMapping("ticket")
    public ResponseEntity<?> addTicket(@RequestBody TicketDTO ticketDTO) {
        try {
            ticketService.addTicket(ticketDTO);
            return ResponseEntity.ok("Success");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @GetMapping("ticket")
    public ResponseEntity<?> listTicket() {
        try {
            return ResponseEntity.ok(ticketService.listCar());
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @DeleteMapping("ticket/{id}")
    public ResponseEntity<?> deleteTicket(@PathVariable("id") long id){
        try {
            ticketService.deleteTicket(id);
            return ResponseEntity.ok("Successful delete");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
