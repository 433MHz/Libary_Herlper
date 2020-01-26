<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html lang="pl">
<head>
    <meta charset="utf-8">
    <title>Edytuj Użytkownika</title>
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
    <div class="leftRightSides" style="float: left; width: 60%; padding: 1%">
        <h1 style="margin-right: 5%">Edytuj użytkownika</h1>
        <div style="font-size: 25px; margin-right: 5%">Wpisz ID użytkownika</div>
        <input type="text" placeholder="ID" class="MainMenuTexts" style="margin-right: 5%"><br/><br/>
        <div style="font-size: 25px">Zaznacz checkboxa aby wskazać pola które mają zostać nadpisane</div>
        <input type="text" placeholder="Nowe imie" class="MainMenuTexts"><input type="checkbox" style="transform: scale(3); margin-left: 3%"><br/>
        <input type="text" placeholder="Nowe nazwisko" class="MainMenuTexts"><input type="checkbox" style="transform: scale(3); margin-left: 3%"><br/>
        <input type="text" placeholder="Nowy numer pesel" class="MainMenuTexts"><input type="checkbox" style="transform: scale(3); margin-left: 3%"><br/>
        <input type="submit" class="MainMenuTexts" style="cursor: pointer; margin-right: 5%" value="Zatwierdź zmiany">
    </div>
    <div style="clear: both"/>
</div>
</body>
</html>