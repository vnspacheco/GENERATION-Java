package Aula1106.Exercício1;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {

		int menu;

		Scanner input = new Scanner(System.in);

		ArrayList<Produto> produtos = new ArrayList<>();

		System.out.println("\n		Bem-vindo ao ControlEstoque!");

		do {
			System.out.print("\n=========================================================\r\n"
					+ "|							|\r\n" + "|	Selecione uma opção:				|\r\n"
					+ "|							|\r\n" + "|	[1]- Adicionar produtos				|\r\n"
					+ "|	[2]- Remover produto				|\r\n" + "|	[3]- Atualizar dados				|\r\n"
					+ "|	[4]- Relatório de estoque			|\r\n" + "|	[9]- Sair do software				|\r\n"
					+ "|							|\r\n"
					+ "=========================================================\r\n" + "\r\n" + " > ");

			menu = input.nextInt();

			if (menu == 1) {
				System.out.println("\nInforme a quantidade de tipos de produtos? ");
				int numeroDeProdutos = input.nextInt();

				for (int c = 0; c < numeroDeProdutos; c++) {

					System.out.println("\nInforme as unidades: ");
					int quantidade = input.nextInt();
					input.nextLine();

					System.out.println("\nInforme o nome do produto: ");
					String produto = input.nextLine();

					System.out.println("\nInforme o valor: ");
					int valor = input.nextInt();

					produtos.add(new Produto(produto, quantidade, valor));

					System.out.println("\nProduto adicionado ao estoque!\n");
				}

			}

			else if (menu == 2) {
				System.out.println("\nQual o número da List que deseja remover? ");
				int valor = input.nextInt();

				produtos.remove((valor - 1));
				
				System.out.println("\nProduto removido!\n");
			}

			else if (menu == 3) {

				System.out.println("\nQual produto você deseja atualizar? ");
				int atualizar = input.nextInt();

				produtos.remove((atualizar - 1));

				System.out.println("\nInforme as unidades: ");
				int quantidade = input.nextInt();
				input.nextLine();

				System.out.println("\nInforme o nome do produto: ");
				String produto = input.nextLine();

				System.out.println("\nInforme o valor: ");
				int valor = input.nextInt();

				produtos.add(new Produto(produto, quantidade, valor));
				
				System.out.println("\nProduto atualizado!\n");

			}

			else if (menu == 4) {
				System.out.println("	    ===== Relatório =====");
				
				for (Produto pd : produtos) {
					System.out.println("\n" + pd);
				}
				
				System.out.println("\n=================================================");
			}

			else if (menu == 9) {

			} else {
				System.out.println("\nValor inválido!\n");
			}
		} while (menu != 9);

		input.close();
	}
}