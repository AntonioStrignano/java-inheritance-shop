package org.lessons.java.shop;

public class Televisore extends Prodotto {
	private int larghezza;
	private int altezza;
	private boolean isSmart;
		
//		COSTRUTTORE
	public Televisore (String nome, String descrizione, float prezzo, int larghezza, int altezza, boolean isSmart) {
		super(nome, descrizione, prezzo);
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.isSmart = isSmart;
	}
//			GETTER E SETTER
	public int getLarghezza() {
		return larghezza;
	}

	public int getAltezza() {
		return altezza;
	}

	public boolean isSmart() {
		return isSmart;
	}
	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
//			/GETTER E SETTER
	
	
}
