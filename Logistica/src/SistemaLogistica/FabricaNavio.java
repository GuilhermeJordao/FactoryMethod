package SistemaLogistica;
//Criando classe FabricaNavio Implementando interface FabricaTransporte
public class FabricaNavio implements FabricaTransporte {
	//Sobrescreve o método
	@Override
	//Criando Novo transporte Navio
	public Transporte criarTransporte() {
		//Retornando o Veiculo Criado
		return new Navio();
	}
}
