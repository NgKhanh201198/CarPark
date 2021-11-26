package com.nguyenkhanh.CarPark.dto;

import lombok.Data;

@Data
public class CarDTO {
    private String licensePlate;
    private String carColor;
    private String carType;
    private String company;
    private long parkId;

    public CarDTO() {
        super();
    }

    public CarDTO(String licensePlate, String carColor, String carType, String company, long parkId) {
        this.licensePlate = licensePlate;
        this.carColor = carColor;
        this.carType = carType;
        this.company = company;
        this.parkId = parkId;
    }
}
