package Aula0406;

import java.util.Scanner;

public class Exercício6 {
	public static void main(String[] args) {
		int numero, resultado, soma = 0, media, numerosDigitados = -1;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite um valor: ");
			numero = input.nextInt();
			
			resultado = numero % 3;
			
			if(resultado == 0) {
				numerosDigitados += 1;
				soma += numero;
			}
			else {}
		}
		while(numero != 0);
		
		media = soma / numerosDigitados;
		System.out.println("Média de números múltiplos de três: " + media);
		
		input.close();
	}
}
