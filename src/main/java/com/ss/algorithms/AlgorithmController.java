package com.ss.algorithms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlgorithmController {
	
	  //private CredhubProperties credhubProperties;

	  //  public CredhubValueController(CredhubProperties credhubProperties) {
	  //      this.credhubProperties = credhubProperties;
	  //  }

	    @GetMapping("/add")
	    public String getAdd() {
	    	Add addClass = new Add ( 11, 21);
			System.out.println( "Result is " + addClass.getResult());
			return (  "Result is " + addClass.getResult() );
	    }
	    
	    // Greatest Common Divisor  - Test
	    @GetMapping("/gcm")
	    public String gcm() {
	    	GreatestCommonDivisor gcd = new GreatestCommonDivisor( 10, 2);
			System.out.println( "Result is " + gcd.getResult());
			return (  "Result is " + gcd.getResult() );
	    }
	}


