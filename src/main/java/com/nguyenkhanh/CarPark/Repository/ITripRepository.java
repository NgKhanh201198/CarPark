package com.nguyenkhanh.CarPark.Repository;

import com.nguyenkhanh.CarPark.entity.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITripRepository extends JpaRepository<TripEntity, Long> {
}
