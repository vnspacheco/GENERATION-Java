package Aula0706;

public class Exercício1 {

	public static void main(String[] args) {
		
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("A soma do A[0], A[1] e A[5] é: " + soma + "\n");
		
		A[4] = 100;
		
		for(int c = 0; c < 6; c++) {
			System.out.println("[ " + A[c] + " ] ");
		}
	}
}
