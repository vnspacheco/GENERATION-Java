package Aula1106.Exercício1;

public class Produto {

	private String produto;
	private int quantidade;
	private double valor;

	public Produto(String produto, int quantidade, double valor) {
		
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "[ Produto: " + this.produto + " | Quantidade: " + this.quantidade + " | Valor: " + this.valor + " ]";
	}
}