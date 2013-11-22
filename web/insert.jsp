<%-- 
    Document   : insert
    Created on : 07-nov-2013, 19:35:27
    Author     : familiape
--%>


<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplJDBC"%>
<%@page import="com.fpmislata.WebHibernate.Negocio.EntidadBancaria"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <form action="index.jsp">
             <%

//EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
     EntidadBancaria entidadBancaria = new EntidadBancaria();
int idEntidadBancaria = Integer.parseInt(request.getParameter("idEntidadBancaria"));
 String codigoEntidad = request.getParameter("codigoEntidad");  
 String Nombre = request.getParameter("Nombre"); 
 String Cif = request.getParameter("Cif"); 
 
 entidadBancaria.setIdEntidadBancaria(idEntidadBancaria);
 entidadBancaria.setCodigoEntidad(codigoEntidad);
 entidadBancaria.setNombre(Nombre);
 entidadBancaria.setCif(Cif);
entidadBancariaDAO.insert(entidadBancaria);



%>
           
            <input type="submit" value="volver">
        </form>
    </body>
</html>
