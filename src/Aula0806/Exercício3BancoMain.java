package Aula0806;

public class Exercício3BancoMain {
	public static void main(String[] args) {

		// Instânciando objeto
		Exercício3Banco conta1 = new Exercício3Banco();

		// Declarando atributos
		conta1.setNome("Pacheco");
		conta1.setDepositoInicial(100.00);

		// Aplicando método
		conta1.abrirConta();

		// Movimentando conta bancária
		System.out.println("Saldo da conta: " + conta1.getSaldoDaConta());

		conta1.saque(100.00);

		System.out.println("Saldo da conta: " + conta1.getSaldoDaConta());

		conta1.deposito(1000);

		System.out.println("Saldo da conta: " + conta1.getSaldoDaConta());
	}
}
