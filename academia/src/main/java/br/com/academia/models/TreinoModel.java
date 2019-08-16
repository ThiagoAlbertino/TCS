package br.com.academia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TreinoModel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private int series;
	
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
}
