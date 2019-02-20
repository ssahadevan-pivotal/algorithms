package com.ss.algorithms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmsApplication.class, args);
		
		System.out.println("Hello");
		// System.out.println( "Sum of " + 1 + "and " + 2 + "=" + add(1 , 2) );
		Add addClass = new Add ( 11, 21);
		System.out.println( "Result is " + addClass.getResult());
	}

	
	
}
