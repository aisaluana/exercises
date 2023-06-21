package average_evens;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//8. Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
		
		System.out.println("Quantos números você vai digitar? ");
		
		int numberAverageEven = sc.nextInt();
		
		int[] vectNumberAverageEven = new int[numberAverageEven];
		
		int sumNumberEven = 0;
		
		int numberEven = 0;
		
		for (int i = 0; i < numberAverageEven; i++) {
			System.out.println("Digite: ");
			vectNumberAverageEven[i] = sc.nextInt();
			if(vectNumberAverageEven[i]%2==0) {
				sumNumberEven+=vectNumberAverageEven[i];
				numberEven +=1;
			}
		}
		
		double averageEven = sumNumberEven / numberEven;
		
		if(sumNumberEven == 0) {
			System.out.println("NENHUM NÚMERO PAR!");
		} else {
			System.out.printf("MÉDIA DOS PARES = %.1f", averageEven);
		}
		
		sc.close();

	}

}
