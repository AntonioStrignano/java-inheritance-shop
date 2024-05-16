package org.lessons.java.shop;

public class Cuffia extends Prodotto {
	private String colore;
	private boolean isWireless;
	private boolean isWired;
/*Wireless e cablati due valori separati perché esistono anche le cuffie cablate che funzionano anche wireless.
 * In alternativa avrei potuto utilizzare un attributo di tipo String "Wireless" o "Cablato", o sempre con un buleano
 * "se true allora è wireless, se non è wireless è cablato (se false). dividendo in due attributi do modo di creare
 * più combinazioni e rendere più precisa la descrizione del prodotto.
 */
	
//		COSTRUTTORE
	public Cuffia (String nome, String descrizione, float prezzo, String colore, boolean isWireless, boolean isWired) {
	super(nome, descrizione, prezzo);
	this.colore = colore;
	this.isWireless = isWireless;
	this.isWired = isWired;
}

//		TO STRING
	@Override
	public String toString() {
		return super.toString() + "\nColore+ " + colore + "\n" + this.getIsWireless() + "\n" + this.getisWired();
	}
	
//		GETTER E SETTER
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getIsWireless() {
		return isWireless == true ? "È una cuffia wireless" : "Non è una cuffia wireless";
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

	public String getisWired() {
		return isWired == true ? "È una cuffia cablata" : "Non è una cuffia cablata";
	}

	public void setWired(boolean isWired) {
		this.isWired = isWired;
	}
//		/GETTER E SETTER
}
