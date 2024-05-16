package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	private String imei;
	private int memoria;

//		COSTRUTTORE
	public Smartphone (String nome, String descrizione, float prezzo, int memoria) {
	super(nome, descrizione, prezzo);
	this.memoria = memoria;
	imei = randomImeiGen();
	}
	
// 		RANDOM IMEI GENERATOR
	private static String randomImeiGen()
	{
		int rdmImei = (int) ((((99999999 - 1) + 1) * Math.random()) + 1);
		String imei = String.valueOf(rdmImei);
		imei = imei + String.valueOf(rdmImei);
		while (imei.length() == 16) {
			imei = "0" + imei;
		}
		return imei;
	}
//		/RANDOM IMEI GENERATOR
	
//		GETTER E SETTER
	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
//		/GETTER E SETTER
	
	
}
