package Aula0306;

import java.util.Scanner;

public class LaçoCondicional3 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma letra de A a D: ");
		String letra = input.nextLine();
		
		switch(letra) {
		case "a" , "A":
			System.out.println("Ana");
			break;
		case "b", "B":
			System.out.println("Bruna");
			break;
		case "c", "C":
			System.out.println("Camila");
			break;
		case "d", "D":
			System.out.println("Daniela");
			break;
			default:
				System.out.println("Letra inválida...");
		}
		
		input.close();
	}
}
