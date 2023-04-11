package SistemaLogistica;

//Criando Classe Caminhão que implementa a Interface Transporte
public class Caminhao implements Transporte {
	//Sobrescreve o método
	@Override
    //Implementando metodo vindo da interfacie transporte com polimorfismo
	public void entregar() {
		//Mudando o Escopo Método fazendo ele ter a mesma chamada mais realiza algo diferente
		System.out.println("Entregando por caminhão...");
	}

}
