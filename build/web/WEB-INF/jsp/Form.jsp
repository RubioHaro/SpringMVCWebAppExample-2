<%@taglib prefix="SPW" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validacion de formularios - Ejemplo</title>
    </head>
    <body>
        <h1>Ingresa tus datos</h1>
        <SPW:form method="post" commandName="Persona">
            <SPW:label path="Nombre">Nombre:</SPW:label>
            <SPW:input path="Nombre"/>

            <SPW:label path="Correo">Correo:</SPW:label>
            <SPW:input path="Correo"/>

            <SPW:label path="Pais">Pais:</SPW:label>
            <SPW:select path="Pais">
                <SPW:option value="0">Elija un pais</SPW:option>
                <SPW:options items="${ListaPais}"/>
            </SPW:select>
            <button type="submit">Registrar</button>
        </SPW:form>

    </body>
</html>
