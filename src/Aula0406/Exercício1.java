package Aula0406;

public class Exercício1 {
	public static void main(String[] args) {
		
		double numero;
	
		for(numero = 1000; numero <= 1999 ; numero++) {
			if(numero % 11 == 5) {
				System.out.println(numero);
			}
		}
	}
}
