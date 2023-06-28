<?php
include 'Model.php';
$model = new Model();
$id = $_REQUEST['id'];
$delete = $model->delete($id);

    if($delete) {
        echo "<script>alert('Deletado com secusso!')</script>";
        echo "<script>window.location.href='list.php'</script>";
    }
?>