package org.lessons.java;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


public class ProgrammEventi {

	private String titolo;
	private List<Evento> eventi;
	
	public ProgrammEventi(String titolo) {
		
		this.titolo = titolo;
		
		this.eventi = new ArrayList<>();
	}
	
	
	public void aggiungiEvento(Evento eventoDaAggiungere) {
		
		this.eventi.add(eventoDaAggiungere);
		
	}
	
	public void eventiCertaData(LocalDate dataEventoDaCercare) {
		
		for (int i = 0; i < this.eventi.size(); i++) {
			
			if(this.eventi.get(i).getData().compareTo(dataEventoDaCercare) == 0) {
				
				System.out.println(this.eventi.get(i));
				
			}
			
		}
		
	}
	
	public int eventiProgamma() {
		
		int numeroEventi = 0;
		
		for (int i = 0; i < this.eventi.size(); i++) {
			numeroEventi++;
		}
		
		return numeroEventi;
	}
	
	public void svuotareListaEventi() {
		
		this.eventi.clear();
		
	}
	
	
	public String calendario() {
		
		String calendarioFormato = "";
		
		this.eventi.sort((o1,o2) -> o1.getData().compareTo(o2.getData()));
		
		for (int i = 0; i < this.eventi.size(); i++) {
			
			calendarioFormato = this.eventi.get(i).getData() + "-" + this.eventi.get(i).getTitolo() + "-" + this.titolo;
			
		}
		
		return calendarioFormato;
		
	}
	
}
