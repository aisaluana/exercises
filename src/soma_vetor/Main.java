package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//2. Faça um programa que leia n números reais e armazene-os em um vetor. Em seguida:
		// - Imprimir todos os elementos do vetor;
		// - Mostrar na tela a soma e a média dos elementos do vetor;
	
	System.out.println("Quantos números você vai digitar?: ");
	int n = sc.nextInt();
	
	double[] vectNumbers = new double[n];
	
	for (int i=0;i<n;i++) {
		sc.nextLine();
		System.out.print("Digite um número: ");
		double x = sc.nextDouble();
		vectNumbers[i] = x;
	}
	
	sc.nextLine();
	double sum = 0;
	
	System.out.print("Valores = ");
	for (int i=0; i<vectNumbers.length; i++) {
		System.out.printf("%.1f ", vectNumbers[i]);
		sum += vectNumbers[i];
	}
	System.out.printf("\nSOMA = %.2f%n", sum);
	double avg = sum/vectNumbers.length;
	
	System.out.printf("MEDIA = %.2f", avg);
	
	sc.close();

	}

}
