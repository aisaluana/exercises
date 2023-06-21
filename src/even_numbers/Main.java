package even_numbers;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//4. Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.
		
		System.out.println("Quantos números você vai digitar?: ");
		
		int number = sc.nextInt();
		
		int[] vectAll = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.println("Digite: ");
			vectAll[i] = sc.nextInt(); 
		}
		
		int isEven = 0;
		
		System.out.println("NÚMEROS PARES:");
		
		for (int i = 0; i<number; i++) {
			if (vectAll[i]%2 == 0) {
				System.out.printf("%d ", vectAll[i]);
				isEven++;
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", isEven);
		
		sc.close();

	}

}
