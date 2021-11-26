package com.nguyenkhanh.CarPark.service.Impl;

import com.nguyenkhanh.CarPark.Repository.IParkingLotRepository;
import com.nguyenkhanh.CarPark.dto.ParkingLotDTO;
import com.nguyenkhanh.CarPark.entity.ParkingLotEntity;
import com.nguyenkhanh.CarPark.service.IParkingLotService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingLotService implements IParkingLotService {
    @Autowired
    private IParkingLotRepository parkingLotRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void addParkingLot(ParkingLotDTO parkingLotDTO) {
        ParkingLotEntity parkingLotEntity = modelMapper.map(parkingLotDTO, ParkingLotEntity.class);
        parkingLotRepository.save(parkingLotEntity);
    }

    @Override
    public List<ParkingLotDTO> listParkingLot() {
        List<ParkingLotEntity> listParkingLot = parkingLotRepository.findAll(Sort.by(Sort.Direction.ASC, "parkId"));
        List<ParkingLotDTO> listParkingDTO = listParkingLot.stream().map(parkingLotEntity -> modelMapper.map(parkingLotEntity, ParkingLotDTO.class)).collect(Collectors.toList());
        return listParkingDTO;
    }
}
