package Aula0806;

public class POO6AtrMetTesteCarro {
	public static void main(String[] args) {
		
		POO5AtrMetCarro carro1 = new POO5AtrMetCarro();
		
		carro1.nome = "Elantra";
		carro1.marca = "Hyundai";
		carro1.ano = 2021;
		
		carro1.acelerar(100);
		System.out.println("Velocidade: " + carro1.velocidade);
		
		carro1.freiar(50);
		System.out.println("Velocidade: " + carro1.velocidade);
	}
}
