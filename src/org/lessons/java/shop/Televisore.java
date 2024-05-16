package org.lessons.java.shop;

import java.text.DecimalFormat;

public class Televisore extends Prodotto {
	private double larghezza;
	private double altezza;
	private boolean isSmart;
		
//		COSTRUTTORE
	public Televisore (String nome, String descrizione, float prezzo, double larghezza, double altezza, boolean isSmart) {
		super(nome, descrizione, prezzo);
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.isSmart = isSmart;
	}
	
// 			POLLICIETOR
	public String pollicietor() {
		return numberFormat.format(Math.sqrt((altezza * altezza) + (larghezza * larghezza)) / 2.54) + '"';
	}
	

DecimalFormat numberFormat = new DecimalFormat("#.0");
//			GETTER E SETTER
	public double getLarghezza() {
		return larghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public String getIsSmart() {
		return isSmart == true ? "È una SmartTV" : "Non è una SmartTV";
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
