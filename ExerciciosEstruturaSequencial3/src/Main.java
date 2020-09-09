import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
		int IDFuncionario = sc.nextInt();
		double horas = sc.nextDouble();
		double valorhora = sc.nextDouble();
		
		double salary = horas * valorhora;
		
		System.out.println("NUMBER = " + IDFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
			sc.close();
	}
}
