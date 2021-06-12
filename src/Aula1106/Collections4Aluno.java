package Aula1106;

public class Collections4Aluno {

	int idade;
	String nome;

	public Collections4Aluno(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "[Idade: " + this.idade + ", Nome: " + this.nome + "]";
	}
}
