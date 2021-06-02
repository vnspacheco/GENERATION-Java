package Aula0206;

import java.util.Scanner;

public class Exercício2 {
	public static void main (String[] args) {
		
		int idade, idadeEmDias, idadeEmAnos, idadeEmMeses;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a sua idade em dias? ");
		idade = input.nextInt();
		
		idadeEmDias = idade;
		idadeEmAnos = idade / 365;
		idadeEmMeses = idade / 30;
		
		System.out.println("Sua idade em dias: " + idadeEmDias);
		System.out.println("Sua idade em anos: " + idadeEmAnos);
		System.out.println("Sua idade em meses: " + idadeEmMeses);
		
		input.close();
	}
}
