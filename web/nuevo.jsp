<%-- 
    Document   : nuevo
    Created on : 07-nov-2013, 19:35:09
    Author     : familiape
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="insert.jsp" method="post">
            idEntidadBancaria <input type="text" name="idEntidadBancaria" > <br>
            codigoEntidad: <input type="text" name="codigoEntidad" > <br>
            Nombre: <input type="text" name="Nombre" > <br>
            Cif: <input type="text" name="Cif" > <br>
            tipoEntidadBancaria: 
            <input type="radio" name="tipo"    value="banco"  />BANCO
            <input type="radio" name="tipo"   value="cajadeahorro" />CAJADEAHORRO
            <input type="radio" name="tipo"  value="cooperativadecredito"  />COOPERATIVASDECREDITO
            <input type="radio" name="tipo"  value="establecimientosfinancierosdecredito" />ESTABLECIMIENTOSFINANCIEROSDECREDITO <br>
            <input type="submit" value="Enviar Formulario">
        </form>


    </body>
</html>
