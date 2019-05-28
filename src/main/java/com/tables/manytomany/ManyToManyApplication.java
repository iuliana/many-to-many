package com.tables.manytomany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ManyToManyApplication {

	private static Logger logger = LoggerFactory.getLogger(ManyToManyApplication.class);

	public static void main(String... args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ManyToManyApplication.class, args);
		ctx.registerShutdownHook();
		logger.info("Application Started ...");
	}

}
