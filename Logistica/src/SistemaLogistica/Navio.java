package SistemaLogistica;

//Criando a Classe Navio que implementa a interface transporte
public class Navio implements Transporte {
	//Sobrescreve o  Método
	@Override
    //Implementando metodo vindo da interfacie transporte com polimorfismo
	public void entregar() {
		//Mudando o Escopo Método fazendo ele ter a mesma chamada mais realiza algo diferente
		System.out.println("Entrando por navio...");
	}

}
