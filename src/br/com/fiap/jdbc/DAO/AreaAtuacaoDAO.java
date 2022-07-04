package br.com.fiap.jdbc.DAO;

	import java.sql.Connection;
	import java.util.ArrayList;
	import java.util.List;
	import br.com.fiap.jdbc.model.Candidato;

	public class AreaAtuacaoDAO {
		
		
		
		private long id;
		private String nome;
		public AreaAtuacaoDAO(long id, String nome, List<Candidato> candidatos, Candidato candidato) {
		
			this.id = id;
			this.nome = nome;
			this.candidatos = candidatos;
			this.candidato = candidato;
		}
		public AreaAtuacaoDAO(Connection connection) {


		}
		private List<Candidato> candidatos = new ArrayList<Candidato>();
		
		
		private Candidato candidato;
		public Candidato getCandidato() {
			return candidato;
		}
		public void setCandidato(Candidato candidato) {
			this.candidato = candidato;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public List<Candidato> getCandidatos() {
			return candidatos;
		}
		public void setCandidatos(List<Candidato> candidatos) {
			this.candidatos = candidatos;
		}

		

	}

