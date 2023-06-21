package sum_vect;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//6. Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado. 
		
		System.out.println("Qual o tamanho dos vetores? ");
		int size = sc.nextInt();
		
		System.out.println("Digite os elementos do vetor A: ");
		
		int[] vectA = new int[size];
		
		for(int i = 0; i<size; i++) {
			
			vectA[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite os elementos do vetor B: ");
		
		int[] vectB = new int[size];
		
		for(int i = 0; i<size; i++) {
			
			vectB[i] = sc.nextInt();
			
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		int[] vectC = new int[size];
		
		for(int i = 0; i<size; i++) {
			
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
			
			
		}
		sc.close();
		

	}

}
