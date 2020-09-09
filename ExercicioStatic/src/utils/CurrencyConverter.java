package utils;

public class CurrencyConverter {
	
	
	public static double IOF = 0.06;
	
	public static double paidAmount(double dollarPrice, double dollarBought) {
		return dollarPrice * dollarBought * (1.0 + IOF);
	}
	
	
	
	
	

}
