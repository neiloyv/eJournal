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

<table class="tg">
    <tr>
        <th width="40">Номер</th>
        <th width="100">Фамилия</th>
        <th width="100">Имя</th>
        <th width="100">День рождения</th>
        <th width="100">Родитель</th>
        <th width="100">Телефон</th>
        <th width="100">Родитель</th>
        <th width="100">Телефон</th>
        <th width="100">Группа</th>
        <th width="100">Статус</th>
    </tr>
    <tr>
        <td>${client.id}</td>
        <td>${client.surname}</td>
        <td>${client.name}</td>
        <td>${client.birthday}</td>
        <td>${client.parent1}</td>
        <td>${client.phone1}</td>
        <td>${client.parent2}</td>
        <td>${client.phone2}</td>
        <td>${client.group}</td>
        <td>${client.status}</td>
    </tr>
</table>
</body>
</html>
