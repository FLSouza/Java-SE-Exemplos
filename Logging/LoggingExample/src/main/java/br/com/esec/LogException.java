package br.com.esec;

import org.apache.log4j.Logger;

public class LogException{
	
	final static Logger logger = Logger.getLogger(LogException.class);
	
	// Neste exemplo o log4j é usado para logar uma exception
	public static void main(String[] args) {
	
		LogException obj = new LogException();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 10 /0;

	}
	
}