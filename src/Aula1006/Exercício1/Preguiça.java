package Aula1006.Exercício1;

public class Preguiça extends SuperClasseAnimal implements InterfaceAnimal{

	//Construtor
	public Preguiça(String nome, int idade, String raca) {
		super(nome, idade, raca);
	}

	//Polimorfismo
	public void locomover() {
		System.out.println("Preguiça subindo árvore...");
	}
}