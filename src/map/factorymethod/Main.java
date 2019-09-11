package map.factorymethod;
public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculo = VeiculoFactory.createVeiculo(4);
		
		veiculo.identificacao();
		
	}
	
}
