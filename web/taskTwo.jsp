<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 14.10.2021
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900&amp;subset=cyrillic" rel="stylesheet">
    <link rel="stylesheet" href="css/main.css">
    <title>welcome</title>
</head>
<body>
    <div class="form shadow">
        <form action="/taskTwo" method="post">
            <h2>Welcome!</h2>
            <p>Full name</p>
            <input type="text" name="fullName" placeholder="Insert full name">
            <p>Age</p>
            <input type="number" name="age" placeholder="Insert age">
            <p>Gender</p>
            <div class="gender">
                <input type="radio" name="gender" value="male">Male
                <input type="radio" name="gender" value="female">Female
            </div>
            <input type="submit">
        </form>
    </div>
</body>
</html>
