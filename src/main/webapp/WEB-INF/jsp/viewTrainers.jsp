<%-- 
    Document   : viewTrainers
    Created on : 8 Ιουν 2019, 6:02:02 πμ
    Author     : thodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>👨🏻‍🏫 Trainers</title>
        <style>
            table {border-collapse: collapse; width: 30%; text-align: left; font-size: 16px;}
            table, td, th {border: 1px solid black;}
        </style>

    </head>
    <body>

        <table>
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Subject</th>
                <th>Action</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${trainers}" var="i">
                <tr>
                    <td><c:out value = "${i.id}"/></td>
                    <td><c:out value = "${i.firstname}"/></td>
                    <td><c:out value = "${i.lastname}"/></td>
                    <td><c:out value = "${i.subject}"/></td>
                    <td><a href="view/update">Update</a></td>
                    <td><a href="view/delete/${i.id}">Delete</a></td>

                    <!--<td><a href="view/delete">Delete</a></td>-->
                </tr>
            </c:forEach>
        </table>
        <br>
        <div><a href="view/insert">Insert Trainer</a></div>

    </body>
</html>
