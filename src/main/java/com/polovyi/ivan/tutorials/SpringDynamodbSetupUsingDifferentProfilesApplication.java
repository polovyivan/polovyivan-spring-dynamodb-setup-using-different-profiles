package com.polovyi.ivan.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class SpringDynamodbSetupUsingDifferentProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDynamodbSetupUsingDifferentProfilesApplication.class, args);
	}

}
