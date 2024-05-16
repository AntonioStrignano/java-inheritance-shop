package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu;
		Carrello cart = new Carrello();
		System.out.println("Che prodotto vuoi aggiungere in listino?"
				+ "\n1. Smartphone"
				+ "\n2. Televisore"
				+ "\n3. Cuffia"
				+ "\n4. Visualizza il carrello"
				+ "\n0. Esci");
		menu = input.nextInt();
		input.nextLine();
		while(menu!=0) {
			switch(menu) {
// SMARTPHONE
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
				Prodotto s = new Smartphone(nomeS, descrS, prezzoS, memoriaS);
				cart.aggiungiAlCarrello(s);
				System.out.println("Stai aggiungendo in carrello il seguente smartphone\n" + s.toString());
				System.out.println("===============\n"
						+ "Che prodotto vuoi aggiungere in listino?"
						+ "\n1. Smartphone"
						+ "\n2. Televisore"
						+ "\n3. Cuffia"
						+ "\n4. Visualizza il carrello"
						+ "\n0. Esci");
				menu = input.nextInt();
				input.nextLine();
				break;
// TELEVISORE				
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
				Prodotto tv = new Televisore(nomeT, descrT, prezzoT, larghezzaT, altezzaT, isTSmart);
				cart.aggiungiAlCarrello(tv);
				System.out.println("Stai aggiungendo in carrello il seguente televisore\n" + tv.toString());
				System.out.println("===============\n"
						+ "Che prodotto vuoi aggiungere in listino?"
						+ "\n1. Smartphone"
						+ "\n2. Televisore"
						+ "\n3. Cuffia"
						+ "\n4. Visualizza il carrello"
						+ "\n0. Esci");
				menu = input.nextInt();
				input.nextLine();
				break;
//	CUFFIA
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
				
				Prodotto c = new Cuffia(nomeC, descrC, prezzoC, coloreC, isCWireless, isCWired);
				cart.aggiungiAlCarrello(c);
				System.out.println("Stai aggiungendo in carrello le seguenti cuffie\n" + c.toString());
				System.out.println("===============\n"
						+ "Che prodotto vuoi aggiungere in listino?"
						+ "\n1. Smartphone"
						+ "\n2. Televisore"
						+ "\n3. Cuffia"
						+ "\n4. Visualizza il carrello"
						+ "\n0. Esci");
				menu = input.nextInt();
				input.nextLine();
					break;
//	CARRELLO
			case 4:
				cart.stampaCarrello();
				System.out.println("===============\n"
						+ "Che prodotto vuoi aggiungere in listino?"
						+ "\n1. Smartphone"
						+ "\n2. Televisore"
						+ "\n3. Cuffia"
						+ "\n4. Visualizza il carrello"
						+ "\n0. Esci");
				menu = input.nextInt();
				input.nextLine();
				break;
				
			default: System.out.println("Il valore non e' valido.");
			}
		}
		System.out.println("Arrivederci!");
	}
	
}
