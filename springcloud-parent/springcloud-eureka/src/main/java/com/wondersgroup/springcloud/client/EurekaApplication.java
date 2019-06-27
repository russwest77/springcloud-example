package com.wondersgroup.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // springcloud eureka client
public class EurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
