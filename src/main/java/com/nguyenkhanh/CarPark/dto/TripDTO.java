package com.nguyenkhanh.CarPark.dto;

import lombok.Data;

@Data
public class TripDTO {
    private long tripId;
    private int bookedTicketNumber;
    private String carType;
    private String departureDate;
    private String departureTime;
    private String destination;
    private String driver;
    private int maximumOnlineTicketNumber;

    public TripDTO() {
        super();
    }

    public TripDTO(long tripId, int bookedTicketNumber, String carType, String departureDate, String departureTime, String destination, String driver, int maximumOnlineTicketNumber) {
        this.tripId = tripId;
        this.bookedTicketNumber = bookedTicketNumber;
        this.carType = carType;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destination = destination;
        this.driver = driver;
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
    }
}
