package com.nguyenkhanh.CarPark.service.Impl;

import com.nguyenkhanh.CarPark.Repository.ICarRepository;
import com.nguyenkhanh.CarPark.dto.CarDTO;
import com.nguyenkhanh.CarPark.entity.CarEntity;
import com.nguyenkhanh.CarPark.service.ICarService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService implements ICarService {
//    @Autowired
//    private ICarRepository carRepository;
//
//    @Autowired
//    private ModelMapper modelMapper;

    private final ICarRepository carRepository;
    private final ModelMapper modelMapper;

    public CarService(ICarRepository carRepository, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addCar(CarDTO carDTO) {
        CarEntity carEntity = modelMapper.map(carDTO, CarEntity.class);
        carRepository.save(carEntity);
    }

    @Override
    public List<CarDTO> listCar() {
        List<CarEntity> listCarEntity = carRepository.findAll(Sort.by(Sort.Direction.ASC, "licensePlate"));
        List<CarDTO> listCarDTO = listCarEntity.stream().map(carEntity -> modelMapper.map(carEntity, CarDTO.class)).collect(Collectors.toList());
        return listCarDTO;
    }
}
