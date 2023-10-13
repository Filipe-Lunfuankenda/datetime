<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data e Hora Atual em PHP</title>
    <style>
        body {
            background-image: linear-gradient(to bottom, orange, red);
            text-align: center;
            height: 100vh;
            font-family: Arial, Helvetica, sans-serif;
            color: white;
        }
        p {
            font-size: 5em;
            font-family: ds-digital, Arial, Helvetica, sans-serif;
        }
    </style>
</head>
<body>
    <h1>Script to get the Current Date and Time</h1>
    <?php
        date_default_timezone_set("Europe/Lisbon"); //You can configure the timezone whatever you want
        $dataHoraAtual = date("d/m/Y H:i:s");
        echo "<p>$dataHoraAtual</p>";
    ?>
</body>

</html>
