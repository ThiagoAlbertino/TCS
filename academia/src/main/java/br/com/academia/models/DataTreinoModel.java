package br.com.academia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataTreinoModel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String data;

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
