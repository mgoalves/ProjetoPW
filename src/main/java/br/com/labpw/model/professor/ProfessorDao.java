package br.com.labpw.model.professor;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.labpw.model.Professor;
import br.com.labpw.model.Endereco;

public class ProfessorDao {

	private Connection connection;

	public ProfessorDao(Connection connection) {
		this.connection = connection;
	}

	public void inserir() {
	}

	public List<Professor> pesquisarPorNome(String nome) {
		return null;

	}

	// PESQUISAR POR MATRICULA
	public Professor pesquisarPorMatricula(String matricula) {
		return null;
	}

	public List<Professor> getLista() {
		return null;
	}

	public boolean editar()  {
		return false;
	
	}

}
