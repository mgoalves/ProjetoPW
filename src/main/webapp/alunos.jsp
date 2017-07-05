<%@page import="java.util.List"%>
<%@page import="br.com.labpw.model.*"%>
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
					
					<!--############# FIM TÍTULO PÁGINA #############-->


					<!--############# FAIXA DE OPÇÕES #############-->
					<center><%@include file="includes/aluno/aluno_faixa_opcoes.jsp"%></center>
					<!--############# FAIXA DE OPÇÕES #############-->

					<!-- Div Conteudo -->
					<div class="conteudo">	
					
						<h4>Resultado: </h4>
						<div class="table-responsive" style="box-shadow: 0px 0px 5px rgba(0,0,0,.5);">
									
							<table class="table table-hover">
								<tr>
									<th>Matrícula</th>
									<th>Nome</th>
									<th>Nascimento</th>
									<th>CPF</th>
									<th>RG</th>
									<th>Cidade</th>
									<th colspan="2">Ações</th>

								<c:forEach var="aluno" items="${lista}" varStatus="contador">
									<tr bgcolor="#${contador.count %2 == 0? 'aaee88': 'ffffff' }">
										<td>${aluno.matricula}</td>
										<td>${aluno.nome}</td>
										<td><fmt:formatDate value="${aluno.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
										<td>${aluno.cpf}</td>
										<td>${aluno.rg}</td>
										<td>${aluno.endereco.cidade}</td>

										<td class="editar-link"><a href="servletaluno?logica=AlunoEditar&operacao=buscar&matricula=${aluno.matricula}"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
										<td class="excluir-link"><a href="servletaluno?logica=AlunoExcluir&matricula=${aluno.matricula}" ><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
									</tr>
								</c:forEach>
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