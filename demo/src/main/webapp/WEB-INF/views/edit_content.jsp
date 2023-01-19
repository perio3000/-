<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        <form id="editForm" action="modify" method="post">
            <input id="input_id" type="hidden" name="id" value="${edit_content.id}">
            <tr>
                <td> 番号 : </td>
                <td> ${edit_content.id} </td>
            </tr>
            <tr>
                <td> 著者 : </td>
                <td> ${edit_content.author} </td>
            </tr>
            <tr>
                <td> 題名 : </td>
                <td>
                    <input id="input_title" type="text" name="title" value="${edit_content.title}">
                </td>
            </tr>
            <tr>
                <td> 作成日 : </td>
                <td> ${edit_content.written_date} </td>
            </tr>
            <tr>
                <td> 本文 : </td>
                <td>
                    <textarea id="input_content" rows="10" name="content">
                        ${edit_content.content}
                    </textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="修正">

                </td>
            </tr>
        </form>


    </table>
</body>
</html>