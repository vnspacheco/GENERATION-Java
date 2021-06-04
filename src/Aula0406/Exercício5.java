package Aula0406;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("Digite um valor: ");
		
		do {
			
			numero = input.nextInt();
			soma += numero;
			
		}
		while (numero != 0);
		
		System.out.println("Soma dos valores digitados: " + soma);
		
		input.close();
	}
}
