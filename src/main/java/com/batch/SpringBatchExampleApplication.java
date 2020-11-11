package com.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchExampleApplication {
	//https://github.com/github4codedebugger/spring-batch-application-mysql
	//https://www.youtube.com/watch?v=9XINDYrBgnw

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchExampleApplication.class, args);
	}

}
