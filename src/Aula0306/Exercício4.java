package Aula0306;

import java.lang.Math;
import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valor, resultado, raizQuadrada, elevadoAoQuadrado;
		
		System.out.println("Digite um valor: ");
		valor = input.nextDouble();
		
		resultado = valor % 2;
		
		if (resultado == 0) {
			raizQuadrada = Math.sqrt(valor);
			System.out.printf("Seu número é par, e a raiz quadrada dele é: %.2f", raizQuadrada);
		}
		else {
			elevadoAoQuadrado = valor * valor;
			System.out.println("Seu número é ímpar, e elevado ao quadrado é: " + elevadoAoQuadrado);
		}
		
		input.close();
	}
}
