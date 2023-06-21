package Product;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
		
		System.out.print("How many products are there? ");
		int nn = sc.nextInt();
		
		Product[] vectProduct = new Product[nn];
		
		
		for (int i = 0; i<vectProduct.length;i++) {
			sc.nextLine(); // Para dar o espaço!!!
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vectProduct[i] = new Product(name, price); //instanciar um novo produto como referencia para ser apontado.
			
		}
		
		double sumProducts = 0;
		for (int i = 0; i<vectProduct.length;i++) {
			sumProducts += vectProduct[i].getPrice(); //pegar apenas o atributo price na instância
		}
		
		double avgProducts = sumProducts / vectProduct.length;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avgProducts);
		
		sc.close();

	}

}
