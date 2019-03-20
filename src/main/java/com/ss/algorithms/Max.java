package com.ss.algorithms;

public class Max {

	
	private int result;
	boolean debug = false;
	
	
	public Max(int firstVal , int secondVal ) throws Exception
	{
		//firstValue = firstVal;
		//secondValue= secondVal;
		if ( debug )
		{
		System.out.println("firstVal=" + firstVal
				         + "secondVal =" + secondVal 
				         
				         );
		}
		
	  result = setResult( firstVal , secondVal );
		
	}
	
	public int getResult()
	{
		return result;
	}
	
	public int setResult( int firstVal , int secondVal )
	{
		if ( firstVal > secondVal ) 
			result = firstVal ;
		else
			result = secondVal ;
		
		return result;
		
	}
		
}
