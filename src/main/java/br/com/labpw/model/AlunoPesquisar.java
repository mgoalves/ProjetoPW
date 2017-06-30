package br.com.labpw.model;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;

public class AlunoPesquisar implements LogicaAluno {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String nome = request.getParameter("nome");

		// Obtem uma conexao
		Connection connection = new ConnectionFactory().getConnection();

		// Instancia um AlunoDao e executa o método pesquisarPorNome()
		AlunoDao dao = new AlunoDao(connection);

		Aluno aluno = dao.pesquisarPorNome(nome);
		//response.getWriter().println("adfdf");

		request.setAttribute("aluno", aluno);
		return "alunos.jsp";
	}

}
