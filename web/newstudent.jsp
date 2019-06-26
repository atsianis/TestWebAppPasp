<%-- 
    Document   : newstudent
    Created on : 26 Ιουν 2019, 11:58:03 πμ
    Author     : samsung np350
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Student</title>
    </head>
    <body>
        <h1><%=request.getAttribute("title")%></h1>
        <form action="insertstudent" method="POST">
            Name <input name="name" type="text" /><br/>
            Surname <input name="surname" type="text" /><br/>
            Grade <input name="grade" type="number" /><br/>
            Birthdate <input name="birthday" type="date" /><br/>
            <input type="submit" value="New Student" name="new" />
        </form>
    </body>
</html>
