package com.nguyenkhanh.CarPark.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "car")
@Data
public class CarEntity {
    @Id
    @Column(name = "licensePlate", length = 50, insertable = true)
    private String licensePlate;

    @Column(name = "carColor", length = 11)
    private String carColor;
    @Column(name = "carType", length = 50)
    private String carType;
    @Column(name = "company", length = 50)
    private String company;

    @ManyToOne
    @JoinColumn(name = "parkId")
    private ParkingLotEntity parkId;

    @OneToMany(mappedBy = "licensePlate")
    private Collection<TicketEntity> listTicket;
}
