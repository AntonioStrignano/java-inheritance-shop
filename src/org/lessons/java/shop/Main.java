package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu;
		System.out.println("Che prodotto vuoi aggiungere in listino?\n1. Smartphone\n2. Televisore\n3. Cuffia\n0. Esci");
		menu = input.nextInt();
		input.nextLine();
		while(menu!=0) {
			switch(menu) {
			case 1:
				System.out.println("Nome smartphone: ");
				String nomeS = input.nextLine();
				System.out.println("Descrizione smartphone: ");
				String descrS = input.nextLine();
				System.out.println("Prezzo smartphone: ");
				float prezzoS = input.nextFloat();
				input.nextLine();
				System.out.println("Memoria smartphone: ");
				int memoriaS = input.nextInt();
				input.nextLine();
				Smartphone cellulare = new Smartphone(nomeS, descrS, prezzoS, memoriaS);
				System.out.println("Stai aggiungendo in catalogo lo smartphone " + 
				cellulare.getNome() + " con descrizione '" + cellulare.getDescrizione() + "'\nCosto: "
				+ cellulare.getPrezzoString() + " (" + cellulare.prezzoListino() + " da listino, di cui " + cellulare.getIvaPrezzoString() + 
				" di IVA)\nCodice esteso: " + cellulare.codiceEsteso() + "\nCodice IMEI: " + cellulare.getImei() + "\nSpazio di archiviazione: " + cellulare.getMemoria() + " GB");
				System.out.println("\nChe prodotto vuoi aggiungere in listino?\n1. Smartphone\n2. Televisore\n3. Cuffia\n0. Esci");
				menu = input.nextInt();
				input.nextLine();
				break;
				
			case 2:
				System.out.println("Nome televisore: ");
				String nomeT = input.nextLine();
				System.out.println("Descrizione televisore: ");
				String descrT = input.nextLine();
				System.out.println("prezzo televisore: ");
				float prezzoT = input.nextFloat();
				input.nextLine();
				System.out.println("Larghezza TV (cm): ");
				double larghezzaT = input.nextDouble();
				input.nextLine();
				System.out.println("Altezza TV (cm): ");
				double altezzaT = input.nextDouble();
				input.nextLine();
				System.out.println("È una smartTV? ");
				boolean isTSmart = false;
				boolean isValid = false;
				while(!isValid) {
					String in = input.nextLine();
				if (in.equals("si")) {
					isTSmart = true;
					isValid = true;
				} else 
					if (in.equals("no")) {
					isTSmart = false;
					isValid = true;
					} else {
					System.out.println("Valore non valido.\nÈ una smartTV? ");
				}}
				Televisore tv = new Televisore(nomeT, descrT, prezzoT, larghezzaT, altezzaT, isTSmart);
				System.out.println("Stai aggiungendo in catalogo il televisore " + tv.getNome() + "con descrizione '" + tv.getDescrizione() + "'\nCosto: "
						+ tv.getPrezzoString() + " (" + tv.prezzoListino() + " da listino, di cui " + tv.getIvaPrezzoString() +
						" di IVA)\nCodice esteso: " + tv.codiceEsteso() + "\nDimensioni: " + tv.pollicietor() + "(larghezza: " + tv.getLarghezza() + "cm , altezza " + tv.getAltezza()
						+ "cm)\n" + tv.getIsSmart());
				System.out.println("\nChe prodotto vuoi aggiungere in listino?\n1. Smartphone\n2. Televisore\n3. Cuffia\n0. Esci");
				menu = input.nextInt();
				input.nextLine();
				break;
			case 3:
				System.out.println("Nome cuffia: ");
				String nomeC = input.nextLine();
				System.out.println("Descrizione cuffia:");
				String descrC =  input.nextLine();
				System.out.println("Prezzo cuffia: ");
				float prezzoC =  input.nextFloat();
				input.nextLine();
				System.out.println("Colore cuffia: ");
				String coloreC =  input.nextLine();
				System.out.println("È una cuffia wireless? ");
				boolean isCWireless= false;
				isValid = false;
				while(!isValid) {
					String in = input.nextLine();
				if (in.equals("si")) {
					isCWireless = true;
					isValid = true;
				} else 
					if (in.equals("no")) {
					isCWireless = false;
					isValid = true;
					} else {
					System.out.println("Valore non valido.\nÈ wireless? ");
				}}

				System.out.println("È una cuffia cablata? ");
				boolean isCWired= false;
				isValid = false;
				while(!isValid) {
					String in = input.nextLine();
				if (in.equals("si")) {
					isCWired = true;
					isValid = true;
				} else 
					if (in.equals("no")) {
					isCWired = false;
					isValid = true;
					} else {
					System.out.println("Valore non valido.\nÈ cablata? ");
				}}
				
				Cuffia cuffioni = new Cuffia(nomeC, descrC, prezzoC, coloreC, isCWireless, isCWired);
				String isCablataStringed = cuffioni.isWired() ? "È una cuffia cablata" : "Non è una cuffia cablata";
//				 ho distinto i due getter per mettere in pratica entrambi i metodi di processazione delle informazioni: in isWireless ritorna la string dalla classe,
//				 in isWired faccio elaborare la stringa nel main, lasciando il getter di tipo boolean come per il tipo di attributo originale, in modo da non variare il
//				 tipo di ritorno. in questo contesto specifico, considerando che uso quegli attributi buleani per stampare una stringa ho trovato sensato che il ritorno del
//				 getter sia una stringa, perché non ha altri utilizzi, lasciando il main più snello, considerando che vengono trattate informazioni prettamente legate all'oggetto
//				 perciò da elaborare direttamente nell'oggetto. l'elaborazione in main potrerbbe servire nel momento in cui quel valore buleano ha altri utilizzi in altri metodi
				System.out.println("Stai aggiungendo in catalogo le cuffie " + cuffioni.getNome() + " con descrizione '" + cuffioni.getDescrizione() +
						 "'\nCosto: " + cuffioni.getPrezzoString() + " (" + cuffioni.prezzoListino() + " da listino, di cui " + cuffioni.getIvaPrezzoString() +
							" di IVA)\nCodice esteso: " + cuffioni.codiceEsteso() + "\nColore: " + cuffioni.getColore() + "\n" + cuffioni.getIsWireless() +"\n" +
							isCablataStringed);System.out.println("\nChe prodotto vuoi aggiungere in listino?\n1. Smartphone\n2. Televisore\n3. Cuffia");
							menu = input.nextInt();
							input.nextLine();
							
					System.out.println("Che prodotto vuoi aggiungere in listino?\n1. Smartphone\n2. Televisore\n3. Cuffia\n0. Esci");
					menu = input.nextInt();
					input.nextLine();
					break;
				
			}
		}
		System.out.println("Arrivederci!");
	}
}
