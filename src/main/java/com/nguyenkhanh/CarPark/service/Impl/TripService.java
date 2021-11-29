package com.nguyenkhanh.CarPark.service.Impl;

import com.nguyenkhanh.CarPark.Repository.ITripRepository;
import com.nguyenkhanh.CarPark.dto.TripDTO;
import com.nguyenkhanh.CarPark.entity.TripEntity;
import com.nguyenkhanh.CarPark.service.ITripService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripService implements ITripService {
//    @Autowired
//    private ITripRepository tripRepository;
//
//    @Autowired
//    private ModelMapper modelMapper;

    private final ModelMapper modelMapper;
    private final ITripRepository tripRepository;

    public TripService(ModelMapper modelMapper, ITripRepository tripRepository) {
        this.modelMapper = modelMapper;
        this.tripRepository = tripRepository;
    }

    @Override
    public void addTrip(TripDTO tripDTO) {
        TripEntity entity = modelMapper.map(tripDTO, TripEntity.class);
        tripRepository.save(entity);
    }

    @Override
    public List<TripDTO> listTrip() {
        List<TripEntity> listTripEntity = tripRepository.findAll(Sort.by(Sort.Direction.ASC, "tripId"));
        List<TripDTO> listTripDTO = listTripEntity.stream().map(tripEntity -> modelMapper.map(tripEntity, TripDTO.class)).collect(Collectors.toList());
        return listTripDTO;
    }
}
