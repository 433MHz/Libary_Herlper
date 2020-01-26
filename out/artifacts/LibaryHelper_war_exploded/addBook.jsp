<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>

<html lang="pl">
<head>
    <meta charset="utf-8">
    <title>Dodaj książkę</title>
    <link rel="stylesheet" type="text/css" href="CSS_Files/Stylesheet.css">
    <link href="https://fonts.googleapis.com/css?family=Oswald:400,700&display=swap&subset=latin-ext" rel="stylesheet">
</head>

<body>
<div id = container>
    <div class="leftRightSides" style="float: left; width: 30%">
        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="1" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Dodaj użytkownika">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="2" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Usuń istniejącego użytkownika">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="3" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Edytuj istniejącego użytkownika">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="4" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Sprawdź użytkowników">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="5" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Sprawdź książki">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="6" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Zarządzaj książkami">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="7" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Dodaj książkę">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="8" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Usuń książkę">
        </form>

        <form method="post" action="interfaceNavigation">
            <input type="hidden" value="9" name="MainMenuInterfaceButtons">
            <input type="submit" class="menuOptions" value="Wyloguj">
        </form>
    </div>
    <div class="leftRightSides" style="float: left; width: 60%; padding: 1%">
        <h1>Dodaj książkę</h1>
        <input type="text" class="MainMenuTexts" placeholder="Tytuł"><br/>
        <input type="text" class="MainMenuTexts" placeholder="Imie autora"><br/>
        <input type="text" class="MainMenuTexts" placeholder="Nazwisko autora"><br/>
        <input type="text" class="MainMenuTexts" placeholder="Wydawnictwo"><br/>
        <input type="text" class="MainMenuTexts" placeholder="Rok wydania"><br/>
        <input type="text" class="MainMenuTexts" placeholder="Numer ISBN"><br/>
        <input type="submit" class="MainMenuTexts" value="Dodaj">

    </div>
    <div style="clear: both"/>
</div>
</body>
</html>