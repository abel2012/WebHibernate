<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAOImplJDBC"%>
<%@page import="com.fpmislata.WebHibernate.Datos.EntidadBancariaDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>

<%

    //EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
    int idEntidadBancaria = Integer.parseInt(request.getParameter("idEntidadBancaria"));
    entidadBancariaDAO.delete(idEntidadBancaria);
    
     ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(null);
    response.setContentType("application/json; charset=UTF-8");
    out.print(json);

    

%>