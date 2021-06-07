package Aula0706;

import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		int[][] m3 = new int[2][2];
		int opcao, constante;

		for (int l = 0; l < m1.length; l++) {
			for (int c = 0; c < m1.length; c++) {
				System.out.printf("Digite o valor de M1 [%d][%d]: ", (l + 1), (c + 1));
				m1[l][c] = input.nextInt();
			}
		}
		System.out.println("");
		for (int l = 0; l < m2.length; l++) {
			for (int c = 0; c < m2.length; c++) {
				System.out.printf("Digite o valor de M2 [%d][%d]: ", (l + 1), (c + 1));
				m2[l][c] = input.nextInt();
			}
		}
		System.out.println("");
		System.out.println("[1] - SOMAR AS DUAS MATRIZES");
		System.out.println("[2] - SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA");
		System.out.println("[3] - ADICIONAR UMA CONSTANTE AS DUAS MATRIZES");
		System.out.println("[4] - IMPRIMIR AS MATRIZES");

		opcao = input.nextInt();

		switch (opcao) {
		case 1:
			m3[0][0] = m1[0][0] + m2[0][0];
			m3[0][1] = m1[0][1] + m2[0][1];
			m3[1][0] = m1[1][0] + m2[1][0];
			m3[1][1] = m1[1][1] + m2[1][1];

			System.out.println("\nSoma da matriz M1 e M2: \n");

			for (int l = 0; l < m3.length; l++) {
				for (int c = 0; c < m3.length; c++) {
					System.out.print("[ " + m3[l][c] + " ] ");
				}
				System.out.println();
			}
			break;
		case 2:
			m3[0][0] = m2[0][0] - m1[0][0];
			m3[0][1] = m2[0][1] - m1[0][1];
			m3[1][0] = m2[1][0] - m1[1][0];
			m3[1][1] = m2[1][1] - m1[1][1];

			System.out.println("\nMatriz M2 subtraida pela M1: \n");

			for (int l = 0; l < m3.length; l++) {
				for (int c = 0; c < m3.length; c++) {
					System.out.print("[ " + m3[l][c] + " ] ");
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("\nDigite uma constante: ");
			constante = input.nextInt();
			System.out.println("\nM1 e M2 com adição da constante: \n");
			for (int l = 0; l < m1.length; l++) {
				for (int c = 0; c < m1.length; c++) {
					m1[l][c] += constante;
					m2[l][c] += constante;
				}
			}
			for (int l = 0; l < m1.length; l++) {
				for (int c = 0; c < m1.length; c++) {
					System.out.print("[ " + m1[l][c] + " ] ");
				}
				System.out.println();
			}
			System.out.println();
			for (int l = 0; l < m2.length; l++) {
				for (int c = 0; c < m2.length; c++) {
					System.out.print("[ " + m2[l][c] + " ] ");
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.println("\nImpressão das matrizes M1 e M2: \n");
			System.out.println("M1: \n");
			for (int l = 0; l < m1.length; l++) {
				for (int c = 0; c < m1.length; c++) {
					System.out.print("[ " + m1[l][c] + " ] ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("\nM2: \n");
			for (int l = 0; l < m2.length; l++) {
				for (int c = 0; c < m2.length; c++) {
					System.out.print("[ " + m2[l][c] + " ] ");
				}
				System.out.println();
			}
		}

		input.close();
	}
}