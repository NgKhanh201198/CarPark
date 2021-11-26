package com.nguyenkhanh.CarPark.Repository;

import com.nguyenkhanh.CarPark.entity.BookingOfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookingOfficeRepository extends JpaRepository<BookingOfficeEntity, Long> {
}
