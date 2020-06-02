package model;

public class Gole extends Lanche{
	
	public Gole(LancheImplementada g) {
		super(g);
		
	}
	
	public void resultado() {
		System.out.println(valorQuantidade("Quantidade: "));
	}

}
