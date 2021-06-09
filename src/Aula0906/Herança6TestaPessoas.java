package Aula0906;

public class Herança6TestaPessoas {
	
	public static void main(String [] args) {
	
	Herança3Professor prof1 = new Herança3Professor();
	Herança5Aluno aluno1 = new Herança5Aluno();
	
		prof1.setNome("Vinicius");
		prof1.setIdade(21);
		prof1.setSalario(3000);
		prof1.setDisciplina("Programação");
		
		aluno1.setNome("Gomes");
		aluno1.setIdade(21);
		aluno1.setCurso("Desenvolvedor Full Stack");
		aluno1.setSemestre("Terceira semana de curso");
		
		
		System.out.println("=====Dados professor=====");
		System.out.println("Nome do professor: " + prof1.getNome());
		System.out.println("Idade: " + prof1.getIdade());
		System.out.println("Salario: " + prof1.getSalario());
		System.out.println("Disciplina: " + prof1.getDisciplina());
		
		System.out.println();
		
		System.out.println("=====Dados do Aluno=====");
		System.out.println("Nome do aluno: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Curso: " + aluno1.getCurso());
		System.out.println("Semestre: " + aluno1.getSemestre());
		
	
	}
}
