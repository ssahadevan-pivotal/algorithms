package com.ss.algorithms;

public class Add {
	
	private int firstValue;
	private int secondValue ;
	private int result;
	
	public Add(int firstVal , int secondVal )
	{
		firstValue = firstVal;
		secondValue= secondVal;
		setResult(firstVal + secondVal) ;
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
