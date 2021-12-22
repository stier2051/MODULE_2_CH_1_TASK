<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 13.10.2021
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900&amp;subset=cyrillic" rel="stylesheet">
    <link rel="stylesheet" href="css/main.css">
    <title>food-order</title>
</head>
<body>
    <div class="form shadow">
        <form action="/taskOne" method="post">
            <h2>Order food</h2>
            <input type="text" name="userName" placeholder="Insert name">
            <input type="text" name="userSurname" placeholder="Insert surname">
            <select name="typeOfFood" id="food">
                <option value="Burger">Burger - 2000 KZT</option>
                <option value="Pizza">Pizza - 2300 KZT</option>
                <option value="Shashlyk">Shashlyk - 3000 KZT</option>
                <option value="Hotdog">Hotdog - 1500 KZT</option>
            </select>
            <input type="submit">
        </form>
    </div>
</body>
</html>
