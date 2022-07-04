package br.com.fiap.jdbc.model;

import java.sql.Date;

public class Candidato {
	private long id, idArea;
	private String nome, geero, formacao, email, endereco;
	long telefone;
	private float tempoExperiencia;
	private Date dtNascimento;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdArea() {
		return idArea;
	}
	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGeero() {
		return geero;
	}
	public void setGeero(String geero) {
		this.geero = geero;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long l) {
		this.telefone = l;
	}
	public float getTempoExperiencia() {
		return tempoExperiencia;
	}
	public void setTempoExperiencia(float tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public void setData(Date date) {
		// TODO Auto-generated method stub
		
	}
	public void add(Candidato candidato) {
		// TODO Auto-generated method stub
		
	}
	public void setTelefone1(long long1) {
		// TODO Auto-generated method stub
		
	}
}
