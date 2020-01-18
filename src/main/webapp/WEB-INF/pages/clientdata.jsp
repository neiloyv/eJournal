<%--
  Created by IntelliJ IDEA.
  User: Neilo
  Date: 10.01.2020
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>
<head>
    <title>BookData</title>

    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>

</head>
<body>
<h1>Детальная информация о клиенте</h1>

<c:if test="${!empty listClients}">
    <table class="tg">
        <tr>
            <th width="40">п/п</th>
            <th width="100">Фамилия</th>
            <th width="100">Имя</th>
            <th width="100">День рождения</th>
            <th width="100">Родитель</th>
            <th width="100">Телефон</th>
            <th width="100">Группа</th>
            <th width="100">Ред.</th>
            <th width="100">Удалить</th>
            <th width="100">Архив</th>
        </tr>
        <c:forEach items="${listClients}" var="client">
            <tr>
                <td>${client.pp}</td>
                <td>${client.surname}</td>
                <td>${client.name}</td>
                <td>${client.birthday}</td>
                <td>${client.parent}</td>
                <td>${client.phone}</td>
                <td>${client.group}</td>
                <td><a href="<c:url value='/edit/${client.id}'/>">Ред.</a></td>
                <td><a href="<c:url value='/remove/${client.id}'/>">Удалить</a></td>
                <td><a href="<c:url value='/archive/${client.id}'/>">Архив</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>








<table class="tg">
    <tr>
        <th width="40">п/п</th>
        <th width="100">Фамилия</th>
        <th width="100">Имя</th>
        <th width="100">День рождения</th>
        <th width="100">Родитель</th>
        <th width="100">Телефон</th>
        <th width="100">Группа</th>
    </tr>
    <tr>
        <td>${client.pp}</td>
        <td>${client.surname}</td>
        <td>${client.name}</td>
        <td>${client.birthday}</td>
        <td>${client.parent}</td>
        <td>${client.phone}</td>
        <td>${client.group}</td>
    </tr>
</table>
</body>
</html>
