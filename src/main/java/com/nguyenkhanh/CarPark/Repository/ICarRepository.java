package com.nguyenkhanh.CarPark.Repository;

import com.nguyenkhanh.CarPark.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepository extends JpaRepository<CarEntity, Long> {
}
