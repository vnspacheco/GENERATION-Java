package Aula0406;

public class LaçoDeRepetição {
	public static void main (String[] args) throws InterruptedException {
		
		int numero = 10;
		
		while (numero>0) {
			System.out.println("\n Contando... " + numero);
			numero = numero-1;
			Thread.sleep(1000);
		}
		System.out.println("\nBoooOOOooMMmm");
	}
}
