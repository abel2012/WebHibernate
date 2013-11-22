
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="java.util.List"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplJDBC"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAO"%>
<%@page import="com.fpmislata.WebHibernate.Negocio.TipoEntidadBancaria"%>
<%@page import="com.fpmislata.WebHibernate.Negocio.EntidadBancaria"%>
<%
     //EntidadBancaria entidadBancaria7 = new EntidadBancaria(124, "87543276", "New Haven", "23671263", TipoEntidadBancaria.BANCO);  //Creamos el objeto
    //EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
    //EntidadBancaria entidadBancaria = entidadBancariaDAO.read(3);
    List<EntidadBancaria> entidades = entidadBancariaDAO.findAll();
    List<EntidadBancaria> entidades2 = entidadBancariaDAO.findByCodigo("29843287");
     List<EntidadBancaria> entidades3 = entidadBancariaDAO.findByName("Dante");
    //entidadBancariaDAO.insert(entidadBancaria7);
    //entidadBancariaDAO.delete(124);
    //String nombre = request.getParameter("nombre");
    /* out.println(entidadBancaria.getIdEntidadBancaria());
     out.println(entidadBancaria.getCodigoEntidad());
     out.println(entidadBancaria.getNombre());
     out.println(entidadBancaria.getCif());
     out.println(entidadBancaria.getTipoEntidadBancaria());
     */
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba de creaccion de entidades</title>
    </head>
    <body>
        <h1>Say Hello To My Little Friend</h1>
        <h2>Why So Serious?</h2>
        <table>
            <tr>
                <td> <%out.println("<a href='Viewforinsert.jsp'>nuevo</a>");%></td>
               
                 
            </tr>
            
            <tr>
                <td>
                    <%
                        for (EntidadBancaria Datos : entidades) {
                            out.println("<tr>");
                            out.println("<td>");
                            out.println(Datos.getIdEntidadBancaria());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getCodigoEntidad());
                             out.println("</td>");
                             out.println("<td>");
                            out.println(Datos.getNombre());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getCif());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getTipoEntidadBancaria());
                            out.println("</td>");
                            out.println("<td>");
                            out.println("<a href='borrar.jsp?idEntidadBancaria=" + Datos.getIdEntidadBancaria()  + "'>borrar</a>");
                            out.println("</td>");
                             out.println("<td>");
                            out.println("<a href='Viewforupdate.jsp?idEntidadBancaria=" + Datos.getIdEntidadBancaria()  + "'>Actualizar</a>");
                            out.println("</td>");
                            out.println("</tr>");
                            
                        }
                    %>
                </td>
                
            </tr>

            <tr>
                <td>
                    <%
                        for (EntidadBancaria Datos : entidades2) {
                            out.println("<tr>");
                            out.println("<td>");
                            out.println(Datos.getIdEntidadBancaria());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getCodigoEntidad());
                             out.println("</td>");
                             out.println("<td>");
                            out.println(Datos.getNombre());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getCif());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getTipoEntidadBancaria());
                            out.println("</td>");
                            out.println("</tr>");
                        }
                    %>
                </td>
            </tr>

             <tr>
                <td>
                    <%
                        for (EntidadBancaria Datos : entidades3) {
                            out.println("<tr>");
                            out.println("<td>");
                            out.println(Datos.getIdEntidadBancaria());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getCodigoEntidad());
                             out.println("</td>");
                             out.println("<td>");
                            out.println(Datos.getNombre());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getCif());
                            out.println("</td>");
                            out.println("<td>");
                            out.println(Datos.getTipoEntidadBancaria());
                            out.println("</td>");
                            out.println("</tr>");
                        }
                    %>
                </td>
            </tr>
            
        </table>
    </body>
</html>
