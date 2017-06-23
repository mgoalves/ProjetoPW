<%@ page contentType="text/html; charset=UTF-8"%><!DOCTYPE html>
<html lang="pt-br">
<head>
<%@include file="includes/head.jsp"%>
</head>

<body>

	<div class="wrapper" role="main" style="width: 80%; margin: auto;">

		<div class="container-fluid">

			<!--############# Linha Cabeçalho #############-->
			<%@include file="includes/cabecalho.jsp"%>
			<!-- ############# FIM do Cabeçalho #############-->

			<div class="jumbotron painel-index"
				style="width: 50%; margin: auto; text-align: center;">
				<p>${menssagem}</p>
				<a href="index.html">Login</a>
			</div>


			<!-- ############# INÍCIO DO RODAPÉ ############# -->
			<%@ include file="includes/rodape.jsp"%>
			<!-- ############# FIM DO RODAPÉ ############# -->

		</div>
		<!-- div container -->
	</div>
	<!-- div wrapper -->


</body>
</html>