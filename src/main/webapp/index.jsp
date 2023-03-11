<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Calculo Peso Ideal</title>
</head>
<body>
<h1>Calculadora de Peso Ideal</h1>
<form action="hello-servlet" method="post">
    <table>
        <tr>
            <td><label for="weight">Digite seu peso:</label></td>
            <td><input type="text" name="weight" id="weight"/></td>
        </tr>
        <tr>
            <td><label for="height">Digite sua altura :</label></td>
            <td><input type="text" name="height" id="height"/></td>
        </tr>
        <tr>
            <td><label for="gender">Digite seu genero</label></td>
            <td><input type="text" name="gender" id="gender"/></td>
        </tr>
        <tr>
            <th><input type="submit" value="Enviar" name="find"/></th>
        </tr>
    </table>
    <h2>O seu peso ideal é: ${imc}</h2>
</form>
</body>
</html>