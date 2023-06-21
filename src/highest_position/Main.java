package highest_position;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//5. Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero). 

		System.out.println("Quantos números você vai digitar?: ");
		
		int numberDouble = sc.nextInt();
		
		double[] vectAllDouble = new double[numberDouble];
		
		System.out.println("Digite: ");
		
		for(int i =0; i<numberDouble; i++) {
			vectAllDouble[i] = sc.nextDouble();
		}
		
		double highestNumber = 0;
		
		int position = 0;
		
		for(int i = 0; i<numberDouble; i++) {
			if(i==0) {
				highestNumber = vectAllDouble[i];
				position = i;
			} else {
				if (vectAllDouble[i] > highestNumber) {
					highestNumber = vectAllDouble[i];
					position = i;
				} 
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", highestNumber);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", position);
		
		sc.close();
		

	}

}
