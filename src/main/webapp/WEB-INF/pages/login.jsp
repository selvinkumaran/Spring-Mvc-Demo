<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <form action="processLogin" modelAttribute="user">
            <h1>Login</h1>
            <div>
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required />
            </div>
</br>
            <div>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required />
            </div>
            <p>Not an user <a href="register">Click here</a></p>
        <div>
            <input type="submit" value="Login" />
        </div>
    </form>
</body>
</html>
