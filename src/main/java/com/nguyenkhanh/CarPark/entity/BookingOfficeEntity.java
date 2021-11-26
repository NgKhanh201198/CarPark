package com.nguyenkhanh.CarPark.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "bookingoffice")
@Data
public class BookingOfficeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "officeId")
    private long officeId;

    @Column(name = "endContractDeadline")
    private Date endContractDeadline;
    @Column(name = "officeName",length = 50)
    private String officeName;
    @Column(name = "officePhone",length = 11)
    private String officePhone;
    @Column(name = "officePlace",length = 50)
    private String officePlace;
    @Column(name = "officePrice")
    private long officePrice;
    @Column(name = "startContractDeadline")
    private Date startContractDeadline;

    @ManyToOne
    @JoinColumn(name = "tripId")
    private TripEntity trip;
}
