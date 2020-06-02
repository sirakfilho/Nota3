package model;

public class Beber extends Lanche {
	
	public Beber(LancheImplementada g) {
		super(g);
		
	}
	
	public void resultado() {
		System.out.println(valorRefrigerante("Refrigerante: "));
	}
	

}
