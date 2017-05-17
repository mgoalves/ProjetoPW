<%@ page contentType="text/html; charset=UTF-8"%><!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Gestão de Alunos</title>

<!-- Favicon -->
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon">
<link rel="icon" href="favicon.ico" type="image/x-icon">

<!-- Bootstrap -->
<link href="css/bootstrap.css" rel="stylesheet">

<!-- Meu estilo -->
<link rel="stylesheet" href="css/estilo.css">

<!-- Fontes a serem utilizadas -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans|Roboto:400,500,900|Source+Sans+Pro:700"
	rel="stylesheet">

<!-- Javascript e jQuery -->
<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src='js/bootstrap.min.js' type="text/javascript"></script>

</head>

<body>

	<div class="wrapper" role="main">

		<div class="container-fluid">

			<!--############# Linha Cabeçalho #############-->
			<div class="row titulo">
				<h1>Gestão de Alunos</h1>
			</div>
			<!-- ############# FIM do Cabeçalho #############-->

			<!-- ############# Linha principal ############# -->
			<div class="row margem-top-15px">

				<!-- Menu Lateral -->
				<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">

					<%@include file="menuLateral.jsp"%>

				</div>
				<!-- Menu Lateral -->


				<!-- ############# Conteudo ############# -->
				<div id="conteudo" class="col-lg-10 col-md-9 col-sm-8 col-xs-12">
					<h1>Bem vindo!</h1>
				</div>
				<!-- conteudo -->
				<!-- ############# FIM do conteudo ############# -->

				<footer>
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 rodape">
						<p>Sistema de Gestão de alunos - 2017</p>
					</div>
					<!-- rodape -->
				</footer>

			</div>
			<!-- Linha principal -->
			<!-- ############# FIM da Linha principal ############# -->


		</div>
		<!-- div container -->
	</div>
	<!-- div wrapper -->


</body>
</html>