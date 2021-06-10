package Aula1006.Exercício1;

public class Cachorro extends SuperClasseAnimal implements InterfaceAnimal {

	//Construtor
	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade, raca);
	}
	
	//Polimorfismo
	public void locomover() {
		System.out.println("Cachorro andando...");
	}
}