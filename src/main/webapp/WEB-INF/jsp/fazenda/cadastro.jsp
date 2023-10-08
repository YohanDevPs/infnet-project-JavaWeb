<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>AppPedido</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
	  <h2>Cadastramento de Fazendas</h2>
	  
	  <form action="/fazenda/incluir" method="post">
	  
	    <div class="mb-3 mt-3">
	      <label for="nome">Nome:</label>
	      <input type="text" class="form-control" value="Yohan P Silva" id="nome" placeholder="Entre com o seu nome" name="nome">
	    </div>

	    <div class="mb-3 mt-3">
	      <label for="cpf">CPF:</label>
	      <input type="text" class="form-control" value="1233454612" id="cpf" placeholder="Entre com o seu CPF" name="cpf">
	    </div>

	    <div class="mb-3 mt-3">
	      <label for="email">E-mail:</label>
	      <input type="email" class="form-control" value="yohan@gmail.com" id="email" placeholder="Entre com o seu e-mail" name="email">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>