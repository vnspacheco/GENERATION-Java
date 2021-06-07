package Aula0706;

public class ArrayVetor3 {
	public static void main(String[] args) {
		
		double[] temperaturas = new double[31];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 28;
		temperaturas[4] = 22.5;
		
		System.out.println("O valor da temperatura do dia 03: " + temperaturas[2]);
		System.out.println("O tamanho do Array é de: " + temperaturas.length);
		System.out.println("Valores do meu Array: ");
		for(int i = 0; i <= temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) + " é " + temperaturas[i]);
		}
	}
}
