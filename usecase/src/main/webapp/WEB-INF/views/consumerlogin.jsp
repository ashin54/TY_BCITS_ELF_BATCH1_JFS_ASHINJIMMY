<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <nav class="navbar navbar-expand-lg navbar-dark bg-success">
        <img height="70px"
            src="/Consumerlogin/Dislogo.gif"
            alt="">
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav offset-md-2 pl-5">
                <li class="nav-item active">
                    <h3 class=" active"><a class="nav-link" href="#">DISCOM ELECTRICITY PRIVATE LIMITED <span
                                class="sr-only"></span></a></h3>
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
    <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card">
        
        <form action="/HomePage/consumer.homepage.html" onsubmit="return validateForm()">
            <div id="success" class="alert alert-success" style="display: none;">
                login
                <strong>Success!</strong>
              </div>
            <div class="text-primary offset-md-5 ">
                <h1><i class="fas fa-user-circle"></i></h1>
            </div>
            <h2 class="text-center">Consumer Login</h2>
            <div class="form-group">
                <label for="exampleInputEmail1">Email Id</label>
                <input id="email" type="email" placeholder="validemail@gmail.com" class="form-control" >
                    
                <p id="eele" style="color: red; display:none; font-size: 12px;">provide valid emailId</p>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input  id="password" type="password" placeholder="Mark@123$%" class="form-control" id="exampleInputPassword1">
                <p id="pele" style="color: red; display:none; font-size: 12px;">provide valid password</p>

            </div>
            <div class="form-group form-check ">
             <p>
                <div class="float-left">
                    <input onclick="checkBox()" id="checkbox" type="checkbox" class="form-check-input">
                <label class="form-check-label" for="exampleCheck1">Show Password</label>
                </div>

                <div class="float-left offset-md-4 ">
                    <input id="savebox"  type="checkbox" class="form-check-input ">
                <label class="form-check-label" for="exampleCheck1">Save Password</label>
                </div>
             </p>
            </div>
            <button type="submit" class="btn btn-outline-primary col-md-8 offset-md-2 mt-3">Login</button>
        </form>
        <p class="text-center mt-1">
            New user ?
            <a class="my-text" href="/consumerSignUp/signupPage.html">Register</a>

        </p>
    </div>
    

<script src="/jquery/jquery-3.4.1.js"></script>
<script src="/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="/Consumerlogin/ConsumerLogin.js"></script>


</body>
</html>