package Aula0206;

import java.util.Scanner;

public class Exercício1 {
	public static void main (String [] args) {
		
		int idadeAnos, idadeMeses, idadeDias;
		int anosEmDias, mesesEmDias, resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual a sua idade em Anos? ");
		idadeAnos = input.nextInt();
		
		System.out.print("Qual a sua idade em Meses? ");
		idadeMeses = input.nextInt();
		
		System.out.print("Qual a sua idade em Dias? ");
		idadeDias = input.nextInt();
		
		anosEmDias = idadeAnos * 365;
		mesesEmDias = idadeMeses * 30;
		
		resultado = anosEmDias + mesesEmDias + idadeDias;
		
		System.out.print("Sua idade em dias é: " + resultado);
		
		input.close();
	}
}
