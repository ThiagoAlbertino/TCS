package br.com.academia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioModel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	private int id;
	private String nome;
	private String nascimento;
	private float peso;
	private float altura;
	private String senha;
	private int privilegio;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getPrivilegio() {
		return privilegio;
	}
	public void setPrivilegio(int privilegio) {
		this.privilegio = privilegio;
	}
}