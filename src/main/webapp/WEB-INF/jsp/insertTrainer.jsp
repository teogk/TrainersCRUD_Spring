<%-- 
    Document   : insertTrainer
    Created on : 8 Ιουν 2019, 6:42:47 πμ
    Author     : thodo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>👨🏻‍🏫 Insert Trainer</title>
    </head>
    <body>
        <form:form method="POST" modelAttribute="trainer" action="doinsert">
            FirstName:
            <form:input path="firstname"/>
            LastName:
            <form:input path="lastname"/>
            Subject:
            <form:input path="subject"/>
            <input type="submit">
        </form:form>

        
    </body>
</html>
