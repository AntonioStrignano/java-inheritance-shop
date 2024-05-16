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

//		GETTER E SETTER
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

	public boolean isWired() {
		return isWired;
	}

	public void setWired(boolean isWired) {
		this.isWired = isWired;
	}
//		/GETTER E SETTER
}