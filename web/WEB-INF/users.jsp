<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Users</title>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <h1>Manage Users</h1>
        <h2>Users</h2>
        <form action="users" method="post">
            <table>
                <tr>
                    <th>Username</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Delete</th>
                    <th>Edit</th>
                </tr>
                <c:forEach var="user" items="">
                    <tr>
                    <th>Username</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th><input type="submit" name="action" value="Delete"></th>
                    <th><input type="submit" name="action" value="Edit"></th>
                </tr>
                </c:forEach> 
            </table>
        </form>
    </body>
</html>
