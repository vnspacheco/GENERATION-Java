package Aula0406;

import java.util.Scanner;

public class LaçoDeRepetição2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			
			if(numero == 10) {
				System.out.println("Acertou!");
			}
			
			else {
				System.out.println("Errou!");
			}
		}
			
		input.close();
	}
}
