package com.ljm.uil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UilApplication extends SpringBootServletInitializer {

	static Logger logger = LogManager.getLogger(UilApplication.class);

	public static void main(String[] args) {

		logger.debug("start application !!!!!!!!!2222");

		SpringApplication.run(UilApplication.class, args);
	}

}
