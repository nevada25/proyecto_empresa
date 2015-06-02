<%@include file="cabeza.jsp" %>
<style>
form{
	width:400px;
	text-align:center;
	
}
.formu{
	background: url(file/img/fondo.jpg) #000000;
	width:600px;
	background-position:center;
	padding:32px;
	margin:12px;
	border-radius:1em;
	height:320px;
	
}
input.btn-default{
	padding:12px;
	margin:30px;
}
h1{
	text-align:center;
	color: #FFFFFF;
	font-weight:normal;
	font-size:30pt;
	margin:30px 0px;
	font-family: 'Spicy Rice', cursive;
}
</style>
<center>
<div align="center" class="formu">
<h1 align="center">FORMULARIO</h1>
<form action="">
<div  class= "input-group" > 
  <span  class= "input-group-addon"  id= "basic-addon1" > @ </span>
  <input  type= "text"  class= "form-control"  placeholder= "USUARIO"  aria-describedby= "basic-addon1"  >
  <input  type= "password"  class= "form-control"  placeholder= "CONTRASE&Nacute;A"  aria-describedby= "basic-addon1"  >
</div>

<input  class = "btn btn-default"  type = "submit"  value = "INICIAR SECCION" >
</form>
</div>
</center>
<%@include file="pie.jsp" %>