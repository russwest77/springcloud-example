package com.wondersgroup.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication // springboot启动类注解
@EnableEurekaServer // springcloud eureka server
public class Application{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
