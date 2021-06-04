package Aula0406;

public class LaçoDeRepetição3 {
	public static void main (String [] args) {
		
		int soma = 0;
		
		for(int i=0; soma<=10; i++) {
			System.out.println("Soma = " + soma + " + " + i);
			soma += i;
			System.out.println(" = " + soma + "\n");
		}
	}
}
