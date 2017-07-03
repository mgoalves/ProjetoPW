package br.com.labpw.model;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;

public class AlunoEditar implements LogicaAluno {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String operacao = request.getParameter("operacao");

		if (operacao.equals("buscar")) {
			String matricula = request.getParameter("matricula");

			Connection connection = new ConnectionFactory().getConnection();
			AlunoDao dao = new AlunoDao(connection);
			Aluno aluno = dao.pesquisarPorMatricula(matricula);

			connection.close();

			request.setAttribute("aluno", aluno);
			return "aluno_editar.jsp";

		} else if (operacao.equals("alterar")) {

			// Recupera os parâmetros da requisição
			String NomeStr = request.getParameter("nome");
			String NomeMaeStr = request.getParameter("nomeMae");
			String DataNascimentoStr = request.getParameter("dataNascimento");
			String RgStr = request.getParameter("rg");
			String CpfStr = request.getParameter("cpf");
			String CidadeStr = request.getParameter("cidade");
			String BairroStr = request.getParameter("bairro");
			String LogradouroStr = request.getParameter("logradouro");
			String CepStr = request.getParameter("cep");
			String NumeroStr = request.getParameter("numero");
			Calendar dataNascimento;

			// Verifica se os parâmetros foram passados na requisição
			if (NomeStr == null || NomeMaeStr == null || DataNascimentoStr == null) {

				return "aluno_cadastrar.jsp";

			} else if (NomeStr.isEmpty() || NomeMaeStr.isEmpty() || DataNascimentoStr.isEmpty() || CpfStr.isEmpty()
					|| CidadeStr.isEmpty()) {

				return "aluno_cadastrar.jsp";

			} else {

				try {
					// Faz a conversão da data de nascimento
					Date data = new SimpleDateFormat("dd/MM/yyyy").parse(DataNascimentoStr);
					dataNascimento = Calendar.getInstance();
					dataNascimento.setTime(data);

					// Instancia um endereço e seta seus atributos
					Endereco endereco = new Endereco();
					endereco.setCidade(CidadeStr);
					endereco.setBairro(BairroStr);
					endereco.setLogradouro(LogradouroStr);
					endereco.setCep(CepStr);
					endereco.setNumero(NumeroStr);

					// Instancia um aluno e seta seus atributos
					Aluno aluno = new Aluno();
					aluno.setNome(NomeStr);
					aluno.setNomeMae(NomeMaeStr);
					aluno.setDataNascimento(dataNascimento);
					aluno.setRg(RgStr);
					aluno.setCpf(CpfStr);
					aluno.setEndereco(endereco);

					Connection connection = new ConnectionFactory().getConnection();
					AlunoDao dao = new AlunoDao(connection);
					dao.editar(aluno);
					connection.close();
					
					return "aluno_listar.jsp";

				} catch (ParseException e) {
					System.out.println("Erro de conversão de data!!");
				}
			}
			
		}
		return "alunos.jsp";
	}
}
