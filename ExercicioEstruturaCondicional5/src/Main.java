import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		String intervalo;

		if (valor <= 25 && valor >= 0 ) {
			intervalo = "Intervalo [0,25]";
		}
		else if (valor > 25 && valor <= 50 ) {
			intervalo = "Intervalo (25,50]";	
		} 
		else if (valor > 50 && valor <= 75) {
			intervalo = "Intervalo (50,75]";
		}
		else if (valor > 75 && valor <= 100) {
			intervalo = "Intervalo (75,100]";
		}
		else {
			intervalo = "Fora do intervalo";
		}
		
		System.out.println(intervalo);
		
		
		sc.close();
		
		
	}

}
