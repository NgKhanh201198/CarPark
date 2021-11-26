package com.nguyenkhanh.CarPark.service;

import com.nguyenkhanh.CarPark.dto.TripDTO;

import java.util.List;

public interface ITripService {
    public void addTrip(TripDTO tripDTO);

    public List<TripDTO> listTrip();
}
