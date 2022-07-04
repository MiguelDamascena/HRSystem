package br.com.fiap.jdbc.controller;
import java.sql.Connection;

import br.com.fiap.jdbc.DAO.AreaAtuacaoDAO;
import br.com.fiap.jdbc.factory.ConnectionFactory;
public class AreaAtuacaoController {
	
	private AreaAtuacaoController areDAO;
	public AreaAtuacaoController () {
		Connection connection = new ConnectionFactory().conectarOracle();
		AreaAtuacaoDAO areaDAO = new AreaAtuacaoDAO(connection);
	}
	

}
