package Aula0706;

import java.util.Scanner;

public class ArrayMatriz3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] notasAlunos = new double [2][4];
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite as notas: [ %d ][ %d ]: ", l, c, "\n");
				notasAlunos[l][c] = input.nextDouble();
			}
			System.out.println();
		}
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print("[ " + notasAlunos[l][c] + " ] ");
			}
			System.out.println();
		}
		input.close();
	}
}
