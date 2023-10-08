<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Aquisicoes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Aquisicao</h2>
	  <form action="/aquisicao/incluir" method="post">
	    <div class="form-group">
	      <label>Descricao:</label>
	      <input type="text" class="form-control" placeholder="Entre com a descricao" name="descricao">
	    </div>
	    <div class="form-group">
	      <label>Data:</label>
	      <input type="datetime-local" class="form-control" name="dtSolicitante">
	    </div>

	    <div class="form-group">
	      <label>Fazenda:</label>
	      <select name="fazenda" class="form-control">
	      	<c:forEach var="s" items="${fazendas}">
	      		<option value="${s.id}">${s.nome}</option>
	      	</c:forEach>
	      </select>
	    </div>

	    <div class="form-group">
	      <label>Insumos:</label>
	      	<c:forEach var="p" items="${insumos}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="insumos" value="${p.id}">
				  <label class="form-check-label"> ${p.nome}</label>
				</div>	   
			</c:forEach>   
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>