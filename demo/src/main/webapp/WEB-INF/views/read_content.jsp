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
    <table border="1">

            <tr>
                <td> 글번호 : </td>
                <td> ${read_content.id} </td>
            </tr>
            <tr>
                <td> 작성자 : </td>
                <td> ${read_content.author} </td>
            </tr>
            <tr>
                <td> 제목 : </td>
                <td> ${read_content.title} </td>
            </tr>
            <tr>
                <td> 작성일 : </td>
                <td> ${read_content.written_date} </td>
            </tr>
            <tr>
                <td> 본문 : </td>
                <td> ${read_content.content} </td>
            </tr>
        <a href="edit_content?id=${read_content.id}">edit</a>



    </table>
</body>
</html>