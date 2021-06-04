package Aula0406;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade = 0, menosDe21 = 0, maisDe50 = 0;
		
		while(idade != -99) {
			System.out.println("Digite uma idade: ");
			idade = input.nextInt();
			
			if (idade < 21) {
				menosDe21 =+ 1;
			}
			else if(idade > 50) {
				maisDe50 =+ 1;
			}
			else {}
		}
		System.out.println("Pessoas com menos de 21 anos: " + menosDe21 + "\nPessoas com mais de 50 anos: " + maisDe50);
		
		input.close();
	}
}
