package Aula1106;

public class Collections6Erro {
	public static void main(String[] args) {
	
		int [] vetor = new int[4];
		System.out.println("Antes da Exception");
		
		try {
			vetor[4] = 10;
			System.out.println("Pós Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro consertado!");
		}
	}
}
