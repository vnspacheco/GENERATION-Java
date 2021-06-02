package Aula0206;

import java.util.Scanner;

public class Exercício8 {
	public static void main (String [] args) {
		
		double custoDoCarro, distribuidor, imposto, valorFinal;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o custo do carro? ");
		custoDoCarro = input.nextDouble();
		
		imposto = custoDoCarro * 0.45;
		distribuidor = custoDoCarro * 0.28;
		valorFinal = custoDoCarro + imposto + distribuidor;
		
		System.out.printf("Custo ao consumidor: %.2f", valorFinal);
		
		input.close();
	}
}
