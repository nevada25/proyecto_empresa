

<%@page import="oracle.jdbc.util.Login"%>
<%@page import="pro.modelo.entidad.*" %>
<%@page import="logeo.n_logeo" %>


<%
    Usuario us=new Usuario();
     n_logeo nl=new n_logeo();
    
    String username=request.getParameter("login");
    String password=request.getParameter("password");
    
    us.setLogin(login);
    us.setPassword(password);

    nl.setUsuario(us);
    
    nl.mexiste();
    
    if(nl.val==1)
    {
        response.sendRedirect("inicio.jsp");//debe ir a tu pagina principal
    }
    
    if(nl.val==2)
    {
        response.sendRedirect("logeo.jsp?mensaje=1");    
    }
    if(nl.val==3)
    {
        response.sendRedirect("logeo.jsp?mensaje=2");
    }
    if(nl.val==4)
    {
         response.sendRedirect("logeo.jsp");
    }
            
    
    

%>
