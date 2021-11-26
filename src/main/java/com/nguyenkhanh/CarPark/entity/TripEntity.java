package com.nguyenkhanh.CarPark.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;

@Entity
@Table(name = "trip")
@Data
public class TripEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tripId")
    private long tripId;

    @Column(name = "bookedTicketNumber", length = 11)
    private int bookedTicketNumber;
    @Column(name = "carType", length = 11)
    private String carType;
    @Column(name = "departureDate")
    private Date departureDate;
    @Column(name = "departureTime")
    private Time departureTime;
    @Column(name = "destination", length = 50)
    private String destination;
    @Column(name = "driver", length = 11)
    private String driver;
    @Column(name = "maximumOnlineTicketNumber", length = 11)
    private int maximumOnlineTicketNumber;

    @OneToMany(mappedBy = "trip")
    private Collection<TicketEntity> listTicket;
    @OneToMany(mappedBy = "trip")
    private Collection<BookingOfficeEntity> listBookingOffice;
}
