package com.scrotify.bluebus.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scrotify.bluebus.dto.BusResponseDto;
import com.scrotify.bluebus.dto.SearchResponseBusDto;
import com.scrotify.bluebus.service.BusService;

/**
 * @author N Naresh
 * @Description: this bus service will operate the bus operations like get list of all buses
 *
 */
@RestController
public class BusController {
@Autowired
BusService busService;
	/**
	 * @param startingPlace
	 * @param destinationPalace
	 * @param noOfPassengers
	 * @param dateOfJourney
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/bluebus/buses/{startingplace}/{destanationPlace}/{noOfPassangers}/{dateOfJourney}")
	public ResponseEntity<BusResponseDto >searchABus(@RequestParam String startingPlace,@RequestParam String destinationPlace
			, @RequestParam Integer noOfPassengers, @RequestParam @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) LocalDate dateOfJourney) throws Exception{
		BusResponseDto busResponseDto=new BusResponseDto();
		
		List<SearchResponseBusDto> searchResponseBusDto=busService.searchABus(startingPlace, destinationPlace, dateOfJourney);
		busResponseDto.setSearchResponseDto(searchResponseBusDto);
		busResponseDto.setMessage("Available buses");
		busResponseDto.setStatusCode(201);
		return new ResponseEntity<>(busResponseDto, HttpStatus.OK);
	}
	
}
