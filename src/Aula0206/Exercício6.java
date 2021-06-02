package Aula0206;

import java.util.Scanner;

public class Exercício6 {
	public static void main (String [] args) {
		
		int x1, x2, y1, y2, d, resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com valor de x1: ");
		x1 = input.nextInt();
		System.out.println("Entre com valor de y1: ");
		y1 = input.nextInt();
		System.out.println("Entre com valor de x2: ");
		x2 = input.nextInt();
		System.out.println("Entre com valor de y2: ");
		y2 = input.nextInt();
		
		d = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		resultado = (int) Math.sqrt(d);
		
		System.out.println("A distância entre eles é: " + resultado);
		
		input.close();
	}
}
