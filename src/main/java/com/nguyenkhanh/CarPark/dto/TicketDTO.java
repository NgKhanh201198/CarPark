package com.nguyenkhanh.CarPark.dto;

import lombok.Data;

@Data
public class TicketDTO {
    private long ticketId;
    private String bookingTime;
    private String customerName;
    private String licensePlate;
    private long tripId;

    public TicketDTO() {
        super();
    }

    public TicketDTO(long ticketId, String bookingTime, String customerName, String licensePlate, long tripId) {
        this.ticketId = ticketId;
        this.bookingTime = bookingTime;
        this.customerName = customerName;
        this.licensePlate = licensePlate;
        this.tripId = tripId;
    }
}
