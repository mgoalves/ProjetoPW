<%@ page contentType="text/html; charset=UTF-8"%>

<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 pesquisaBotoes">
	<!-- Pesquisar -->
	<div class="row pesquisar">
		<form action="servletaluno?logica=AlunoPesquisar" method="post">
			<div class="form-group">
				<div class="col-lg-9 col-md-8 col-sm-8 col-xs-8">
					<input type="text" class="form-control" id="pesquisar" name="nome" placeholder="Informe um nome a ser pesquisado">
				</div>
			</div>
			<button type="submit"
			class="col-lg-2 col-md-3 col-sm-4 hidden-xs btn btn-primary">Pesquisar <span class="glyphicon glyphicon-search"></span></button>
			<button type="submit" class="col-xs-2 hidden-lg hidden-md hidden-sm btn btn-primary botao-buscar-mobile">
				<span class="glyphicon glyphicon-search"></span> buscar
			</button>
		</form>
	</div>
	<!-- Pesquisar -->

	<!-- Botões de opções -->
	<div id="opcoes" class="row botoes">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<a class="col-lg-2 col-md-3 col-sm-5 col-xs-12 btn btn-default btn-lg btn btn-primary "
			href="aluno_cadastrar.jsp" role="button"><span class="glyphicon glyphicon-plus"></span> Cadastrar</a>
			<a class="col-lg-2 col-md-3 col-sm-7 col-xs-12 btn btn-default btn-lg btn btn-primary"
        	href="servletaluno?logica=AlunoPesquisar" role="button"><span class="glyphicon glyphicon-list"></span> Listar</a>
		</div>
	</div>
	<!-- Botões de opções -->

</div>