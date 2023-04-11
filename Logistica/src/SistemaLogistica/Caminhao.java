package SistemaLogistica;

//Criando Classe Caminh�o que implementa a Interface Transporte
public class Caminhao implements Transporte {
	//Sobrescreve o m�todo
	@Override
    //Implementando metodo vindo da interfacie transporte com polimorfismo
	public void entregar() {
		//Mudando o Escopo M�todo fazendo ele ter a mesma chamada mais realiza algo diferente
		System.out.println("Entregando por caminh�o...");
	}

}
