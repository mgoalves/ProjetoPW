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
            <%@include file="includes/professor/professor_cabecalho.jsp"%>
			<!-- ############# FIM do Cabeçalho #############-->

			<!-- ############# Linha principal ############# -->
			<div class="row margem-top-15px">

				<!--############# MENU LATERAL #############-->
				<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
					<%@include file="menuLateral.jsp"%>
				</div>
				<!--############# MENU LATERAL #############-->

				<!--############# FAIXA DE OPÇÕES #############-->
                <%@ include file="includes/professor/professor_faixa_opcoes.jsp"%>
                <!--############# FAIXA DE OPÇÕES #############-->

				<!-- ############# Conteudo ############# -->
				<div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

					<!-- Div Conteudo -->
					<div class="conteudo">

						<h3>Professor</h3>
						<form class="form-horizontal">

							<div class="form-group">
								<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label">Matrícula</label>
								<div class="col-lg-4 col-md-7 col-sm-9 col-xs-12">
									<input type="text" class="form-control" id="cadastrarMatricula"
										placeholder="Matrícula">
								</div>
							</div>

							<div class="form-group">
								<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label">Nome</label>
								<div class="col-lg-4 col-md-7 col-sm-9 col-xs-12">
									<input type="text" class="form-control" id="cadastrarNome"
										placeholder="Nome">
								</div>
							</div>

							<div class="form-group">
								<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label">Nascimento</label>
								<div class="col-lg-3 col-md-3 col-sm-5 col-xs-12">
									<input class="form-control" type="date" value="aaaa-mm-dd"
										id="example-date-input">
								</div>
							</div>

						</form>

					</div>
					<!-- FIM Div Conteudo -->

				</div>
				<!-- conteudo -->
				<!-- ############# FIM do conteudo ############# -->

			</div>
			<!-- Linha principal -->
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