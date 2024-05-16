package org.lessons.java.shop;

import java.text.NumberFormat;

public class Prodotto {

		private final String codice;
		private String nome;
		private String descrizione;
		private float prezzo;
		private static final double IVA = 1.22;
		
		public Prodotto (String nome, String descrizione, float prezzo) {
			this.nome = nome;
			this.descrizione = descrizione;
			this.prezzo = prezzo;
			codice = randomCodeGen();
		}
		
		
		//		RANDOM CODE GEN
		private static String randomCodeGen()
		{
			int rdmCode = (int) ((((99999999 - 1) + 1) * Math.random()) + 1);
			String code = String.valueOf(rdmCode);
			while (code.length() == 8) {
				code = "0" + code;
			}
			return code;
		}
		
		//		PREZZATRICE
		public String prezzoListino() {
			double prezzoListino = prezzo/IVA;
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(prezzoListino);
		}
		public String getIvaPrezzoString() {
			double ivaPrezzo = prezzo - prezzo / IVA;
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(ivaPrezzo);
		}
		public String getPrezzoString() {
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(prezzo);
		}
		
		//  CODICE ESTESO
		public String codiceEsteso () {
			return codice + nome.replace(" ","");
		}
		
		//		GETTER E SETTER
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		public float getPrezzoFloat() {
			return prezzo;
		}
		public void setPrezzo(float prezzo) {
			this.prezzo = prezzo;
		}
		public double getIva() {
			return IVA;
		}
		public String getCodice() {
			return codice;
		}
		//		/GETTER E SETTER
		
		
	}



