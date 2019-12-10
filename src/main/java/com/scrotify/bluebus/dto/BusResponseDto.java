package com.scrotify.bluebus.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class BusResponseDto {
	private List<SearchResponseBusDto> searchResponseDto;
	private String message;
	private Integer statusCode;

}
