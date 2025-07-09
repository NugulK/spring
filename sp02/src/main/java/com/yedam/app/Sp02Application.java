package com.yedam.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration // Auto-Config
@ComponentScan // Spring

@MapperScan(basePackages = "com.yedam.app.**.mapper") // mybatis
public class Sp02Application {
	public static void main(String[] args) {
		SpringApplication.run(Sp02Application.class, args);
	}
}
