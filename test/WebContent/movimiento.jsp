<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movimientos 1</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark" style="background-color: white">
			
            
             <div class="col-8 barra">
                <img class="imagen" src="https://graffica.info/wp-content/uploads/2019/04/logo-bbva-05-1.png "  width="150" class="my-4">
            </div>
            
            <ul class="navbar-nav">
            	<li><a href="<%=request.getContextPath()%>/list" class="nav-link">Usuarios</a></li>
            </ul>
		
		</nav>
	</header>
	<br/>
	
	<div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">

                    <div class="container text-left">

                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Movimientos</th>
                               
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="usuario" items="${listUsuarios}">

                                <tr>
                                    <td>
                                        <c:out value="${bill.date_bill}" />

                                    </td>

                                       <button type="submit" class="btn  btn-success">Eliminar</button>
                                       <button type="submit" class="btn  btn-success">Cancelar</button>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
	
	
	
	
</body>
</html>