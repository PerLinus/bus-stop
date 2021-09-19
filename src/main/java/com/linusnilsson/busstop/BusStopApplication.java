package com.linusnilsson.busstop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusStopApplication {

	private static final Logger LOG = LoggerFactory.getLogger(BusStopApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BusStopApplication.class, args);

	}

}
