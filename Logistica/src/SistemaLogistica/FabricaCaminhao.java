package SistemaLogistica;
//Criando classe FabricaCaminh�o Implementando interface FabricaTransporte
public class FabricaCaminhao implements FabricaTransporte {
	//Sobrescreve o m�todo
	@Override
	//Criando Novo transporte Caminh�o
	public Transporte criarTransporte() {
		//Retornando o Veiculo Criado
		return new Caminhao();
	}

}
