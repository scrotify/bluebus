package com.scrotify.bluebus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrotify.bluebus.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long>{

}
