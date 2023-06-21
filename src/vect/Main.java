package vect;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercícios com o professor sobre Vetores
		
		//1. Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("How many people are there? ");
		int n = sc.nextInt();
				
		double[] vect = new double[n]; //criar o array e identificar a quantidade de elementos
	
		for(int i=0; i < n ; i++) {
			vect[i] = sc.nextDouble(); //na posição i do array, ele vai receber o double digitado
		}
		
		double sumHeight = 0.0;
		for (int i = 0; i < n; i++) {
			sumHeight += vect[i];
		}
		
		double avgHeight = sumHeight / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avgHeight);
		
		sc.close();
	}

}
