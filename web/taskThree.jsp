<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Footballer" %><%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 14.10.2021
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900&amp;subset=cyrillic" rel="stylesheet">
    <link rel="stylesheet" href="css/main.css">
    <title>football</title>
</head>
<body>
    <div class="container">
        <div class="form shadow">
            <form action="/taskThree" method="post">
                <h2>Football Manager</h2>
                <input type="text" name="player-name" placeholder="Insert name">
                <input type="text" name="player-surname" placeholder="Insert surname">
                <select name="foot-club">
                    <option value="zhetisu">Zhetisu</option>
                    <option value="kairat">Kairat</option>
                    <option value="aktobe">Aktobe</option>
                    <option value="astana">Astana</option>
                    <option value="ordabasy">Ordabasy</option>
                    <option value="okzhetpes">Okzhetpes</option>
                    <option value="shahter">Shahter</option>
                    <option value="taraz">Taraz</option>
                    <option value="zhenis">Zhenis</option>
                    <option value="baikonyr">Baikonyr</option>
                </select>
                <input type="number" name="salary" placeholder="Insert salary">
                <input type="number" name="transfer-price" placeholder="Insert transfer price">
                <input type="submit" name="add" value="Add footballer">
            </form>
        </div>
        <div class="footballerList">
            <%
                ArrayList<Footballer> footballers = (ArrayList<Footballer>) request.getAttribute("footballers");
                    for (Footballer footballer : footballers) {
                        out.println("<div class=\"player\">");
                        out.println("<p class='playerName'>" + footballer.getName() + " " + footballer.getSurname() + "</p>");
                        out.println("<p class='club'> Club: " + footballer.getClub() + "</p>");
                        out.println("<p class='salary'> Salary: " + footballer.getSalary() + " KZT</p>");
                        out.println("<p class='salary'> Transfer price: " + footballer.getTransferPrice() + " KZT</p>");
                        out.println("</div>");
                    }
                %>
        </div>
    </div>
</body>
</html>
