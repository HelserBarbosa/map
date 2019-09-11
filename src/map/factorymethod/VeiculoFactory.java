package map.factorymethod;

public class VeiculoFactory {

	public static Veiculo createVeiculo(int qtdRodas) {

		Veiculo veiculo = null;

		if (qtdRodas == 2) {
			veiculo = new Moto();
		} else if (qtdRodas == 4) {
			veiculo = new Carro();
		} else if (qtdRodas == 6) {
			veiculo = new Forgao();
		} else {
			throw new RuntimeException();
		}

		return veiculo;
	}

}
