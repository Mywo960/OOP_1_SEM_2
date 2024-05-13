<%@ page import="com.example.oop_2_sem_1.FindPutServlet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Map Servlet</title>
</head>
<body>
<h1>Поиск и замена значения в коллекции</h1>
<form action="map" method="get">
    <label for="key_search">Ключ:</label>
    <input type="text" id="key_search" name="key_search"><br><br>
    <input type="submit" value="Найти">
</form>
<br>
<form action="map" method="get">
    <label for="key_put">Ключ:</label>
    <input type="text" id="key_put" name="key_put"><br><br>
    <label for="newValue">Новое значение:</label>
    <input type="text" id="newValue" name="newValue"><br><br>
    <input type="submit" value="Заменить">
</form>


 <% FindPutServlet mapServlet = new FindPutServlet();
    mapServlet.init();
 %>

</body>
</html>