package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu;
		System.out.println("Che prodotto vuoi aggiungere in listino?\n1. Smartphone\n2. Televisore\n3. Cuffia");
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
				int prezzoS = input.nextInt();
				input.nextLine();
				System.out.println("Memoria smartphone: ");
				int memoriaS = input.nextInt();
				input.nextLine();
				Smartphone cellulare = new Smartphone(nomeS, descrS, prezzoS, memoriaS);
				System.out.println("Stai aggiungendo in listino lo smartphone " + 
				cellulare.getNome() + " con descrizione '" + cellulare.getDescrizione() + "'\nCosto: "
				+ cellulare.getPrezzoString() + " (" + cellulare.prezzoListino() + " da listino, di cui " + cellulare.getIvaPrezzoString() + 
				" di IVA)\nCodice IMEI: " + cellulare.getImei() + "\nSpazio di archiviazione: " + cellulare.getMemoria() + " GB");
				System.out.println("Che prodotto vuoi aggiungere in listino?\n1. Smartphone\n2. Televisore\n3. Cuffia");
				menu = input.nextInt();
			}
		}
		
	}
}
