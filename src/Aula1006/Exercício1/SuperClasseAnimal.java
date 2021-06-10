package Aula1006.Exercício1;

public abstract class SuperClasseAnimal{
	
	//Atributos
	private String nome;
	private int idade;
	private String raca;
	
	//Construtor
	public SuperClasseAnimal (String nome, int idade, String raca) {
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
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
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}