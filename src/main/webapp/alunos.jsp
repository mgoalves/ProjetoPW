<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%@include file="includes/head.jsp"%>
</head>

<body>

	<div class="wrapper" role="main">

		<div class="container-fluid">

			<!--############# Linha Cabeçalho #############-->
			<%@include file="includes/cabecalho.jsp"%>
			<!-- ############# FIM do Cabeçalho #############-->

			<!-- ############# Linha principal ############# -->
			<div class="row margem-top-15px">

				<!-- Menu Lateral -->
				<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
					<%@include file="menuLateral.jsp"%>
				</div>
				<!-- Menu Lateral -->

				<!-- ############# Conteudo ############# -->
				<div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

					<!--############# TÍTULO PÁGINA #############-->
					<%@include file="includes/aluno/aluno-titulo-pagina.jsp"%>
					<!--############# FIM TÍTULO PÁGINA #############-->


					<!--############# FAIXA DE OPÇÕES #############-->
					<%@include file="includes/aluno/aluno_faixa_opcoes.jsp"%>
					<!--############# FAIXA DE OPÇÕES #############-->

					<!-- Div Conteudo -->
					<div class="conteudo">
						<h3 style="text-align: center;">${aluno.nome}</h3>
					
						<div class="table-responsive" style="box-shadow: 0px 0px 5px rgba(0,0,0,.5);">
							<table class="table table-hover">
								<tr>
									<th>Matrícula</th>
									<th>Nome</th>
									<th>Mãe</th>
									<th>Nascimento</th>
									<th>CPF</th>
									<th>RG</th>
									<th>Cidade</th>
									<th colspan="2">Ações</th>
								</tr>
								
								<tr>
									<td>${aluno.matricula}</td>
									<td>${aluno.nome}</td>
									<td>${aluno.nomeMae}</td>
									<td><fmt:formatDate value="${aluno.dataNascimento.time}"/></td>
									<td>${aluno.cpf}</td>
									<td>${aluno.rg}</td>
									<td>${aluno.endereco.cidade}</td>
									<!-- opções para Editar ou excluir -->
									<td class="editar-link"><a href="aluno_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
									<td class="excluir-link"><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
								</tr>
								<tr>
								
							</table>
						</div><!-- Tabela Responsiva -->
						
					</div>
					<!-- FIM Div Conteudo -->


				</div>
				<!-- conteudo -->
				<!-- ############# FIM do conteudo ############# -->



			</div>
			<!-- Linha principal -->
			<!-- ############# FIM da Linha principal ############# -->

			<!-- Linha rodape -->

			<!-- ############# INÍCIO DO RODAPÉ ############# -->
			<%@ include file="includes/rodape.jsp"%>
			<!-- ############# FIM DO RODAPÉ ############# -->

		</div>
		<!-- div container -->
	</div>
	<!-- div wrapper -->


</body>
</html>