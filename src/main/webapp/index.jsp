<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Registro</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css">

</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-lg-6 col-md-8 col-sm-10">
            <h2 class="mb-4">Registro de Usuario</h2>
            <form>
                <div class="form-group">
                    <label for="name">Nombre</label>
                    <input type="text" class="form-control" id="name" placeholder="Ingrese su nombre" name="name" required autofocus
                           pattern="[A-Za-z ]{2,40}">
                </div>
                <div class="form-group">
                    <label for="last name">Apellidos</label>
                    <input type="text" class="form-control" id="last name" placeholder="Ingrese su apellido" name="last name" required
                           pattern="[A-Za-z ]{2, 40}">
                </div>
                <div class="form-group">
                    <label for="email">Correo electrónico</label>
                    <input type="email" class="form-control" id="email" placeholder="Ingrese su correo" name="email" required
                           pattern="{,60}">
                </div>
                <div class="form-group">
                    <label for="password">Contraseña</label>
                    <input type="password" class="form-control" placeholder="Ingrese su contraseña" id="password" name="password" required
                           pattern="[a-z])(?=.[A-Z])(?=.[0-9])(?=.[!@#$%^&_=+-]){8,16}"><br>
                </div>
                <button class="btn btn-secondary btn-block">Ingresar</button><br>
                <br>
                <button type="submit" class="btn btn-primary btn-block">Enviar</button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>