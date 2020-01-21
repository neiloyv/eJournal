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
    <title>GroupData</title>

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
<h1>Детальная информация о группе</h1>

<c:if test="${!empty listGroups}">
    <table class="tg">
        <tr>
            <th width="40">п/п</th>
            <th width="100">Группа</th>

        </tr>
        <c:forEach items="${listGroups}" var="group">
            <tr>
                <td>${group.pp}</td>
                <td>${group.title}</td>

                <td><a href="<c:url value='/editGroup/${group.id}'/>">Ред.</a></td>
                <td><a href="<c:url value='/removeGroup/${group.id}'/>">Удалить</a></td>
                <td><a href="<c:url value='/archiveGroup/${group.id}'/>">Архив</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>








<table class="tg">
    <tr>
        <th width="40">п/п</th>
        <th width="100">Название</th>

    </tr>
    <tr>
        <td>${group.pp}</td>
        <td>${group.title}</td>

    </tr>
</table>
</body>
</html>
