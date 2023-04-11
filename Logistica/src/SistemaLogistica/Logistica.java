package SistemaLogistica;

//Criando Classe Logistica
public class Logistica {
	//
	public static void main(String[] args) {
		//Chamando nova instancia de fabrica caminh�o 
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao();
		//Chamando nova instancia de fabrica caminh�o 
		FabricaTransporte fabricaNavio = new FabricaNavio();
		//Definindo o transporte Caminh�o criando um novo transporte Caminh�o e o tipo de entrega
		Transporte caminhao = fabricaCaminhao.criarTransporte();
		caminhao.entregar();
		//Definindo o transporte Navio criando um novo transporte Navio e o tipo de entrega
		Transporte navio = fabricaNavio.criarTransporte();
		navio.entregar();
	}

}
