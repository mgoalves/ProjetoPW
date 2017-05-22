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

				<!--############# Menu Lateral #############-->
				<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
					<%@include file="menuLateral.jsp"%>
				</div>
				<!--############# Menu Lateral #############-->


				<!-- ############# Conteudo ############# -->
				<div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

					<!--############# TÍTULO PÁGINA #############-->
					<%@include file="includes/aluno/aluno-titulo-pagina.jsp"%>
					<!--############# FIM TÍTULO PÁGINA #############-->
					
					<!--############# FAIXA DE OPÇÕES #############-->
					<%@include file="includes/aluno/aluno_faixa_opcoes_historico.jsp"%>
					<!--############# FAIXA DE OPÇÕES #############-->

					<!-- Div Conteudo -->
					<div class="conteudo">

						<br/><br/><br/>

						<div class="panel panel-default">
							<div class="panel-heading"> 
								<div class="panel-heading titulo-painel">
									<h2><center>Histórico de alunos</center></h2>
								</div>
							</div>
							<div class="panel-body">

								<div class="table-responsive">
									<table class="table table-hover">
										<span class="menssagem"><h6 class="hidden-lg hidden-md hidden-sm">Role a tabela lateralmente se necessário<h6></span>
										<tr>
											<th>Matrícula</th>
											<th>Nome</th>
											<th>Nascimento</th>
											<th>CPF</th>
											<th>RG</th>
											<th>Cidade</th>
											<th colspan="2">Ações</th>
										</tr>
										<tr>
											<td>001</td>
											<td>Caio Benício Lorenzo Castro</td>
											<td>15/11/1995</td>
											<td>888.844.241-35</td>
											<td>31.844.428-8</td>
											<td>Goiânia</td>
											<!-- opções para Editar ou excluir -->
											<td class="editar-link"><a href="professor_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
											<td class="excluir-link"><a href="professor_excluir.jsp"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
										</tr>
										<tr>
										<td>002</td>
											<td>Carlos Eduardo Alexandre Miguel Pinto</td>
											<td>26/02/1999</td>
											<td>201.789.201-77</td>
											<td>15.497.644-1</td>
											<td>Goiânia</td>
											<!-- opções para Editar ou excluir -->
											<td class="editar-link"><a href="professor_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
											<td class="excluir-link"><a href="professor_excluir.jsp"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
										</tr>
										<tr>
											<td>003</td>
											<td>Danilo Joaquim Almeida</td>
											<td>08/10/1992</td>
											<td>120.206.911-83</td>
											<td>27.205.774-5</td>
											<td>Goiânia</td>
											<!-- opções para Editar ou excluir -->
											<td class="editar-link"><a href="professor_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td>
											<td class="excluir-link"><a href="professor_excluir.jsp"><span class="glyphicon glyphicon-remove"></span> Excluir</a></td>
										</tr>
									</table>
								</div><!-- Tabela Responsiva -->

							</div><!-- Painel corpo Conteudo -->
						</div><!-- Painel -->

						
					</div>
					<!-- FIM Div Conteudo -->

				</div><!-- conteudo -->
				<!-- ############# FIM do conteudo ############# -->

			</div><!-- Linha principal -->
			<!-- ############# FIM da Linha principal ############# -->

			<!-- ############# INÍCIO DO RODAPÉ ############# -->
			<%@ include file="includes/rodape.jsp"%>
			<!-- ############# FIM DO RODAPÉ ############# -->

		</div>
		<!-- div container -->
	</div>
	<!-- div wrapper -->


</body>
</html>