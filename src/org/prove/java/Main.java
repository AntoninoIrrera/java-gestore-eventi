package org.prove.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.lessons.java.Concerto;
import org.lessons.java.ProgrammEventi;

public class Main {
	public static void main(String[] args) {
		
		Concerto c = null;
		
		Concerto c1 = null;
		Concerto c2 = null;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		
		
		LocalTime ora = LocalTime.parse("11:10:10");
		LocalDate data = LocalDate.parse("11/06/2024",formatter);
		
		LocalDate data1 = LocalDate.parse("11/06/2024",formatter);
		LocalDate data2 = LocalDate.parse("11/08/2024",formatter);
		
		BigDecimal prezzo = BigDecimal.TEN;
		
		
		try {
			c2 = new Concerto("prova3", data2, 50, ora, prezzo);
			 c = new Concerto( "prova1", data, 50, ora, prezzo);
			 c1 = new Concerto("prova2", data1, 50, ora, prezzo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c.dataOraFormattata());
		System.out.println(c.prezzoFormattato());
		System.out.println(c);
		
		
		
		
		
		ProgrammEventi p = new ProgrammEventi("prova1");
		
		
		
		p.aggiungiEvento(c);
		p.aggiungiEvento(c1);
		p.aggiungiEvento(c2);
		
		System.out.println("-------------------------------");
		
		p.eventiCertaData(data2);
		
		System.out.println("-------------------------------");
		
		System.out.println(p.eventiProgamma());
		
		System.out.println("-------------------------");
		
		System.out.println(p.calendario());
		
		
		System.out.println("-------------------------------");
		
		p.svuotareListaEventi();
		System.out.println(p.eventiProgamma());
		
		
	}
}
