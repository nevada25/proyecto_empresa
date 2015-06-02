<%-- 
    Document   : encabesado
    Created on : 21/05/2015, 05:37:57 PM
    Author     : DIME QUIEN ERES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="file/css/estilos.css" >
        <link rel="stylesheet"  href="file/bootstrap-3.3.4-dist/css/bootstrap.css">
        <title>	SELVA AMAZONICA</title>
        <link rel="shortcut icon" type="image/x-icon"   href="file/img/1432285816_home.ico"/>
    </head>
    <body>
    <section id="general">
   
    <header>
    <div>
      <div class="cabecera">
      <img   class="logo_cabeza" src="file/img/icono pestaña.png"/>
		SELVA AMAZONICA
		</div>
      </div>
	</header>
    <!-- codigo de navegacion-->

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only" >MENU</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand"  href="inicio.jsp">MENU PRINCIPAL</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a  href="inicio.jsp">INICIO <span class="sr-only">(current)</span></a></li>
        <li><a   href="quienes_somos.jsp">QUIENES SOMOS</a></li>
        
        <%-- registros --%>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">REGISTRO <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a  href="registros_persona.jsp">PERSONAS</a></li>
            <li><a href="registro_vehiculo.jsp">VEHICULO</a></li>
            
          </ul>
          
           <%----- VISTAS----%> 
         
         <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">VISTAS<b class="caret"></b></a>
            <ul  class="dropdown-menu">
              <li><a href="">PERSONAL</a></li>
              <li><a href="">VEHICULOS</li>
            </ul> 

 <li><a    href="login.jsp">SALIR</a></li>   
         </li>
         
          
        
        </li>
        
      
           
        
        
        
      </ul>
    
    
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>



    	<!-- Latest compiled and minified JavaScript -->
	<script  src="file/js/jquery-1.11.3.min.js"></script>
	
	<script  src="file/bootstrap-3.3.4-dist/js/bootstrap.js"></script>     
       
    