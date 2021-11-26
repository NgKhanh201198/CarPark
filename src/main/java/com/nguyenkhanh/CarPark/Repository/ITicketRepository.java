package com.nguyenkhanh.CarPark.Repository;

import com.nguyenkhanh.CarPark.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITicketRepository extends JpaRepository<TicketEntity, Long> {
}
