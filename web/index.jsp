<%--
  Created by IntelliJ IDEA.
  User: tetianay
  Date: 9/26/2019
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Prog.kiev.ua</title>
    <link rel="stylesheet" href="styles.css">
  </head>
  <body>
  <% String login = (String)session.getAttribute("user_login"); %>
  <% if (login == null || "".equals(login)) { %>
  <form class="loginform" action="/statistic" method="GET">
    Login: <input type="text" name="login"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" />
  </form>
  <% } else { %>
  <h1>You are logged in as: <%= login %></h1>
  <br>Click this link to <a href="/login?a=exit">logout</a>
  <% } %>
  </body>
</html>
