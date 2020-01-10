<%--
  Created by IntelliJ IDEA.
  User: Neilo
  Date: 10.01.2020
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Clients</title>

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
    <a href="../../index.jsp">Назад в главное меню</a>

    <br/>
    <br/>

    <h1>Список клиентов</h1>

    <c:if test="${!empty listClients}">
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
                <th width="100">Ред.</th>
                <th width="100">Удалить</th>
            </tr>
            <c:forEach items="${listClients}" var="client">
                <tr>
                    <td>${client.id}</td>
                    <td><a href="/clientdata/${client.id}" target="_blank">${client.surname}</a></td>
                    <td>${client.name}</td>
                    <td>${client.birthday}</td>
                    <td>${client.parent1}</td>
                    <td>${client.phone1}</td>
                    <td>${client.parent2}</td>
                    <td>${client.phone2}</td>
                    <td>${client.group}</td>
                    <td>${client.status}</td>
                    <td><a href="<c:url value='/edit/${client.id}'/>">Ред.</a></td>
                    <td><a href="<c:url value='/remove/${client.id}'/>">Удалить</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>


    <h2>Добавить нового клиента</h2>

    <c:url var="addAction" value="/clients/add"/>

    <form:form action="${addAction}" commandName="client">
        <table>
            <c:if test="${!empty client.surname}">
                <tr>
                    <td>
                        <form:label path="id">
                            <spring:message text="Номер"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="id" readonly="true" size="8" disabled="true"/>
                        <form:hidden path="id"/>
                    </td>
                </tr>
            </c:if>
            <tr>
                <td>
                    <form:label path="clientTitle">
                        <spring:message text="Title"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="clientTitle"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="bookAuthor">
                        <spring:message text="Author"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="clientAuthor"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="price">
                        <spring:message text="Price"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="price"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <c:if test="${!empty client.bookTitle}">
                        <input type="submit"
                               value="<spring:message text="Edit client"/>"/>
                    </c:if>
                    <c:if test="${empty client.bookTitle}">
                        <input type="submit"
                               value="<spring:message text="Add client"/>"/>
                    </c:if>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
