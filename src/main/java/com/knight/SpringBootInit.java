package com.knight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.knight")
public class SpringBootInit {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInit.class, args);
	}

}
