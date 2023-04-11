package SistemaLogistica;
//Criando classe FabricaCaminhão Implementando interface FabricaTransporte
public class FabricaCaminhao implements FabricaTransporte {
	//Sobrescreve o método
	@Override
	//Criando Novo transporte Caminhão
	public Transporte criarTransporte() {
		//Retornando o Veiculo Criado
		return new Caminhao();
	}

}
