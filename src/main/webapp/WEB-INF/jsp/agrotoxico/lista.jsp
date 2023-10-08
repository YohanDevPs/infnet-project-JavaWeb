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
	  <h3>Listagem de Agrotoxicos:</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Quantidade</th>
	        <th>Descrição</th>
	        <th>Tipo de Agrotoxico</th>
	        <th>Valor</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	    
	      <c:forEach var="c" items="${listaAgrotoxico}">
		      <tr>
		        <td>${c.id}</td>
		        <td>${c.nome}</td>
		        <td>${c.quantidade}</td>
		        <td>${c.descricao}</td>
		        <td>${c.tipoAgrotoxico}</td>
		        <td>${c.valor}</td>
		        <td><a href="/agrotoxico/${c.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>