package Aula0806;

public class Exercício3Banco {

	// Atributos

	private String nome;
	private double depositoInicial;
	private double saldoDaConta;
	private double deposito;
	private double saque;

	// Encapsulamento

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}

	public void setSaldoDaConta(double saldoDaConta) {
		this.saldoDaConta = saldoDaConta;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	// Métodos

	public void abrirConta() {
		saldoDaConta += depositoInicial;
		System.out.println("Conta aberta!");
	}

	public void deposito(double valor) {
		saldoDaConta += valor;
	}

	public void saque(double valor) {
		saldoDaConta -= valor;
	}
}
