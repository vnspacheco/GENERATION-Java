package Aula1106;

import java.util.ArrayList;

public class Collections3TestaAulas {

	public static void main(String[] args) {
		
		Collections2Aula al1 = new Collections2Aula("Revisando ArrayList", 50);
		Collections2Aula al2 = new Collections2Aula("Lista de obejtos", 60);
		Collections2Aula al3 = new Collections2Aula("Relacionamento de Arrays",120);
		
		ArrayList<Collections2Aula> aulas = new ArrayList<>();
		aulas.add(al1);
		aulas.add(al2);
		aulas.add(al3);
		
		System.out.println(aulas);
	}
}
