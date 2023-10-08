<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cadastramento de aquisicoes</title>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container-fluid mt-3">
	  <h3>Aquisicoes: ${listagem.size()}</h3>

	  <h4><a href="/aquisicao">Nova aquisicao</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Descricao</th>
	        <th>Data</th>
	        <th>Fazenda</th>
	        <th>Insumos</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	    
	      <c:forEach var="p" items="${listaAquisicao}">
		      <tr>
		        <td>${p.id}</td>
		        <td>${p.descricao}</td>
		        <td>${p.data}</td>
		        <td>${p.fazenda.nome}</td>
		        <td>${p.insumos.size()}</td>
		        <td><a href="/aquisicao/${p.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>