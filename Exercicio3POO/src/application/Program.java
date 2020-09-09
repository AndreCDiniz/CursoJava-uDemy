package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		aluno.name = sc.nextLine();
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.avarage());
		
		if (aluno.avarage() < 60.0) {
				System.out.println("FAILED");
				System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
			}
			else {
				System.out.println("PASS");
		}
				
		sc.close();
	}

}
