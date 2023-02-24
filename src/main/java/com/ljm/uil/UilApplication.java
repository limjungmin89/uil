package com.ljm.uil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UilApplication {

	static Logger logger = LogManager.getLogger(UilApplication.class);

	public static void main(String[] args) {

		logger.debug("start application");

		SpringApplication.run(UilApplication.class, args);
	}

}
