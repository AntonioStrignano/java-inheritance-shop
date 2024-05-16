package org.lessons.java.shop;

public class Carrello {
	private Object[] acquisti;
	private int slots;
	private int nProdotti;
	
	public Carrello() {
// Finche' usiamo array statici e non dinamici la vedo dura
		slots = 100;
		acquisti = new Object[slots];
		nProdotti = 0;
	}
	
	public void aggiungiAlCarrello(Object p) {
		p = this.acquisti[nProdotti];
		nProdotti++;
	}
	
	public String toString(){
		String carrelloStringified = null;
		for (int i = 0; i < acquisti.length; i++) {
			carrelloStringified = carrelloStringified + "\nProdotto n." + (i + 1) + "\n" + acquisti[i].toString();
	}
		return carrelloStringified;
	}
	
}
