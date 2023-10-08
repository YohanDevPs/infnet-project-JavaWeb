<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">AppFazenda</a>
    </div>
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
      <li><a href="/usuario/lista">Usuarios</a></li>
      <c:if test="${not empty user}">
	      <li><a href="/fazenda/lista">Fazendas</a></li>
	      <li><a href="/insumo/lista">Insumos</a></li>
	      <li><a href="/semente/lista">Sementes</a></li>
	      <li><a href="/agrotoxico/lista">Agrotoxico</a></li>
	      <li><a href="/fertilizante/lista">Fertilizantes</a></li>
	      <li><a href="/aquisicao/lista">Aquisicoes</a></li>
      </c:if>
    </ul>
    
    <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty user}">
        <li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	  </c:if>
	  
      <c:if test="${not empty user}">
      	 <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.email}</a></li>
	  </c:if>
    </ul>
  </div>
</nav>
