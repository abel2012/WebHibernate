<%-- 
    Document   : update
    Created on : 08-nov-2013, 9:37:57
    Author     : alumno
--%>


<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplJDBC"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAO"%>
<%@page import="com.fpmislata.WebHibernate.Negocio.EntidadBancaria"%>

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
 int idEntidadBancaria = Integer.parseInt(request.getParameter("idEntidadBancaria"));
EntidadBancaria entidadBancaria = entidadBancariaDAO.read(idEntidadBancaria);
//int idEntidadBancaria = Integer.parseInt(request.getParameter("idEntidadBancaria"));
 String codigoEntidad = request.getParameter("codigoEntidad");  
 String Nombre = request.getParameter("Nombre"); 
 String Cif = request.getParameter("Cif"); 
 
 //entidadBancaria.setIdEntidadBancaria(idEntidadBancaria);
 entidadBancaria.setCodigoEntidad(codigoEntidad);
 entidadBancaria.setNombre(Nombre);
 entidadBancaria.setCif(Cif);
entidadBancariaDAO.update(entidadBancaria);



%>
           
            <input type="submit" value="volver">
        </form>
    </body>
</html>
