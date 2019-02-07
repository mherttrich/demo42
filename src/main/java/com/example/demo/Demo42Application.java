package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;

@SpringBootApplication

public class Demo42Application implements CommandLineRunner {

	@Inject
	String who;

	public static void main(String[] args) {
		SpringApplication.run(Demo42Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("hallo " + who);
	}
}

