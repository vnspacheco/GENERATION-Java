package Aula1106;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections5TestaAluno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Collections4Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos alunos você deseja adicionar? ");
		int numeroAlunos = input.nextInt();
		
		input.nextLine();
		
		for(int i = 0; i < numeroAlunos; i++){
			
			System.out.println("Idade do aluno: ");
			int idade = input.nextInt();
			input.nextLine();
			
			System.out.println("Nome do aluno: ");
			String nome = input.nextLine();
			
			alunos.add(new Collections4Aluno(nome, idade));
		}
		
		for(Collections4Aluno al : alunos) {
			System.out.println(al);
		}
		
		input.close();
	}
}