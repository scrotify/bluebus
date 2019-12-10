package com.scrotify.bluebus.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrotify.bluebus.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

	Optional<Bus> findByAvailableSeats(Integer availableSeats);
	List<Bus> findByStartingPlaceStartsWith(String startingPlace);

	List<Bus> findByDestinationPlaceStartsWith(String destinationPlace);

	List<Bus> findByStartingPlaceAndDestinationPlaceStartsWith(String startingPlace, String destinationPlace);

}
