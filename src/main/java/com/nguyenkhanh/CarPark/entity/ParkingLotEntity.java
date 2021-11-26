package com.nguyenkhanh.CarPark.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "parkinglot")
@Data
public class ParkingLotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parkId")
    private long parkId;

    @Column(name = "parkArea")
    private long parkArea;
    @Column(name = "parkName", length = 50)
    private String parkName;
    @Column(name = "parkPlace", length = 11)
    private String parkPlace;
    @Column(name = "parkPrice")
    private long parkPrice;
    @Column(name = "parkStatus", length = 50)
    private String parkStatus;

    @OneToMany(mappedBy = "parkId")
    private Collection<CarEntity> listCar;
}
