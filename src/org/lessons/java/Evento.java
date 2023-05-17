package org.lessons.java;

import java.time.LocalDate;


public class Evento {

	private String titolo;
	private LocalDate data;
	private int numeroPostiTotale;
	private int numeroPostiPrenotati;
	
	
	public Evento(String titolo, LocalDate data, int numeroPostiTotale) throws Exception {
		
		this.titolo = titolo;
		
		if(data.compareTo(LocalDate.now()) > 0) {
			this.data = data;			
		}else {
			throw new Exception("inserire una data non passata");
		}
		
		
		
		
		if(numeroPostiTotale > 0) {
			this.numeroPostiTotale = numeroPostiTotale;			
		}else {
			throw new Exception("inserire un nuemero di posti totale positivo");
		}
		
		
		this.numeroPostiPrenotati = 0;
		
		
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public int getNumeroPostiTotale() {
		return numeroPostiTotale;
	}


	public int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}
	
	
	public void prenota() throws Exception {
		
	
		
		
		if(this.numeroPostiTotale > this.numeroPostiPrenotati && this.data.compareTo(LocalDate.now()) > 0) {
			this.numeroPostiPrenotati += 1;			
		}else {
			throw new Exception("numero di posti totale esaurito o evento gia passato");
		}
		
		
	}
	
	public void disdici() throws Exception {
		
		if(this.numeroPostiPrenotati > 0 && this.data.compareTo(LocalDate.now()) > 0) {
			this.numeroPostiPrenotati -= 1;			
		}else {
			throw new Exception("nessun posto prenotato o evento gia passato");
		}
		
	}
	
	
	public int getPostiDisponibili() {
		
		int numeroPostiDisponibili = this.numeroPostiTotale - this.numeroPostiPrenotati;
		
		return numeroPostiDisponibili;
		
	}
	
	
	@Override
	public String toString() {
		
		return "data: " + getData()  + " titolo: " + getTitolo();
	}
	
	
}
