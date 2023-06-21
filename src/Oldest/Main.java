package Oldest;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//9. Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.
	
	System.out.println("Quantas pessoas você vai digitar? ");
	int quantityPeople = sc.nextInt();
	
	String[] names = new String[quantityPeople];
	int[] ages = new int[quantityPeople];
	
	for(int i = 0; i < quantityPeople; i++) {
		System.out.printf("Dados da %da pessoa: %n", i+1);
		System.out.println("Nome: ");
		String name = sc.next();
		names[i] = name;
		System.out.println("Idade: ");
		int age = sc.nextInt();
		ages[i] = age;
	}
	
	String oldestPerson = null;
	
	for(int i = 0; i < quantityPeople; i++) {
		if(i==0) {
			oldestPerson = names[i];
		} else {
			if(ages[i]>ages[i-1]) {
				oldestPerson = names[i];
			}
		}
	}
	
	System.out.printf("PESSOA MAIS VELHA: %s", oldestPerson);
	sc.close();

	}

}
