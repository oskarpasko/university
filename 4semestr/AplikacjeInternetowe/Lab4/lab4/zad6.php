<?php
$servername = "localhost";
$username = "test";
$password = "test";
$dbname = "test";

try {
    $conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    //Pobrać zawartość tabeli questions
    // $sth = $dbh -> prepare("SELECT * FROM questions");
    // $sth -> execute();
    // $results = $sth -> execute();

} catch (PDOException $e) {
    echo "Fail: " . $e->getMessage();
}
?>

<!doctype html>
<html lang="pl">
  <head>
    <link rel="icon" href="data:;base64,iVBORw0KGgo=">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Zad2</title>
    <link href="css/bootstrap.css" rel="stylesheet">
  </head>
  <body>
    <div id="inne" class="container mt-5 mb-3">
        <div class="row d-flex justify-content-center">
            <div class="col-sm-12 col-md-8">
                <h2>Zapytania o ofertę</h2>
                <!-- Wygenerować tabelkę HTML zawierającą wcześniej pobrane dane -->
                
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Email</th>
                            <th scope="col">Oferta</th>
                            <th scope="col">Kwota</th>
                            <th scope="col">Notka</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php foreach ($result as $r)?>
                            <td><?php print $r['id'] ?></td>
                            <tr>
                            <th scope="row">1</th>
                            <td><?php print $r['email'] ?></td>
                            <td><?php print $r['kwota'] ?></td>
                            <td><?php print $r['oferta'] ?></td>
                            <td><?php print $r['komentarz'] ?></td>
                        </tr>
                        <?php endforeach; ?>
                    </tbody>
                </table>
            </div>
        </div> 
    <script src="js/bootstrap.bundle.js"></script>
  </body>
</html>


