package Aula0806;

public class POO10Encapsulamento {
	public static void main(String[] args) {
		
		POO9Encapsulamento carro1 = new POO9Encapsulamento();
		
		carro1.setMarca("Hyundai");
		carro1.setModelo("HB20");
		carro1.setCapacidadeCombustivel(45.45);
		carro1.setNumPassageiros(5);
		
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Combustivel: " + carro1.getCapacidadeCombustivel());
		System.out.println("Passageiros: " + carro1.getNumPassageiros());
		
	}
}
