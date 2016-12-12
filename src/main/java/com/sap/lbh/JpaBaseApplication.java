package com.sap.lbh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({ "com.sap.lbh" })
public class JpaBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBaseApplication.class, args);
	}
}
