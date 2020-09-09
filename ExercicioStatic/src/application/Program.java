package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price: ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		double result = CurrencyConverter.paidAmount(dollarPrice, dollarBought);
		System.out.printf("Amount to be paid in reais: %.2f", result);

		
		
		
		sc.close();
	}

}
