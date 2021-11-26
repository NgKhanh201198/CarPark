package com.nguyenkhanh.CarPark.service;

import com.nguyenkhanh.CarPark.dto.ParkingLotDTO;

import java.util.List;

public interface IParkingLotService {
    public void addParkingLot(ParkingLotDTO parkingLotDTO);

    public List<ParkingLotDTO> listParkingLot();
}
