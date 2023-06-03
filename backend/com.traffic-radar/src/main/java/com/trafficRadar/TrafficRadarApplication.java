package com.trafficRadar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TrafficRadarApplication {

	public static void main(String[] args) {

		SpringApplication.run(TrafficRadarApplication.class, args);

	}
}

