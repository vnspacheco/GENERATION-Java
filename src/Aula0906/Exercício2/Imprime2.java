package Aula0906.Exercício2;

import Aula0906.Exercício1.Cachorro;
import Aula0906.Exercício1.Cavalo;
import Aula0906.Exercício1.Preguiça;

public class Imprime2 {
	
	public static void main(String [] args) {
		
		TestaAnimais t1 = new TestaAnimais();
		
		t1.somAnimal(new Cachorro("Zeus", 7));
		t1.somAnimal(new Cavalo("Black", 12));
		t1.somAnimal(new Preguiça("Lord", 3));
	}
}