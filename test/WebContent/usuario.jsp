<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Aplicación Gestión de Usuarios</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	 <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: white">
            
            <div class="col-8 barra">
                <img class="imagen" src="https://graffica.info/wp-content/uploads/2019/04/logo-bbva-05-1.png "  width="150" class="my-4">
            </div>
          
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">

                        <c:if test="${usuario != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${usuario == null}">
                            <form action="insert" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${usuario != null}">
                                    Editar Usuario
                                </c:if>
                                <c:if test="${usuario == null}">
                                  
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${usuario != null}">
                            <input type="hidden" name="id" value="<c:out value='${usuario.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>User</label> <input type="text" value="<c:out value='${usuario.nombre}' />" class="form-control" name="nombre" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Password </label> <input type="text" value="<c:out value='${usuario.email}' />" class="form-control" name="email">
                        </fieldset>

             

                        <button type="submit" class="btn  btn-success">Login</button>
                        
                         <script  type="text/javascript" src="js/js.js"></script>
                        </form>
                    </div>
                </div>
            </div>
</body>
</html>