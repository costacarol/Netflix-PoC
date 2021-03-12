package com.example.EurekaSendHeartBeats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EurekaSendHeartBeatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSendHeartBeatsApplication.class, args);
	}

}
