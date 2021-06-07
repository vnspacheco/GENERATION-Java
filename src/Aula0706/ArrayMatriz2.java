package Aula0706;

public class ArrayMatriz2 {
	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 10.0; 
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 8.8; 
		notasAlunos[1][1] = 7.5;
		notasAlunos[1][2] = 5.5;
		notasAlunos[1][3] = 9.0;
		
		System.out.println("Calculando a média dos alunos");
		double soma;
		
		for(int l = 0; l < notasAlunos.length; l++) {
			
			soma = 0.0;
			for(int c = 0; c < notasAlunos[l].length; c++) {
				soma += notasAlunos[l][c];
				
			}
			System.out.println("A média do aluno " + (l + 1) + " é: " + (soma/4));
		}
	}
}
