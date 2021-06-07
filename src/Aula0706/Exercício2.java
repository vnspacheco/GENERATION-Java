package Aula0706;

import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int[] pares = new int[6];
		int[] impares = new int[6];
		int somaNumerosPares = 0, quantNumerosImpares = 0;
		
		System.out.println("Digite 6 valores: ");
		
		for(int c = 0; c < vetor.length; c++) {
			vetor[c] = input.nextInt();
			if(vetor[c] % 2 == 0) {
				somaNumerosPares += vetor[c];
				pares[c] = vetor[c];
			}
			else {
				quantNumerosImpares += 1;
				impares[c] = vetor[c];
			}
		}
		System.out.println("Números pares: ");
		for(int c = 0; c < vetor.length; c++) {
			if(pares[c] != 0) {
			System.out.print("[ " + pares[c] + " ] ");
			}
			else {}
		}
		System.out.println("\n\nSoma dos números pares digitados: " + somaNumerosPares + "\n");
		System.out.println("Números ímpares: ");
		for(int c = 0; c < vetor.length; c++) {
			if(impares[c] != 0) {
			System.out.print("[ " + impares[c] + " ] ");
			}
			else {}
		}
		System.out.println("\n\nQuantidade de números ímpares digitados: " + quantNumerosImpares);
		
		input.close();
	}
}
