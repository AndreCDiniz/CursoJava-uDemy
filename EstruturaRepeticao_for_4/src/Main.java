import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		for (int i = 0; i < entrada; i++) {
			
			double n1 = sc.nextInt();
			double n2 = sc.nextInt();
			
			double divisao;
					
			divisao = n1 / n2;
			
				if( n2 == 0 ) {
					System.out.println("Divisão Impossível");				
				}else {
					System.out.println(divisao);
				}
						
		}
		
		sc.close();

	}

}
