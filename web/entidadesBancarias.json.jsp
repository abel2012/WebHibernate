<%@page import="com.fpmislata.WebHibernate.Negocio.EntidadBancaria"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>

<%

    //EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
    String nombre = request.getParameter("nombre");
    List<EntidadBancaria> entidadesBancarias = entidadBancariaDAO.findByName(nombre);

    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(entidadesBancarias);
    response.setContentType("application/json; charset=UTF-8");
    out.print(json);

%>