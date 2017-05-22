<%@ page contentType="text/html; charset=UTF-8"%><!DOCTYPE html>
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
				<div id="menu-lateral" class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
					<%@include file="menuLateral.jsp"%>
				</div>
				<!-- Menu Lateral -->

				<div id="espaco-esquerdo" class="hidden-xs col-lg-2 col-md-3 col-sm-4 col-xs-12">
				</div>

				<!-- ############# Conteudo ############# -->
				<div id="conteudo" class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

					<div class="jumbotron painel-index">
						<h1>Bem Vindo!<br/> Gestor Acadêmico <span class="glyphicon glyphicon-education"></h1>
						
						<div class="table-responsive">
							<table class="table table-striped">

								<thead>
									<tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th scope="row">1</th>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
									</tr>
									<tr>
										<th scope="row">2</th>
										<td>Jacob</td>
										<td>Thornton</td>
										<td>@fat</td>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>Larry</td>
										<td>the Bird</td>
										<td>@twitter</td>
									</tr>
								</tbody>
							</table>
						</div><!-- Tabela Responsiva -->

					</div>

				</div>
				<!-- conteudo -->
				<!-- ############# FIM do conteudo ############# -->

				<!-- ############# INÍCIO DO RODAPÉ ############# -->
				<%@ include file="includes/rodape.jsp"%>
				<!-- ############# FIM DO RODAPÉ ############# -->

			</div><!-- Linha principal -->
			<!-- ############# FIM da Linha principal ############# -->


		</div>
		<!-- div container -->
	</div>
	<!-- div wrapper -->


</body>
</html>