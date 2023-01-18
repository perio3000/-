<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
        <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> LIST </title>
</head>
<body>
    <table>
        <tr>
            <th>No</th><th>TITLE</th><th>AUTHOR</th><th>DATE</th>
        </tr>
        <c:forEach var="article" items="${forum}">
        <tr>
            <td> ${article.id} </td>
            <td> ${article.title} </td>
            <td> ${article.author} </td>
            <td> ${article.written_date} </td>
        </tr>
        </c:forEach>


    </table>
</body>
</html>