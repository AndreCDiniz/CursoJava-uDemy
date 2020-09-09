import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;		
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%s tem %d anos de idade, e recebe R$ %.2f reais por mês.%n", nome, idade, renda);
		
		
		
	}

}
