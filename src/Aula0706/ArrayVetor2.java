package Aula0706;

public class ArrayVetor2 {
	public static void main(String[] args) {
		
		double minhaNota;
		double[] notas = new double[2];
		
		notas[0] = 9.6;
		minhaNota = notas[0];
		
		System.out.println("A variavel contém minhaNota: " + minhaNota);
		System.out.println("A variavel contém notas[0]: " + notas[0]);
		
		//Não imprime nada porque não foi declarado nada na posição 1 do ArrayVetor
		System.out.println("A variavel contém notas[1]: " + notas[1]);
	}
}
