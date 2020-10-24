package com.alfredha.dashboardT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.alfredha.services.contentServices;

@SpringBootApplication
@ComponentScan(basePackages = "com.alfredha.dashboardT")
@ComponentScan(basePackages = "com.alfredha.services")
@EnableJpaRepositories("com.alfredha.services.repository")
@EntityScan("com.alfredha.services.entity")
public class DashboardTApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardTApplication.class, args);
	}

}
