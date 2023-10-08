<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>AppFazenda</title>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container-fluid mt-3">
	  <h3>Listagem de Fertilizantes:</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Quantidade</th>
	        <th>Descricao</th>
	        <th>Tipo Fertilizante</th>
	        <th>Valor</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	    
	      <c:forEach var="s" items="${listaFertilizante}">
		      <tr>
		        <td>${s.id}</td>
		        <td>${s.nome}</td>
		        <td>${s.quantidade}</td>
		        <td>${s.descricao}</td>
		        <td>${s.tipoFertilizante}</td>
		        <td>${s.valor}</td>
		        <td><a href="/fertilizante/${s.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>