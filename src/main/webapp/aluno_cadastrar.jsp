<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>

	<%@include file="includes/head.jsp"%>

	<!--############# Para rolar para o formulario #############-->
	<script type="text/javascript">
		$(document).ready(function() { 
			window.location.href='#conteudo';
		});
	</script>

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

					<!-- Div Conteudo -->
					<div id="conteudo">
					
						<hr/>
						<div class="panel panel-default">
							<div class="panel-heading titulo-painel">
								<h2>Cadastro</h2>
							</div>
							<div class="panel-body">

								<form class="form-horizontal" id="cadastraAluno">

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarMatricula">Matrícula</label>
										<div class="col-lg-2 col-md-5 col-sm-9 col-xs-12">
											<input type="text" class="form-control" id="cadastrarMatricula"
											placeholder="Matrícula">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarNome">Nome</label>
										<div class="col-lg-4 col-md-7 col-sm-9 col-xs-12">
											<input type="text" class="form-control" id="cadastrarNome"
											placeholder="Nome">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarNascimento">Nascimento</label>
										<div class="col-lg-2 col-md-3 col-sm-5 col-xs-12">
											<input class="form-control" id="cadastrarNascimento" type="date" value="aaaa-mm-dd"
											id="example-date-input">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarMae">Mãe</label>
										<div class="col-lg-2 col-md-7 col-sm-9 col-xs-12">
											<input type="text" class="form-control" id="cadastrarMae"
											placeholder="Nome da mãe">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarRG">RG</label>
										<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12">
											<input type="text" class="form-control" id="cadastrarRG"
											placeholder="00.000.000-0">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarCPF">CPF</label>
										<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12">
											<input type="text" class="form-control" id="cadastrarCPF" 
											placeholder="000.000.000-00" name="cpf" maxlength="14">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarCidade">Cidade</label>
										<div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
											<input type="text" class="form-control" id="cadastrarCidade"
											placeholder="Cidade">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarCCEP">CEP</label>
										<div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
											<input type="text" class="form-control" id="cadastrarCCEP"
											placeholder="00.000-000" name="cep" maxlength="10">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarBairro">Bairro</label>
										<div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
											<input type="text" class="form-control" id="cadastrarBairro"
											placeholder="Bairro">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarLogradouro">Logradouro</label>
										<div class="col-lg-2 col-md-3 col-sm-6 col-xs-12">
											<input type="text" class="form-control" id="cadastrarLogradouro"
											placeholder="Logradouro">
										</div>
									</div>


									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label" for="cadastrarNumero">Número</label>
										<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12">
											<input type="number" class="form-control" id="cadastrarNumero"
											placeholder="Número">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label"></label>
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<button class="col-lg-3 col-md-4 col-sm-6 col-xs-12 btn btn-primary" type="submit">Salvar</button>
										</div>
									</div>

								</form>

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