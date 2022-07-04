package br.com.fiap.jdbc.controller;
import java.sql.*;
import java.util.List;

import br.com.fiap.jdbc.DAO.CandidatoDAO;
import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Candidato;

public class CandidatoController {
	private CandidatoDAO candidatodao;
	
	public CandidatoController() {
		Connection connection = new ConnectionFactory().conectarOracle();
		this.candidatodao = new CandidatoDAO(connection);
	}
		
	public void deletar(Integer idCandidato) {
		
		this.deletar(idCandidato);	
	}
	
	public void salvarcomCategoria(Candidato candidato) {
		this.salvarcomCategoria(candidato);
	}
	
	public List<Candidato> listar() {
		return this.candidatodao.listar();
	}
	
	public void alterar (float tempoExperiencia, String formacao, String telefone, String email, String endereco, int idCandidato) {
		this.candidatodao.alterar(tempoExperiencia, formacao, telefone, email, endereco, idCandidato);
	}
	
	

}