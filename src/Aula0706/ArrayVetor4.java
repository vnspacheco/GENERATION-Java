package Aula0706;

import java.util.Scanner;

public class ArrayVetor4 {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			double[] notas = new double[4];
			double soma = 0.0, media = 0.0;
			int i;
			
			System.out.println("Digite as quatro notas do Aluno: ");
			
			for(i = 0 ; i < 4; i++) {
				notas[i] = input.nextDouble();
			}
			for(i = 0 ; i < 4; i++) {
				soma += notas[i];
			}
			media = soma / 4;
			
			System.out.println("A soma das notas: " + soma);
			System.out.println("A média das notas: " + media);
			
			input.close();
		}
	}
}
