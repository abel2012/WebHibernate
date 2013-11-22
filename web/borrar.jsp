<%-- 
    Document   : borrar
    Created on : 07-nov-2013, 10:16:05
    Author     : alumno
--%>


<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplJDBC"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAO"%>

<% 
    //EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
    int idEntidadBancaria = Integer.parseInt(request.getParameter("idEntidadBancaria"));
    entidadBancariaDAO.delete(idEntidadBancaria);



%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Has borrado la entidad y estas despedido</h1>
    </body>
</html>
