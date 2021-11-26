package com.nguyenkhanh.CarPark.dto;

import lombok.Data;

@Data
public class ParkingLotDTO {
    private long parkId;
    private long parkArea;
    private String parkName;
    private String parkPlace;
    private long parkPrice;
    private String parkStatus;

    public ParkingLotDTO() {
        super();
    }

    public ParkingLotDTO(long parkId, long parkArea, String parkName, String parkPlace, long parkPrice, String parkStatus) {
        this.parkId = parkId;
        this.parkArea = parkArea;
        this.parkName = parkName;
        this.parkPlace = parkPlace;
        this.parkPrice = parkPrice;
        this.parkStatus = parkStatus;
    }
}
