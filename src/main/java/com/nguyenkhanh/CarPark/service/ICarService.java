package com.nguyenkhanh.CarPark.service;

import com.nguyenkhanh.CarPark.dto.CarDTO;

import java.util.List;

public interface ICarService {
    public void addCar(CarDTO carDTO);

    public List<CarDTO> listCar();
}
