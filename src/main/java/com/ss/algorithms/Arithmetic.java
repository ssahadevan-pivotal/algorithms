package com.ss.algorithms;

public class Arithmetic {

		
	//private int firstValue;
	//private int secondValue ;
	private int result;
	
	public Arithmetic(int firstVal , int secondVal , String operator) throws Exception
	{
		//firstValue = firstVal;
		//secondValue= secondVal;
		System.out.println("firstVal=" + firstVal
				         + "secondVal =" + secondVal 
				         + "operator is " + operator 
				         );
		
		if ( operator.equalsIgnoreCase("add") || operator.equalsIgnoreCase("+") )
		{
			setResult(firstVal + secondVal) ;
		}
		else if ( operator.equalsIgnoreCase("subtract"))
		{
			setResult(firstVal - secondVal) ;
		}
		else if ( operator.equalsIgnoreCase("multiply"))
		{
			setResult(firstVal * secondVal) ;
		}
		else if ( operator.equalsIgnoreCase("divide"))
		{
			setResult(firstVal / secondVal) ;
		}
		else
			throw new Exception( "Usage sameple " + "http://localhost:8080/arithmetic?firstValue=15&secondValue=5&operator=add)" );
		
	
		
	}

	
	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}
	
	

}
