package model;

public class ResultadoImplent implements LancheImplementada{
	
	public ResultadoImplent() {}

	@Override
	public String valorRefrigerante(String refrigerante) {
		return (refrigerante+ "Coca-Cola");
	}

	@Override
	public String valorTamanho(String tamanho) {
		return (tamanho+ "Tamanho Fam�lia");
	}

	@Override
	public String valorQuantidade(String quantidadeGole) {
		return (quantidadeGole+ "3 Gole");
	}

	@Override
	public String valorPasta(String pasta) {
		return (pasta+ "�rea de Trabalho");
	}

	@Override
	public String valorArquivo(String arquivo) {
		return (arquivo+ "PDF");
	}

}
