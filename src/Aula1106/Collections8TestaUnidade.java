package Aula1106;

public class Collections8TestaUnidade {

	public static void main(String[] args) {

		Collections7Calculadora calc = new Collections7Calculadora();

		int resultadoEsperado = 4;

		int resultado = calc.somar(2, 2);

		if (resultado == resultadoEsperado) {
			System.out.println("Teste OK!");
		} else {
			System.out.println("Teste Falhou!");
		}
	}
}