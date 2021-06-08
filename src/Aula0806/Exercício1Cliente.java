package Aula0806;

public class Exercício1Cliente {
	public static void main(String[] args) {
		
		Exercício1Cliente cliente1 = new Exercício1Cliente();
		
		cliente1.nome = "Pacheco";
		cliente1.endereço = "Av. paulista, 1940";
		
		System.out.println("Cliente: " + cliente1.nome);
		System.out.println("Endereço: " + cliente1.endereço);
		cliente1.compra();
		
	}
	
	public String nome;
	public String endereço;
	
	public void compra(){
		System.out.println("Cliente comprou");
	}
}