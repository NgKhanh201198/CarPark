package com.nguyenkhanh.CarPark.Repository;

import com.nguyenkhanh.CarPark.entity.ParkingLotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParkingLotRepository extends JpaRepository<ParkingLotEntity, Long> {
}
