package below_average;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//7. Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
		
		System.out.println("Quantos números você vai digitar? ");
		
		int numberAverage = sc.nextInt();
		
		double[] vectNumberAverage = new double[numberAverage];
		
		double sumNumber = 0;
		
		for(int i = 0; i<numberAverage; i++) {
			System.out.println("Digite: ");
			vectNumberAverage[i] = sc.nextDouble();
			sumNumber += vectNumberAverage[i];
		}
		
		double averageNumber = sumNumber/numberAverage;
		
		System.out.println();
		
		System.out.printf("MEDIA DO VETOR = %.3f", averageNumber);
		
		System.out.println();
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		
		for(int i = 0; i<numberAverage; i++) {
			
			if(vectNumberAverage[i] < averageNumber) {
				System.out.println(vectNumberAverage[i]);
			}
		}
		
		sc.close();
				
	}

}
