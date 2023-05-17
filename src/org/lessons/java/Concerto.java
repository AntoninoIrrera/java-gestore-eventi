package org.lessons.java;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concerto extends Evento{
	
	
	private LocalTime ora;
	private BigDecimal prezzo;

	public Concerto(String titolo, LocalDate data, int numeroPostiTotale, LocalTime ora, BigDecimal prezzo) throws Exception {
		super(titolo, data, numeroPostiTotale);
		this.ora = ora;
		this.prezzo = prezzo;
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	
	public LocalDateTime dataOraFormattata() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy hh:mm:ss");
		
		String dataEOra = "" + getData() + this.ora;
		
		
		LocalDateTime localDateTime = LocalDateTime.parse(dataEOra, formatter);
		
		return localDateTime;
		
	}
	
	public String prezzoFormattato() {
		
		 NumberFormat italianFormat = NumberFormat.getCurrencyInstance(Locale.ITALIAN);
	     String formattedString = italianFormat.format(this.prezzo);
		
	     return formattedString;
	     
	}
	
	
	@Override
	public String toString() {
		return "data e ora: " + dataOraFormattata() + " titolo: " + getTitolo() + " prezzo formattato: " + prezzoFormattato();
	}
	
}
