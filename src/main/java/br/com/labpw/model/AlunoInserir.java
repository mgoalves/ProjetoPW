package br.com.labpw.model;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;

public class AlunoInserir implements LogicaAluno {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

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
			//request.getRequestDispatcher("aluno_cadastrar.jsp").forward(request, response);
			return "aluno_cadastrar.jsp";
		} else if (NomeStr.isEmpty() || NomeMaeStr.isEmpty() || DataNascimentoStr.isEmpty()
				|| RgStr.isEmpty() || CpfStr.isEmpty() || CidadeStr.isEmpty() || BairroStr.isEmpty()
				|| LogradouroStr.isEmpty() || CepStr.isEmpty() || NumeroStr.isEmpty()) {
			//request.getRequestDispatcher("aluno_cadastrar.jsp").forward(request, response);
			return "aluno_cadastrar.jsp";
		} else {

			// Solicita uma conexão para a ConnectionFactory
			Connection connection = new ConnectionFactory().getConnection();

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
				endereco.setNumero(Integer.parseInt(NumeroStr));

				// Instancia um aluno e seta seus atributos
				Aluno aluno = new Aluno();
				aluno.setNome(NomeStr);
				aluno.setNomeMae(NomeMaeStr);
				aluno.setDataNascimento(dataNascimento);
				aluno.setRg(RgStr);
				aluno.setCpf(CpfStr);
				aluno.setEndereco(endereco);

				// Instancia um AlunoDao e executa o método de inserir
				AlunoDao dao = new AlunoDao(connection);
				dao.inserir(aluno);
				//request.getRequestDispatcher("aluno_listar.jsp").forward(request, response);

			} catch (ParseException e) {
				System.out.println("Erro de conversão de data!!");
				// return;
			}

		}
		return "aluno_listar.jsp";
	}

}
