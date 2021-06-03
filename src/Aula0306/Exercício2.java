package Aula0306;

import java.util.Scanner;

public class Exercício2 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maior, medio, menor, n1, n2, n3;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro valor: ");
		n3 = input.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			maior = n1;
			if (n2 > n3) {
				medio = n2;
				menor = n3;
			}
			else {
				medio = n3;
				menor = n2;
			}		
		}
		else if (n2 > n1 && n2 > n3) {
			maior = n2;
			if (n1 > n3) {
				medio = n1;
				menor = n3;
			}
			else {
				medio = n3;
				menor = n1;
			}
		}
		else {
			maior = n3;
			if (n2 > n1) {
				medio = n2;
				menor = n1;
			}
			else {
				medio = n1;
				menor = n2;
			}
		}
		
		System.out.printf("Menor: %d\nMédio: %d\nMaior: %d\n", menor, medio, maior);
		
		input.close();
	}
}
