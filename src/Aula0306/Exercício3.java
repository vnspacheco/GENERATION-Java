package Aula0306;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade em anos? ");
		idade = input.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Você tem " + idade + " anos.\nCategoria: Infantil.");
		}
		else if (idade >=15 && idade <= 17) {
			System.out.println("Você tem " + idade + " anos.\nCategoria: Juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Você tem " + idade + " anos.\nCategoria: Adulto.");
		}
		else {
			System.out.println("Valor informado inválido.");
		}
		input.close();
	}
}
