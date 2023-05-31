<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!--  bootStrap  -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

    <!--  CSS  -->
    <link rel="stylesheet" href="style.css">
</head>
<body class="text-center">
    
<main class="form-sigin w-100 m-auto login">
        <div class="form">
            <img src="user-interface.png" alt="icon-user" class="mb-4" id="brand">
            <h1 class="h3 mb-3">Acesse o painel</h1>
            <form class="p-4" action="login.php" method="post"><div class="form-floating">
                <input type="email" name="email" id="floatingInput" class="form-control" placeholder="email">
                <label for="floatingInput">Email</label>
            </div>
            <div class="form-floating">
                <input type="password" name="password" id="floatingPassword" class="form-control" placeholder="password">
                <label for="floatingPassword">Password</label>
            </div>
            <div class="checkbox mb-3 mt-3">
                <input type="checkbox" name="" id="">Lembrar-me
            </div>
            <input type="submit" value="acessar" class="w-100 btn btn-danger">
        </form>     
        </div>
    </main>


  <!--  bootStrap  -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>