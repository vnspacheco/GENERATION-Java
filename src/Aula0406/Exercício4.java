package Aula0406;

import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = 0, pessoas = 3, idade, sexo, opcao;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0;
		int pessoasNervosasMaisDe40 = 0, pessoasCalmasMenosDe18 = 0;

		while (x != pessoas) {
			x++;
			System.out.println("Qual a sua idade em anos? ");
			idade = input.nextInt();
			System.out.println("Qual o seu sexo?\n1 - Feminino\n2 - Masculino\n3 - Outros");
			sexo = input.nextInt();
			System.out.println("Você se considera:\n1 - Calmo(a)\n2 - Nervoso(a)\n3 - Agressivo(a) ");
			opcao = input.nextInt();

			if (opcao == 1) {
				pessoasCalmas += 1;
				if (sexo == 3) {
					outrosCalmos += 1;
				}
				if (idade < 18) {
					pessoasCalmasMenosDe18 += 1;
				}
			}
			if (opcao == 2) {
				if (sexo == 1) {
					mulheresNervosas += 1;
				}
				if (idade > 40) {
					pessoasNervosasMaisDe40 += 1;
				}
			}
			if (opcao == 3) {
				if (sexo == 2) {
					homensAgressivos += 1;

				}
			}
		}

		System.out.println("=======================================================");
		System.out.println("Número de pessoas calmas: " + pessoasCalmas);
		System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Número de homens agressivos: " + homensAgressivos);
		System.out.println("Número de outros calmos: " + outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + pessoasNervosasMaisDe40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + pessoasCalmasMenosDe18);
		System.out.println("=======================================================");

		input.close();
	}
}
