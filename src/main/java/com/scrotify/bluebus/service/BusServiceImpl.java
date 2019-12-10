package com.scrotify.bluebus.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrotify.bluebus.dto.SearchResponseBusDto;
import com.scrotify.bluebus.entity.Bus;
import com.scrotify.bluebus.repository.BusRepository;

/**
 * @author N Naresh
 * @Description: this bus service will operate the bus operations like get list
 *               of all buses
 *
 */
@Service
public class BusServiceImpl implements BusService {
	@Autowired
	BusRepository busRepository;

	/**
	 * @Description:this method helps to get the list of available buses based on
	 *                   the users request.
	 * @param startingPlace
	 * @param destinationPalace
	 * @param noOfPassengers
	 * @param dateOfJourney
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<SearchResponseBusDto> searchABus(String startingPlace, String destinationPlace, LocalDate journeyDate)
			throws Exception {
		SearchResponseBusDto searchResponseBusDto = null;
		List<SearchResponseBusDto> buses = new ArrayList<>();
		LocalDate currentDate = LocalDate.now();
		if (journeyDate.isAfter(currentDate)) {
			List<Bus> availableBus = busRepository.findByStartingPlaceAndDestinationPlaceStartsWith(startingPlace,
					destinationPlace);
			for (Bus bus : availableBus) {
				searchResponseBusDto = new SearchResponseBusDto();
				BeanUtils.copyProperties(bus, searchResponseBusDto);
				buses.add(searchResponseBusDto);

			}
		} else {
			throw new Exception("there are no available seats");
		}

		return buses;
	}
}
