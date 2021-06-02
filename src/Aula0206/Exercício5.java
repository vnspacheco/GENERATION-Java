package Aula0206;

import java.util.Scanner;

public class Exercício5 {

	public static void main (String [] args) {
		
		double nota1, nota2, nota3, media, mediaPeso;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual foi a primeira nota? ");
		nota1 = input.nextDouble();
		System.out.println("Qual foi a segunda nota? ");
		nota2 = input.nextDouble();
		System.out.println("Qual foi a terceira nota? ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		mediaPeso = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10.0;
		
		System.out.printf("Média final: %.2f", media);
		
		input.close();
	}
}
