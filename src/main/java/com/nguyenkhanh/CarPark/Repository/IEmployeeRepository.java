package com.nguyenkhanh.CarPark.Repository;

import com.nguyenkhanh.CarPark.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}
