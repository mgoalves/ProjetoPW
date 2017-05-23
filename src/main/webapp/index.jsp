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

				<div id="espaco-esquerdo" class="col-lg-2 col-md-3 col-sm-4 col-xs-12">
				</div>

				<!-- ############# Conteudo ############# -->
				<div id="conteudo" class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

					<div class="jumbotron painel-index">

						<div id="myCarousel" class="carousel slide" data-ride="carousel">
							<!-- Indicators -->
							<ol class="carousel-indicators">
								<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								<li data-target="#myCarousel" data-slide-to="1"></li>
								<li data-target="#myCarousel" data-slide-to="2"></li>
							</ol>

							<!-- Wrapper for slides -->
							<div class="carousel-inner">

								<div class="item active">
									<img src="img/slide/1.jpg" alt="Gerencie alunos" style="width:100%;">
									<div class="carousel-caption hidden-xs">
										<h3>Alunos</h3>
										<p>Controle acadêmico para alunos</p>
									</div>
								</div>

								<div class="item">
									<img src="img/slide/2.jpg" alt="Chicago" style="width:100%;">
									<div class="carousel-caption hidden-xs">
										<h3>Professores</h3>
										<p>Controle acadêmico para Professores</p>
									</div>
								</div>

								<div class="item">
									<img src="img/slide/3.jpg" alt="New York" style="width:100%;">
									<div class="carousel-caption hidden-xs">
										<h3>Disciplinas</h3>
										<p>Controle acadêmico para Disciplinas</p>
									</div>
								</div>

							</div>

							<!-- Left and right controls -->
							<a class="left carousel-control" href="#myCarousel" data-slide="prev">
								<span class="glyphicon glyphicon-chevron-left"></span>
								<span class="sr-only">Previous</span>
							</a>
							<a class="right carousel-control" href="#myCarousel" data-slide="next">
								<span class="glyphicon glyphicon-chevron-right"></span>
								<span class="sr-only">Next</span>
							</a>
						</div>


						<h3><b>O que é um software gestão escolar?<b></h3>
						<p>O conceito de gestão escolar nos remete ao gerenciamento e administração de uma determinada instituição de maneira eficiente. O objetivo da gestão escolar, portanto, é organizar todas as áreas, aspectos e determinantes para que o processo fim (a educação) ocorra de maneira eficaz, garantindo seu objetivo principal, que é a aprendizagem efetiva por parte dos alunos.
						</p>
						<p>
							Atualmente, diante de tantas possibilidades digitais e do avanço tecnológico, os softwares de gestão escolar estão em pauta. A automatização garante uma integração de todos os fatores do processo educacional (tanto a atividade fim como as atividades à sua volta) garantindo, assim, uma gestão eficiente.
						</p>

					</div>

				</div><!-- conteudo -->
					<!-- ############# FIM do conteudo ############# --
					
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