package org.lessons.java.shop;

public class Carrello {
	private Prodotto[] acquisti;
	private int slots;
	private int nProdotti;
	
	public Carrello() {
		slots = 0;
		acquisti = new Prodotto[slots];
		nProdotti = 0;
	}
	
	public void aggiungiAlCarrello(Prodotto p) {
		slots++;
		p = this.acquisti[nProdotti];
		nProdotti++;
	}
	
	public void printCart(){
		for (int i = 0; i < acquisti.length; i++) {
			System.out.println("\nProdotto n." + i + "\n" + acquisti[i].toString());
		}
	}
	
}
