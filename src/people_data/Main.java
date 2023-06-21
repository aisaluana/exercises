package people_data;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	//11. Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int quantityPeople = sc.nextInt();
		int quantityMen = 0;
		int quantityWomen = 0;
		double shortest = 0;
		double highest = 0;
		double sumWomen = 0;
		
		double[] heightPeople = new double[quantityPeople];
		
		char[] gender = new char[quantityPeople];
		
		
		
		for(int i = 0; i < quantityPeople; i++) {
			System.out.printf("Digite altura da %da pessoa: %n", i+1);
			heightPeople[i] = sc.nextDouble();
			
			
			
			if(i==0) {
				shortest = heightPeople[i];
				highest = heightPeople[i];
			} else {
				if(heightPeople[i]>highest) {
					highest = heightPeople[i];
				} else if(heightPeople[i]<shortest){
					shortest = heightPeople[i];
				}
			}
			System.out.printf("Digite gênero da %da pessoa: %n", i+1);
			gender[i] = sc.next().toUpperCase().charAt(0);
			
		}
		
		for(int i = 0; i<quantityPeople; i++) {
			if(gender[i] == 'M') {
				quantityMen++;
				
			} else {
				quantityWomen++;
				sumWomen+= heightPeople[i];
			}
		}
		
		System.out.printf("MENOR ALTURA: %.2f%n", shortest);
		System.out.printf("MAIOR ALTURA: %.2f%n", highest);
		System.out.printf("MÉDIA DA ALTURA DAS MULHERES: %.2f%n", sumWomen/quantityWomen);
		System.out.printf("NÚMERO DE HOMENS: %d%n", quantityMen);
		sc.close();
	}

	

}
