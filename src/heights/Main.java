package heights;

import java.util.Locale;
import java.util.Scanner;

import entities.Height;

public class Main {

	public static void main(String[] args) {
		// 3. Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar?: ");
		int n = sc.nextInt();
		
		Height[] vectHeight = new Height[n];
		
		for (int i = 0;i<vectHeight.length;i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			vectHeight[i] = new Height(name,age,height);
		}
		
		double sum = 0;
		
		for (int i = 0;i<vectHeight.length;i++) {
			sum += vectHeight[i].getHeight();
		}
		
		double avg = sum / vectHeight.length;
		System.out.printf("Altura média: %.2f%n", avg);
		
		double underSixteen = 0;
		
		for (int i = 0;i<vectHeight.length;i++) {
			if(vectHeight[i].getAge() < 16) {
				underSixteen +=1;
			}
		}
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f", (underSixteen*100)/vectHeight.length);
		System.out.println("%");
		
		for (int i = 0;i<vectHeight.length;i++) {
			if(vectHeight[i].getAge() < 16) {
				
				System.out.println(vectHeight[i].getName());
			}
		}
		
		sc.close();
				
				

	}

}
