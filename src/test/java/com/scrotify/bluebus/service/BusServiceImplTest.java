package com.scrotify.bluebus.service;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.scrotify.bluebus.repository.BusRepository;

@RunWith(MockitoJUnitRunner.Silent.class)
public class BusServiceImplTest {

	@InjectMocks
	BusServiceImpl busServiceImpl;
	@Mock
	BusRepository busRepository;
}
