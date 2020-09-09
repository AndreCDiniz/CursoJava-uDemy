import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = 0;
		int gasolinac = 0;
		int alcoolc = 0;
		int dieselc = 0;
		
		while (entrada != 4) {
				if (entrada == 1) {
					alcoolc = alcoolc + 1;
				}
				else if (entrada == 2) {
					gasolinac = gasolinac + 1;
				}
				else if (entrada == 3) {
					dieselc = dieselc + 1;					
				}
			
					entrada = sc.nextInt();					
			}
		
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alcoolc);
				System.out.println("Gasolina: " + gasolinac);
				System.out.println("Diesel: " + dieselc);

		
				
				sc.close();
		
	
	
	}
			
		
		
		

}

