package com.baeldung.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication	
@Slf4j
public class Hexagonal {
    public static void main(String[] args) {
	log.info("Hexagonal Architecture Sample Service Starting up..!!");

	SpringApplication.run(Hexagonal.class, args);
    }
}
