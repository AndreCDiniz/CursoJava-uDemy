
	import java.util.Locale;
	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double media = 0;
			int n = sc.nextInt();
			
			
			for (int i = 0; i < n; i++) {
				
				double n1 = sc.nextDouble();
				double n2 = sc.nextDouble();
				double n3 = sc.nextDouble();
				
				n1 = n1 * 0.2;
				n2 = n2 * 0.3;
				n3 = n3 * 0.5;
				
				media = (n1 + n2 + n3);			
				
				System.out.println(media);
				
			}
			
			sc.close();
						
		}
	
	}
