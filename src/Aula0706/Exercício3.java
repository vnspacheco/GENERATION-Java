package Aula0706;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int soma = 0;

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite o valor de [%d] [%d]: ", (l + 1), (c + 1), "\n");
				matriz[l][c] = input.nextInt();
				if(matriz[l][c] > 10) {
					soma += 1;
				}
				else {}
			}
		}
		
		System.out.println("\nA quantidade de valores acima de 10 é: " + soma);

		input.close();
	}
}
