<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>

 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Main Home Page</title>
    <link rel="stylesheet" href="/bootstrap-4.4.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/fontawesome-free-5.12.0-web/css/all.css">
  
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-dark bg-success">
    <img height="70px"
        src="${images}/Dislogo.gif"
        alt="">
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav offset-md-2 pl-5">
            <li class="nav-item active">
                <h3 class=" active"><a class="nav-link" href="#">DISCOM ELECTRICITY PRIVATE LIMITED <span
                            class="sr-only">(current)</span></a></h3>
            </li>
            

        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
                <a class="nav-link active" href="/HomePage/mainhomepage.html"><i class="fas fa-home"></i>Home</a>
             </li>
             <li class="nav-item active">
                <a class="nav-link active" href="">About</a>
             </li>
        </ul>


    </div>
</nav>

<div style="color: blue;"><marquee ><h3>Welcome to Online Payment Page. Please fill valid details !</h3> </marquee></div>
  <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">
        
    <form action="/HomePage/consumer.homepage.html" >
        <div  id="success" class="alert alert-success" style="display: none; margin-top: 3px;">

            <strong>Success!</strong>
          </div>
          <div class="col-50">
            
            <div style="padding-left: 13px;" ;class="icon-container ">
              <h5 for="fname">Accepted Cards</h5>
              <img height="40px" width="20%"
              src="/paymentPage/download.png"
              alt="">
              <img height="40px"width="20%"
              src="/paymentPage/download (1).png"
              alt="">
              <img height="60px"width="35%"
              src="/paymentPage/download (2).png"
              alt="">
              <img height="90px"width="21%"
              src="/paymentPage/download (3).png"
              alt="">
              
            </div>
        <h3 class="text-center">PAYMENT DETAILS</h3>
       
        <div class="form-group">
            <label for="exampleInputEmail1">CARD NUMBER</label>
            <input id="email" type="number" placeholder="Valid Card Number" class="form-control" >
                
         
        </div>
        <div>
          &nbsp;<label for="exampleInputPassword1">EXPIRY DATE</label><br>
            &nbsp; <input  style=width:80px; type="number" placeholder="YYYY"  >
            &nbsp; &nbsp;<input  style=width:80px; type="number" placeholder="MM" >
            &nbsp; &nbsp; &nbsp;<label for="exampleInputPassword1">CV CODE</label>
            &nbsp;<input style=width:70px; type="number" placeholder="CVC"  >
         

        </div>
        <div class="form-group form-check ">
         <p>
            <div class="float-left">
                <input onclick="checkBox()" id="checkbox" type="checkbox" class="form-check-input">
            <label class="form-check-label" for="exampleCheck1">Agree the terms & conditions.</label>
            </div>
         </p>
        </div>
        <button type="submit" class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Pay</button>
    </form>
</div>
<script src="${js}/jquery-3.4.1.js"></script>
<script src="${js}/js/bootstrap.min.js"></script>
<script src="${js}/paymentPage.js"></script>

</body>
</html>