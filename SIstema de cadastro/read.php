<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
    <div class="row">
        <div class="col-md-12 mt-4">
            <h1 class="text-center">Ver contato</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 mx-auto">
            <div class="card">
                <?php
                    include 'Model.php';
                    $model = new Model();
                    $id = $_REQUEST['id'];
                    $row = $model->fetch_unico($id);
                    if(!empty($row)){
                ?>
                <div class="card-header">
                    <?php echo $row['name']; ?>
                </div>
                <div class="card-body">
                    <p><?php echo $row['email']; ?></p>
                    <p><?php echo $row['whatsapp']; ?></p>
                    <p><?php echo $row['address']; ?></p>
                </div>
                <?php
                    }else{
                        echo "Sem registros";
                    }
                        
                ?>
            </div>
        </div>
    </div>
</body>
</html>