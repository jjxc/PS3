package Exceptions;

import java.io.*;

public class InsufficientFundsException extends Exception {
	
	private double overdraw;
	 
	public InsufficientFundsException(double overdraw) {
	   this.overdraw = overdraw;
	} 

	public double getOverdraw() {
	   return overdraw;
	}
}
