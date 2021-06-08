package Aula0806;

public class POO2metodos {
	public static String contador(int inicio, int fim) {
		String numeroString = "";
		for(int c = inicio; c <= fim; c++) {
			numeroString += c + "";
		}
		return(numeroString);
	}
}