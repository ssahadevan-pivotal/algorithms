/**
 * 
 */
package com.ss.algorithms;



/**
 * @author ssahadevan
 *
 */
public class GreatestCommonDivisor {
	
	private int firstValue;
	private int secondValue ;
	private int result;

	public GreatestCommonDivisor(int firstVal , int secondVal )
	{
		firstValue = firstVal;
		secondValue= secondVal;
	}

	
	/**
	 * @return the result
	 */
	public int getResult() {
		result = calculate( this.firstValue, this.secondValue );
		return result;
	}

	
	public int calculate( int firstVal , int secondVal )
	{
		int remainder ;
		
		this.firstValue = firstVal ;
		this.secondValue = secondVal ;
		
		remainder = firstValue/secondValue ;
		if ( remainder == 0 )
		{
			result= this.secondValue;
			return this.secondValue ;
		}
		result = calculate( secondValue , remainder );
		System.out.println("GCD is " + result);
		return result;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
