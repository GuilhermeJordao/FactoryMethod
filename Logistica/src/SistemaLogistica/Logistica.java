package SistemaLogistica;

//Criando Classe Logistica
public class Logistica {
	//
	public static void main(String[] args) {
		//Chamando nova instancia de fabrica caminhão 
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao();
		//Chamando nova instancia de fabrica caminhão 
		FabricaTransporte fabricaNavio = new FabricaNavio();
		//Definindo o transporte Caminhão criando um novo transporte Caminhão e o tipo de entrega
		Transporte caminhao = fabricaCaminhao.criarTransporte();
		caminhao.entregar();
		//Definindo o transporte Navio criando um novo transporte Navio e o tipo de entrega
		Transporte navio = fabricaNavio.criarTransporte();
		navio.entregar();
	}

}
