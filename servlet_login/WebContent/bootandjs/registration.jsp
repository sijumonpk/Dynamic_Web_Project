<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <link rel="stylesheet" href="style.css">
 <link rel="stylesheet" href="bootstrap.min.css">
 <script src="jquery-3.4.1.min.js"></script>
<script src="bootstrap.min.js"></script>
<script type="text/javascript" src="jquery.js"></script>
</head>
<body>

<div clss="container">
<div class="col-xsm-3 col-sm-3 col-md-3 col-lg-3 "></div>
<div class="col-xsm-6 col-sm-6 col-md-6 col-lg-6 col-responsive">
<form id="reg" action="/servlet_login/RegisterServlet" method="post">
<h3 class="text-center">Registration</h3>
Name:<br><input type="text" name="name"><br><br>
Email:<br><input type="email"><br><br>
Password:<input type="password" name="password"><br><br>
College name:<input type="text" name="college"><br><br>
Department:<input type="text" name="department"><br><br>

<center><input id="btn" type="submit" name="submit" value="Register"></center><br><br>

</form>
</div>
</div>
</body>
</html>