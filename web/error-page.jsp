

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sarthakSharma.com</title>
        <style>
            *{
                padding: 0px;
                margin: 0px;
            }
        </style>
    </head>
    <body>
        <div style="background: #e2e2e2;padding: 20px; color: red;">
            <h1>Sorry Something Went Wrong..</h1>
            <p> <%= exception %>  </p>
            <p> <%= new Date().toString() %> </p>
        </div>
    </body>
</html>
