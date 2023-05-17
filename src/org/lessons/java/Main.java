package org.lessons.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Evento nuovoEvento = null;
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		System.out.println("creazione nuovo evento");
		
		System.out.println("inserire titolo evento");
		String userTitolo = sc.nextLine();
		System.out.println("inserire data evento");
		String userData = sc.nextLine();
		System.out.println("inserire numero posti totale evento");
		int userPosti = sc.nextInt();
		
		
		LocalDate dataUtente = LocalDate.parse(userData,formatter);
		
		try {
			nuovoEvento = new Evento(userTitolo, dataUtente, userPosti);
		} catch (Exception e) {
			System.out.println("errore nella creazione di un nuovo evento");
			System.out.println("hai sbagliato a inserire un dato ovvero: " + e.getMessage());
		}
		
		sc.nextLine();
		
		System.out.println("vuoi inserire delle prenotazioni?");
		String userRisposta1 = sc.nextLine();
		
		if(userRisposta1.equals("si")) {
		
			System.out.println("quante ne vuoi effettuare?");
			int userPrenotazione = sc.nextInt();
			
			for (int i = 0; i < userPrenotazione; i++) {
				
				try {
					nuovoEvento.prenota();
				} catch (Exception e) {
					
					System.out.println("errore nella prenotazione dei posti");
					System.out.println(e.getMessage());
					System.out.println("sono stati prenotati i posti sino ad esaurimento disponibili");
					
				}
				
			}
			
		}
		
		System.out.println("numero posti totali: " + nuovoEvento.getNumeroPostiTotale());
		System.out.println("numero posti prenotati: " + nuovoEvento.getNumeroPostiPrenotati());
		System.out.println("numero posti disponibili: " + nuovoEvento.getPostiDisponibili());
		
		sc.nextLine();
		
		System.out.println("vuoi disdire delle prenotazioni?");
		String userRisposta2 = sc.nextLine();
		
		if(userRisposta2.equals("si")) {
		
			System.out.println("quante ne vuoi disdire?");
			int userPrenotazione = sc.nextInt();
			
			for (int i = 0; i < userPrenotazione; i++) {
				
				try {
					nuovoEvento.disdici();
				} catch (Exception e) {
					
					System.out.println("errore nel disdire dei posti");
					System.out.println(e.getMessage());
					System.out.println("sono stati disdetti tutti i posti prenotati sino a 0");
					
				}
				
			}
			
		}
		
		System.out.println("numero posti totali: " + nuovoEvento.getNumeroPostiTotale());
		System.out.println("numero posti prenotati: " + nuovoEvento.getNumeroPostiPrenotati());
		System.out.println("numero posti disponibili: " + nuovoEvento.getPostiDisponibili());
		
		
		sc.close();
	}
}
