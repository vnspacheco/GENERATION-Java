package Aula0306;

import java.util.Scanner;

public class LaçoCondicional2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double n1, n2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = input.nextDouble();
		
		System.out.println("Digite a operação: ");
		operacao = input.next().charAt(0);
		
		System.out.println("Digite o segundo valor: ");
		n2 = input.nextDouble();
		
		if (operacao == '+') {
			resultado = n1 + n2;
		}
		else if (operacao == '-') {
			resultado = n1 - n2;
		}
		else if (operacao == '*') {
			resultado = n1 * n2;
		}
		else if (operacao == '/') {
			resultado = n1 / n2;
		}
		
		System.out.println("Resultado: " + resultado);
	
		input.close();
	}
}
