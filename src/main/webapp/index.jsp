
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Calculadora IMC</title>
        <link type="text/css" rel="stylesheet" href="../css/materialize.min.css"  media="screen,projection"/>


    </head>
    <body>
        <div class="row">
        <div class="col m6 offset-m3">
            <div class="container">
                <h3>Calculadora de IMC</h3>
                <hr>
                <form>
                    <div class="container-fluid">
                        <div class="row">
                            <div class="input-field col m8 offset-m2">
                                <input name="peso" id="peso" type="number" step="any" class="validate">
                                <label for="peso">Peso - Ex.: 70</label>
                            </div>
                        </div>
                    </div>
                    <div class="container-fluid">
                        <div class="row">
                            <div class="input-field col m8 offset-m2">
                                <input name="altura" id="altura" type="number" step="any" class="validate">
                                <label for="altura">Altura - Ex.: 1.70</label>
                            </div>
                        </div>
                    </div>
                    <div class="container-fluid">
                        <div class="row">
                            <div class="input-field col m8 offset-m2">
                                <select name="sexo" id="sexo">
                                  <option value="masculino">Masculino</option>
                                  <option value="feminino">Feminino</option>
                                </select>
                                <label for="sexo">Sexo</label>
                            </div>
                        </div>
                    </div>
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col m8 offset-m2">
                                <button class="waves-effect waves-light btn">Calcular</button>
                            </div>
                        </div>
                    </div>
                </form>
                <hr>
                <div class="alert alert-success" role="alert" style="margin-top:45px">${resultado}</div>
            </div>
        </div>
    </div>


    <script src="../js/jquery-2.1.1.min.js"></script>
    <script src="../js/materialize.min.js"></script>
    <script src="../js/main.js"></script>
    </body>
</html>
