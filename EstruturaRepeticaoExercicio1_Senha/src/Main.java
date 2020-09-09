import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int senha = 0;
		
		System.out.println("Por favor, digite sua senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.printf("%nSenha inválida%n");
			System.out.printf("%nDigite a senha novamente%n");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido!");
		
		sc.close();		
		
	}

}
