package org.lessons.java.shop;

public class Carrello {
	private Prodotto[] acquisti;
	private int slots;
	private int nProdotti;
	
	public Carrello() {
// Finche' usiamo array statici e non dinamici la vedo dura
		slots = 100;
		acquisti = new Prodotto[slots];
		nProdotti = 0;
	}
	
	public void aggiungiAlCarrello(Prodotto p) {
		this.acquisti[nProdotti] = p;
		nProdotti++;
	}
	
	public void stampaCarrello(){
		for (int i = 0; i < nProdotti; i++) {
	 		System.out.println("=============\nProdotto n." + (i + 1) + "\n" + acquisti[i].toString());
	}
	}
	
}
