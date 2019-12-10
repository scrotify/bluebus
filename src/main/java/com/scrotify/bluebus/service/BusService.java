package com.scrotify.bluebus.service;

import java.time.LocalDate;
import java.util.List;

import com.scrotify.bluebus.dto.SearchResponseBusDto;

public interface BusService {
 public List<SearchResponseBusDto> searchABus(String startingPlace, String destinationPalace,LocalDate dateOfJourney) throws Exception;


}
