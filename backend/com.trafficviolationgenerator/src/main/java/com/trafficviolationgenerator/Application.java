package com.trafficviolationgenerator;

import com.trafficviolationgenerator.model.TrafficViolation;
import com.trafficviolationgenerator.services.Converter;
import com.trafficviolationgenerator.services.RequestService;
import com.trafficviolationgenerator.services.ViolationDataGeneratorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URISyntaxException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws URISyntaxException {

		//SpringApplication.run(Application.class, args);

		ViolationDataGeneratorService service = new ViolationDataGeneratorService();

		while (true) {
			TrafficViolation violation = new TrafficViolation(service);

			String resposta = Converter.convertObjectToJson(violation);

			RequestService.generateRequest(resposta);
			try{Thread.sleep(3000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

