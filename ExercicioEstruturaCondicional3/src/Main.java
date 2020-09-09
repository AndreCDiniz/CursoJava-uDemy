import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			
		int hinicio = sc.nextInt();
		int hfinal = sc.nextInt();
		int duracao;	
		
		if (hinicio < hfinal) {
			duracao = hfinal - hinicio;
		} 
		else {
			duracao = 24 - hinicio + hfinal;
		}
			
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		sc.close();

	}

}
