package Aula0906.Exercício1;

public class Animal {
	
	//Atributos
	private String nome;
	private int idade;
	
	//Construtores
	public Animal (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Método
	public void emitirSom () {
		
	}
	
	public void correr () {
		
	}
	
	public void subirEmArvores () {
		
	}
}