<%--
  Created by IntelliJ IDEA.
  User: Krystian
  Date: 26/01/2020
  Time: 08:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="pl">
<head>
  <meta charset="utf-8">
  <title>Logowanie</title>
  <link rel="stylesheet" type="text/css" href="CSS_Files/Stylesheet.css">
  <link href="https://fonts.googleapis.com/css?family=Oswald:400,700&display=swap&subset=latin-ext" rel="stylesheet">
</head>

<body>
<div id = loginInterface>
  <h1 style="font-size: 40px; padding-top: 5%; text-align: center">Zaloguj się</h1>

  <form action="loginProcessing" method="post">
    <div style="text-align: left; font-size: 25px; padding-left: 5%">Login:</div>
    <input type="text" class="loginTextAndPassword" placeholder="login" name="loginTextInIndex"><br/>
    <div style="text-align: left; font-size: 25px; padding-left: 5%">Hasło:</div>
    <input type="password" class="loginTextAndPassword" placeholder="hasło" name="passwordTextInIndex"><br/><br/>
    <input type="submit" id="button" value="Zaloguj"><br/><br/>
  </form>
</div>
</body>
</html>