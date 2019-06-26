<%-- 
    Document   : date
    Created on : 25 Ιουν 2019, 10:49:34 πμ
    Author     : samsung np350
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        3 + 3 =<%=3+2%><br />
        3 == 3 =<%=3==3%><br />
        3 + 3 = <% out.print(3+3);%><br />
        <%=new Date()%>
        <% 
            if (Math.random() < 0.5) {%>
                heads<%
            }else{%>
                tails<%
            }
        %>
        <%-- this is a comment --%>
        <%
            Date d = new Date();
            System.out.println("Current date = "+d); // tha emfanistei sto output tou tomcat
        %>
        <jsp:useBean id="student" class="dao.Student" />
        <br />
        <%! // decaration metavlitwn
            public static int count = 5;
        %>
        
        <%
            out.print(count);
        %>
    </body>
</html>
