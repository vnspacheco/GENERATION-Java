package Aula1006.Exercício1;

public class ClasseMain {

	public static void main(String[] args) {
		
		//Instanciando objetos
		Cachorro thor = new Cachorro("Thor", 10, "Rottweiler");
		Preguiça flash = new Preguiça("Flash", 20, "Preguiça-real");
		
		System.out.println("=====Cachorro=====");
		System.out.println("Nome: " + thor.getNome());
		System.out.println("Idade: " + thor.getIdade());
		System.out.println("Raça: " + thor.getRaca());
		thor.locomover();
		System.out.println("===================");
		System.out.println();
		System.out.println("=====Preguiça=====");
		System.out.println("Nome: " + flash.getNome());
		System.out.println("Idade: " + flash.getIdade());
		System.out.println("Raça: " + flash.getRaca());
		flash.locomover();
		System.out.println("===================");
	}
}