package Aula0806;

public class POO5AtrMetCarro {
	
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void freiar(int reduzir) {
		velocidade -= reduzir;
	}
}
