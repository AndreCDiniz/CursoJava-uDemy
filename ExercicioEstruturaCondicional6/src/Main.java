import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String intervalo;
		
		
		if (x > 0 && y > 0) {
			intervalo = "Q1";
		}
		else if (x < 0 && y > 0) {
			intervalo = "Q2";
		}
		else if (x < 0 && y < 0) {
			intervalo = "Q3";
		}
		else if (x > 0 && y < 0) {
			intervalo = "Q4";
		}
		else {
			intervalo = "Origem";
		}
		
		System.out.println(intervalo);
		
		sc.close();
	}

}
