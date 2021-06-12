package Aula1106;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1ArrayList {

	public static void main(String[] args) {
		
		String aula1 = "Bloco I - JAVA";
		String aula2 = "Bloco II - back-end";
		String aula3 = "Bloco III - front-end";
		String aula4 = "Bloco Carnaval";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		//System.out.println(aulas);
		//aulas.remove(3);
		//System.out.println(aulas);
		
		// FOR EACH --> UM FOR MAIS ELABORADO, UTILIZADO VETORES E MATRIZES (ARRAYS)
		//for(String al : aulas) {
		//	System.out.println("Aula: " + al);
		//}
		
		//String primeiraAula = aulas.get(0);
		//System.out.println("A primeira aula é: " + primeiraAula);
		//System.out.println("A segunda aula é: " + aulas.get(1));
		
		//for(int i = 0; i < aulas.size(); i++) {
			//System.out.println("Aula " + (i + 1) + ": " + aulas.get(i));
		//}
		
		//System.out.println(aulas.size());
		
		//Ordem alfabetica
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}