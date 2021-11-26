package com.nguyenkhanh.CarPark.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "ticket")
@Data
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketId")
    private long ticketId;

    @Column(name = "bookingTime")
    private Time bookingTime;
    @Column(name = "customerName", length = 11)
    private String customerName;

    @ManyToOne
    @JoinColumn(name = "licensePlate")
    private CarEntity licensePlate;

    @ManyToOne
    @JoinColumn(name = "tripId")
    private TripEntity trip;
}
