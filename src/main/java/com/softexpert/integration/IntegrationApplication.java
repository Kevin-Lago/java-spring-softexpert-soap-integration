package com.softexpert.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationApplication.class, args);
	}

//	@Bean
//	CommandLineRunner lookup(TableRecordClient tableRecordClient) {
//		return args -> {
////			String country = "Spain";
////
////			if (args.length > 0) {
////				country = args[0];
////			}
////			tableRecordClient.getTableRecords();
////			System.err.println(response.getCountry().getCurrency());
//		};
//	}

}
