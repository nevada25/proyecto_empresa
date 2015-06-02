<%@include file="cabeza.jsp" %>
<style>

.container2{
	margin:5%;
	border-radius:1em;
}
</style>
<div class="container2">
<!--Comienzo del código para pase de imágenes (Carrusel)-->

<div id="miCarrusel" class="carousel slide">
  
  <!-- indicadores de elementos -->
  <ol class="carousel-indicators">
      <li data-target="#miCarrusel" data-slide-to="0"></li>
      <li data-target="#miCarrusel" data-slide-to="1" class="active"></li>
      <li data-target="#miCarrusel" data-slide-to="2"></li>
  </ol>
          
  <div class="carousel-inner"><!-- Carrusel elementos (items) -->
  
    <div class="item">
      <img src="http://lorempixel.com/1200/780/animals" alt="">
      <div class="carousel-caption">
        <h4>Primera etiqueta de miniatura de imagen (thumbnail)</h4>
        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
      </div>
    </div>
    
    <div class="item">
      <img src="http://lorempixel.com/1200/780/sports" alt="">
      <div class="carousel-caption">
        <h4>Segunda etiqueta de miniatura de imagen (thumbnail)</h4>
        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
      </div>
    </div>
    <div class="item">
      <img  src="file/img/123.jpg" alt="">
      <div class="carousel-caption">
        <h4>cuarta etiqueta de miniatura de imagen (thumbnail)</h4>
        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
      </div>
    </div>
    
    <div class="item active">
      <img src="http://lorempixel.com/1200/780/technics" alt="">
      <div class="carousel-caption">
        <h4>Tercera etiqueta de miniatura de imagen (thumbnail)</h4>
        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
      </div>
    </div>
    
  </div><!-- cierre carousel-inner-->

  <!-- Carrusel navegación -->
  <a class="left carousel-control" href="#miCarrusel" data-slide="prev">&lsaquo;</a>
  <a class="right carousel-control" href="#miCarrusel" data-slide="next">&rsaquo;</a>

</div><!-- cierre miCarrusel-->

<!--Final del código para pase de imágenes (Carrusel)-->
</div>

  
<%@include file="pie.jsp" %>