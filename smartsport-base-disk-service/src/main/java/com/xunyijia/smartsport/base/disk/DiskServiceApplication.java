package com.xunyijia.smartsport.base.disk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiskServiceApplication.class, args);
	}
}
