<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title >DISCOM Home Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="${css}/Discom.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>

<body>
 <jsp:include page="header.jsp"></jsp:include>
    
    <div class="my-btn ">
        <a class="float-left" href="./consumerLoginPage"><button type="button" class="btn btn-md-lg btn-sm-lg btn-lg mr-5 btn-outline-primary "><i class="fas fa-user-circle"></i>&nbsp; Consumer Login</button></a>
        <a class="float-left"  href="./employeeLoginPage"><button type="button" class="btn btn-md-lg btn-sm-lg btn-lg  btn-outline-primary"><i class="fas fa-user-circle"></i>&nbsp; Employee Login</button></a>
      
     <!-- <a class="float-left"  href="/AdminLogin/AdminLogin.html"><button type="button" class="btn btn-md-lg btn-sm-lg btn-lg  btn-outline-primary"><i class="fas fa-user-circle"></i>&nbsp; Admin Login</button></a>
      -->
       </div>
    
   
   
   
</body>

</html>