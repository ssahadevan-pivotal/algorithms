package com.ss.algorithms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;



// import hello.Model;
// import hello.RequestParam;


@RestController
public class AlgorithmController {
	
	  //private CredhubProperties credhubProperties;

	  //  public CredhubValueController(CredhubProperties credhubProperties) {
	  //      this.credhubProperties = credhubProperties;
	  //  }
	
	   @GetMapping("/")
	   public String getIndex() {
		   return "index.html" ;
	   }

	    @GetMapping("/add")
	    public String getAdd(@RequestParam(value="firstValue", defaultValue="10") String firstValue 
	    		             , @RequestParam(value="secondValue", defaultValue="10") String secondValue
	    		)   {
	    	int firstVal = Integer.parseInt( firstValue ) ;
	    	int secondVal = Integer.parseInt( secondValue ) ;
	    	Add addClass = new Add( firstVal , secondVal);
			System.out.println( "Result is " + addClass.getResult());
			return (  "Result is " + addClass.getResult() );
			
	    	//return ("5") ;
	    	
	    }
	    
	    @GetMapping("/subtract")
	    public String getSubrtract(@RequestParam(value="firstValue", defaultValue="10") String firstValue 
	    		             , @RequestParam(value="secondValue", defaultValue="10") String secondValue
	    		)   {
	    	int firstVal = Integer.parseInt( firstValue ) ;
	    	int secondVal = Integer.parseInt( secondValue ) ;
	        Subtract subtractClass = new Subtract( firstVal , secondVal);
			System.out.println( "Result is " + subtractClass.getResult());
			return (  "Result is " + subtractClass.getResult() );
			
	    	//return ("5") ;
	    	
	    }
	    
	    // Greatest Common Divisor  - Test
	    @GetMapping("/gcd")
	    public String gcd( 
	    		         @RequestParam(value="firstValue", defaultValue="10") String firstValue 
	                     ,@RequestParam(value="secondValue", defaultValue="10") String secondValue
	    		) {
	    	int firstVal = Integer.parseInt( firstValue ) ;
	    	int secondVal = Integer.parseInt( secondValue ) ;
	    	GreatestCommonDivisor gcd = new GreatestCommonDivisor( firstVal, secondVal);
			System.out.println( "Result is " + gcd.getResult());
			return (  "Result is " + gcd.getResult() );
	    }
	    
	   
	}


