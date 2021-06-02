package Aula0206;

import java.util.Scanner;

public class Exercício7 {
	
	public static void main (String [] args) {
	
		int a, b, c, d, e, f, x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com valor de A: ");
		a = input.nextInt();
		System.out.println("Entre com valor de B: ");
		b = input.nextInt();
		System.out.println("Entre com valor de C: ");
		c = input.nextInt();
		System.out.println("Entre com valor de D: ");
		d = input.nextInt();
		System.out.println("Entre com valor de E: ");
		e = input.nextInt();
		System.out.println("Entre com valor de F: ");
		f = input.nextInt();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("Valor de X: " + x);
		System.out.println("Valor de Y: " + y);
		
		input.close();
	}
}
