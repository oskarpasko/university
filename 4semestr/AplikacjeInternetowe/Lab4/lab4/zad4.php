<?php
print_r($_REQUEST);
print('<br>');

if ($_SERVER["REQUEST_METHOD"] == "") {

  // Zebrać wartości z pól formularza

  $servername = "localhost";
  $username = "root";
  $password = "";
  $dbname = "";

  try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo "Connected successfully. <br>";

    // Przygotować polecenie insert i wstawić rekord do tabeli

    echo "New record created successfully. <br>";
    $conn = null;
  } catch (PDOException $e) {
    echo "Connection failed: " . $e->getMessage();
    echo $sql . "<br>" . $e->getMessage();
    $conn = null;
  }
}
