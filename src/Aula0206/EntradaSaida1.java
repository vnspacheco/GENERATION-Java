package Aula0206;

import java.util.Scanner;

public class EntradaSaida1 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		int a, b, soma;
		
		System.out.println("Digite o valor de A: ");
		a = input.nextInt();
		System.out.println("Digite o valor de B: ");
		b = input.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de A + B é: " + soma);
		
		input.close();
	}

}
