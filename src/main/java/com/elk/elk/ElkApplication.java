package com.elk.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkApplication implements CommandLineRunner {

	private final static Logger logger= LoggerFactory.getLogger(ElkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ElkApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("=========hello--World cIa========pmergeremoterun");
	}
}
