package br.com.fiap.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.model.Candidato;

public class CandidatoDAO {
	private Connection conexao;

	public CandidatoDAO(Connection connection) {
		this.conexao = connection;
	}

	public void insert(Candidato candidato) throws SQLException {
			String sql = "insert into usuario (id,tempoExperiencia,formacao,email,telefone,idCandidato) values (?,?,?,?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setLong(1,candidato.getId());
			stmt.setFloat(2,candidato.getTempoExperiencia());
			stmt.setString(3,candidato.getFormacao());
			stmt.setLong(4,candidato.getTelefone());
			stmt.setString(5,candidato.getEmail());
		
			stmt.execute();
			stmt.close();
			
	}

	private long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Candidato> select() throws SQLException {
		List<Candidato> usuarios = new ArrayList<Candidato>();
		String sql = "select * from usuario";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Candidato candidato = new Candidato();
			candidato.setId(rs.getLong("id"));
			candidato.setNome(rs.getString("nome"));
			candidato.setEmail(rs.getString("email"));
			candidato.setTelefone(rs.getLong("telefone"));
			candidato.setData(rs.getDate("data"));
			candidato.add(candidato);
		}

		rs.close();
		stmt.close();
		return usuarios;
	}

	public Candidato selectById(Long id) throws SQLException {
		Candidato candidato = null;
		String sql = "select * from usuario where id=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setLong(1, id);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			candidato = new Candidato();
			candidato.setId(rs.getLong("id"));
			candidato.setNome(rs.getString("nome"));
			candidato.setEmail(rs.getString("email"));
			candidato.setTelefone(rs.getLong("telefone"));
			candidato.setData(rs.getDate("data"));
			rs.close();
			stmt.close();
			return candidato;

		}
		return candidato;
	}

	public void delete(Long id) throws SQLException {
		String sql = "delete from usuario where id=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setLong(1, id);
		stmt.execute();
		stmt.close();
	}

	public void update(Candidato usuario) throws SQLException {
		String sql = "update usuario set nome=?, email=?,teleone=?,where id=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getNome());
		stmt.setLong(3, usuario.getTelefone());
		stmt.setLong(4, usuario.getId());
		stmt.execute();
		stmt.close();
	}

	public List<Candidato> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public void alterar(float tempoExperiencia, String formacao, String telefone, String email, String endereco,
			int idCandidato) {
		// TODO Auto-generated method stub
		
	}

}
