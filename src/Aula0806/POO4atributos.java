package Aula0806;

public class POO4atributos {

	public static void main(String[] args) {
		
		//Instanciar o objeto aluno (criar um objeto aluno)
		
		POO3atributos aluno1 = new POO3atributos();
		
		//declarando valores ao objeto aluno1
		
		aluno1.nome = "Pacheco";
		aluno1.curso = "Desenvolvimento de software";
		aluno1.idade = 21;
		
		//chamada de métodos
		
		aluno1.assistirAula();
		aluno1.fazerProva();
		aluno1.calcularProva();
		
		//imprimindo
		
		System.out.println(aluno1.nome);
		
		// > Toda classe tem atributos que são caracteristicas utilizadas pelo objeto.
		// > Métodos são ações que os objetos podem realizar.
	}
}
