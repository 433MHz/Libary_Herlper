<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html lang="pl">
<head>
    <meta charset="utf-8">
    <title>Zarządzaj książkami</title>
    <link rel="stylesheet" type="text/css" href="CSS_Files/Stylesheet.css">
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,700&display=swap&subset=latin-ext" rel="stylesheet">

</head>

<body>
<div id = container>
    <div class="leftRightSides" style="float: left; width: 30%">
        <div class="menuOptions">Dodaj użytkownika</div>
        <div class="menuOptions">Usuń istniejącego użytkownika</div>
        <div class="menuOptions">Edytuj istniejącego użytkownika</div>
        <div class="menuOptions">Sprawdź użytkowników</div>
        <div class="menuOptions">Sprawdź książki</div>
        <div class="menuOptions">Zarządzaj książkami</div>
        <div class="menuOptions">Dodaj książkę</div>
        <div class="menuOptions">Usuń książkę</div>
        <div class="menuOptions">Wyloguj</div>
    </div>
    <div class="leftRightSides" style="float: left; width: 60%">
        <h1>Zarządzaj książkami</h1>
        <h2>Wypożyczenie książki</h2>
        <input type="text" class="MainMenuTexts" placeholder="id użytkownika"><br/>
        <input type="text"class="MainMenuTexts" placeholder="id książki"><br/>
        <input type="submit" class="MainMenuTexts" value="Zatwierdź"><br/><br/><br/>
        <h2>Zwrot książki</h2>
        <input type="text" class="MainMenuTexts" placeholder="id książki"><br/>
        <input type="submit" class="MainMenuTexts" value="Zatwierdź"><br/>

    </div>
    <div style="clear: both"/>
</div>
</body>
</html>