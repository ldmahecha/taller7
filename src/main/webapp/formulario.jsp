<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>

<html lang="es">
<head>

    <meta charset="utf-8">
    <meta name="author" content="Daniela Mahecha">
    <meta name="description" content="Registrate y crea una cuenta para mejorar tu servicio">
    <meta name="keywords" content="registro de usuatio,formulacion de registro,crear cuenta,registrar en linea">
    <meta name="viemport" content="width=device-width, initial-scale=1">



    <title>Regisro de Usuario .:. MyAppdan</title>
    <link rel="icon" type="image/x-icon" herf="img/123.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <link rel=stylesheet" href="https://cdn.isdelivr .net/npm/bootstrap-iconse1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="css/signin.css">

</head>
<body class="text-center">
    <main class="form-signin w-100 m-auto">
    <form action="" method="post">
          <img class="mb-4" src="./img/123.png" alt="MY APPDAN" width="100">
         <h4 class="text-secondary">MY -APPDAN</h4>
             <h1 class="h5 mb-3 fu-normal">Ingreso</h1>

         <div class="form-Floating">
                <input type="text" class="form-control" id="FloatingInput"
                placeholder="ingrese su nombre de usuario" required autofocus
                pattern="[A-Z0-20-91(8, 12)">
                <label for="floatingInput">Usuario:</label>
            </div>
            <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword"
                       placeholder="ingrese su contraseña" required pattern="[A-Za-20-9](8, 12)">
                <label for="floatingPassword">Contraseña: </label>
                </div>

                       <button class="w-100 btn btn-1g btn-primary" type="submit"> Ingresar </button>
                <div id="register">
                <a href="index.jsp">Registrarse</a>

                </div>
                <P class="mt-3 mb-3 text-nuted">Todos los Derechos Reservados MY APPDAN
                    @<%=displayDate()%>
                </p>

    </form>
    </main>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <%!
        public String displayDate() {
            SimpleDateFormat dateformat = new  SimpleDateFormat ("YYYY");
                    Date date = Calendar.getInstance().getTime();
            return dateformat.format(date);
        }
%>



<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.min.js"></script>

</body>
</html>
