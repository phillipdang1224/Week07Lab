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
        <form action="users" method="post">
            <h2>Users</h2>
            <table>
                <tr>
                    <th>Username</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Delete</th>
                    <th>Edit</th>
                </tr>
                <c:forEach var="user" items="getAll()">
                    <tr>
                    <td>${user.getUsername}</td>
                    <td>${user.getFirstname}</td>
                    <td>${user.getLastname}</td>
                    <td>${user.getEmail}</td>
                    <td><input type="submit" name="delete" value="Delete"></th>
                    <td><input type="submit" name="edit" value="Edit"></th>
                </tr>
                </c:forEach> 
            </table>
            <h2>Add User</h2>
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" name="username" value="${username}"></td>
                </tr>
                <tr>
                    <td>First Name: </td>
                    <td><input type="text" name="firstName" value="${firstname}"></td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td><input type="text" name="lastName" value="${lastname}"></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="text" name="password" value="${password}"></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><input type="text" name="email" value="${email}"></td>
                </tr>
            </table>
            <input type="submit" name="save" value="Save">
        </form>
    </body>
</html>
