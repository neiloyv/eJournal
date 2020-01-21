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
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Groups</title>

    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            background: #ffffff;
        }

        .wrapper {
            width: 1200px;
            height: 100%;
            margin: 0 auto;
            background: cornsilk;
            padding: 20px;
        }

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
    <div class="wrapper">
        <a href="<c:url value="/index.jsp"/>">Назад в главное меню</a>

        <br/>

        <h2>Добавить новую группу</h2>

        <c:url var="addAction" value="/groups/addGroup"/>

        <form:form action="${addAction}" commandName="group">
            <table>
                <c:if test="${!empty group.title}">
                    <tr>
                            <%--<td>--%>
                            <%--<form:label path="id">--%>
                            <%--<spring:message text="Номер"/>--%>
                            <%--</form:label>--%>
                            <%--</td>--%>
                        <td>
                                <%--<form:input path="id" readonly="true" size="8" disabled="true"/>--%>
                            <form:hidden path="id"/>
                        </td>
                    </tr>
                </c:if>
                <tr>
                    <td>
                        <form:label path="title">
                            <spring:message text="Название"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="title"/>
                    </td>
                </tr>

                <tr>
                    <td colspan="2">
                        <c:if test="${!empty group.title}">
                            <input type="submit"
                                   value="<spring:message text="Редактировать"/>"/>
                        </c:if>
                        <c:if test="${empty group.title}">
                            <input type="submit"
                                   value="<spring:message text="Добавить группу"/>"/>
                        </c:if>
                    </td>
                </tr>
            </table>
        </form:form>

        <h1>Список групп</h1>

        <c:if test="${!empty listGroups}">
            <table class="tg">
                <tr>
                    <th width="30">п/п</th>
                    <th width="100">Группа</th>

                    <th width="40">Ред.</th>
                    <th width="40">Удалить</th>
                    <th width="40">Архив</th>
                </tr>
                <c:forEach items="${listGroups}" var="group">
                    <tr>
                            <%--<td>${group.id}</td>--%>
                        <td>${group.pp}</td>
                        <td><a href="/dataGroup/${group.id}">${group.title}</a></td>

                        <td><a href="<c:url value='/editGroup/${group.id}'/>"><button>Ред.</button></a></td>
                        <td><a href="<c:url value='/removeGroup/${group.id}'/>"><button>Удалить</button></a></td>
                        <td><a href="<c:url value='/archiveGroup/${group.id}'/>"><button>Архив</button></a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <br>
    </div>
</body>
</html>
