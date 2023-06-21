package Approved;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//10. Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int quantityStudent = sc.nextInt();
		
		String[] nameStudents = new String[quantityStudent];
		
		double[] averageGrade = new double[quantityStudent];
		
		for(int i = 0; i < quantityStudent; i++) {
			System.out.printf("Digite nome, primeira e segunda da %da pessoa: %n", i+1);
			System.out.println("Nome: ");
			String name = sc.next();
			nameStudents[i]=name;
			
			System.out.println("Primeira nota: ");
			double first = sc.nextDouble();
			
			System.out.println("Segunda nota: ");
			double second = sc.nextDouble();
			
			double avg = (first + second)/2;
			averageGrade[i] = avg;
			
			
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < quantityStudent; i++) {
			if(averageGrade[i]>= 6) {
				System.out.println(nameStudents[i]);
			}
		}
		
		sc.close();
	}
}
