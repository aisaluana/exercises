package VectNumbers;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?: ");
		int n = sc.nextInt();
		
		if(n>0 && n<=10) {
		
			int[] vectNumbers = new int[n];
		
			for (int i=n;i>0;i--) {
				sc.nextLine();
				System.out.print("Digite um número: ");
				int x = sc.nextInt();
				vectNumbers[n-i] = x;
			
			}
		
		
			sc.nextLine();
			System.out.println("Números negativos: ");
		
			for (int i=0; i < vectNumbers.length; i++) {
				if (vectNumbers[i] < 0) {
					System.out.println(vectNumbers[i]);
				}
			}
			sc.close();
		} else {
		System.out.println("Digite um número entre 1 e 10");

		}
		
	}
}


		
