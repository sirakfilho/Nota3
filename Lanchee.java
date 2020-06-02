package model;

public abstract class Lanche implements LancheImplementada{
	
	private LancheImplementada Lanchee;
	
	public Lanche(LancheImplementada g) {
		
		Lanchee = g;
	}
	
	public String valorRefrigerante(String refrigerante) {
			
			return Lanche.valorRefrigerante(refrigerante);
	}
	
	public String valorTamanho(String tamanho) {
		
		return Lanche.valorTamanho(tamanho);
		
	}
	
	public String valorQuantidade(String quantidadeGole) {
		
		
		return Lanche.valorQuantidade(quantidadeGole);
	}
	
	public String valorPasta(String pasta) {
		
		return Lanche.valorPasta(pasta);
		
	}
	
	public String valorArquivo(String arquivo) {
		
		return Lanche.valorArquivo(arquivo);
	}
	
	
	
	public void resultado() {
		
	}

}
