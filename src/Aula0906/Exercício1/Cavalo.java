package Aula0906.Exercício1;

public class Cavalo extends Animal{
	
	//Construtor
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	//Método
	
	public void emitirSom () {
		System.out.println("Cavalo relinchando");
	}
	public void correr () {
		System.out.println("Cavalo correndo");
	}
}