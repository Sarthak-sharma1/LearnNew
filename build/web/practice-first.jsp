<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page errorPage="error-page.jsp" %>

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
        
        <%@include file="practice-header.jsp" %>
        <%!
            int a = 20;
            int b = 0;
            String name = "hskad";

            public int sum() {
                return a / b;
            }

            public String reverse() {
                StringBuffer buffer = new StringBuffer(name);
                return buffer.reverse().toString();
            }

            public ArrayList<Integer> arrayList() {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(10);
                list.add(20);
                list.add(30);
             
                

                return list;
            }
           
        %>   

        <%
            int n = 10;
            ArrayList<Integer> array = new ArrayList<>();
            array.add(10);
            array.add(20);
            array.add(15);
            for(int c:array){
            out.println(c);
            }
             for(int i=1;i<=10;i++){
             out.println("<br>");
              out.println(n+"*"+i+"="+n*i);
              
              
            }
                    
            
        %>
        <h1>    Name is :  <%= reverse()%> </h1>
        <h1>    Array List is :  <%= arrayList()%> </h1>
        <h1>    Array List is :  <%= sum()%> </h1>
        

    </body>
</html>
