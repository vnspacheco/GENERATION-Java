package Aula0206;

import java.util.Scanner;

public class Exercício4 {
	public static void main (String [] args) {
		
		double a, b, c;
		double d, r, s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com valor de A: ");
		a = input.nextInt();
		System.out.println("Entre com valor de B: ");
		b = input.nextInt();
		System.out.println("Entre com valor de C: ");
		c = input.nextInt();
		
		if (a > 0 && b > 0 && c > 0) {
			
			r = (a + b) * (a + b);
			s = (b + c) * (b + c);
			d = (r + s) / 2;
			
			System.out.printf("Resultado: %.4f",d);
		}
		
		else {
			
			System.out.println("Valor inválido");
			
		}
		
		input.close();
	}
}
