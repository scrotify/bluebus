package com.scrotify.bluebus.dto;

import java.time.LocalTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SearchResponseBusDto {
	private String busNo;
	private String busName;
	private String startingPlace;
	private String destinationPlace;
	private Integer availableSeats;
	private LocalTime depatureTime;
	private LocalTime arrivalTime;
	private String duration;
	

}
