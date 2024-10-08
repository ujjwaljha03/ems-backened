package com.ujjwal.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class EmsBackenedApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsBackenedApplication.class, args);
	}

}
