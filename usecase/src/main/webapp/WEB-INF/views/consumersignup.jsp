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
    
    <!-- <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1 card card-body mt-5 my-card"> -->
    <!-- <div class="col-md-4 col-sm-12  col-10 col-4 offset-md-4   offset-1  mt-5 my-card"> -->
    <div class="container " >
       <div><h1 id=title>SIGN UP PAGE</h1></div> 

        <form class="my-card" action="/Consumerlogin/Consumerlogin.html" onsubmit="return validateForm()" >
            <div class="form-row " >

                <div class="col-sm-6">

                    <label for="validationDefault01" ><b>First name</b></label>
                    <input type="text" class="form-control" id="fname" placeholder= "example: Mark"  required>
                    <p id="ferror" style="color: red; display:none; font-size: 12px;">provide valid name</p>

                </div>
                <div class="col-sm-6">
                    <label for="validationDefault02"><b>Last name</b></label>
                    <input type="text" class="form-control" id="lname" placeholder="Harry" required>
                    <p id="lerror" style="color: red; display:none; font-size: 12px;">provide valid name</p>

                </div>
                <!-- <div class="col-md-4 mb-3">
                    <label for="validationDefaultUsername">Username</label>
                    <div class="input-group">
                        
                        <input type="text" class="form-control" id="validationDefaultUsername"
                            aria-describedby="inputGroupPrepend2" required placeholder="Mark10@alex&">
                    </div>
                </div> -->
                <div class="col-sm-6"><br>

                    <label for="validationDefault01"><b>Email Id</b></label>
                    <input id="email" type="email" class="form-control"  placeholder="mark@gmail.com" required>

                </div>

                <div class="col-md-6 mb-2"><br>
                    <label for="validationDefault02"><b>Phone Number</b></label>
                    <input type="number" class="form-control" id="pname" placeholder="valid 10 number" required>
                    <p id="perror" style="color: red; display:none; font-size: 12px;">provide valid 10 numbers</p>

                </div>


                <!-- <div class="col-sm-12">

                    <label for="validationDefault01">Email Id</label>
                    <input type="text" class="form-control" id="validationDefault01" placeholder="enter the email Id" required>
                </div> -->

                
                <div class="col-sm-12"><br>

                    <label for="validationDefault01"><b>Meter Number/RR Number</b></label>
                    <input id="mname" type="number" class="form-control"  placeholder="valid meter/rr number" required>
                    <p id="merror" style="color: red; display:none; font-size: 12px;">provide valid 8 numbers</p>

                </div>



                <div class="col-sm-6"><br>

                    <label for="validationDefault01"><b>Password</b></label>
                    <input id="password" type="password" class="form-control" placeholder="valid password" required>
                    <p id="pele" style="color: red; display:none; font-size: 12px;">provide valid password</p>
                </div>

                <div class="col-md-6 mb-2"><br>
                    <label for="validationDefault02"><b>Confirm Password</b></label>
                    <input id="cname" type="password" class="form-control"  placeholder="valid password" required>
                    <p id="cerror" style="color: red; display:none; font-size: 12px;">provide valid password</p>
                </div>
        

                <!-- <div class="col-md-4 mb-3"><br>
                    <label for="validationDefault02">Meter Number/RR Number </label>
                    <input type="text" class="form-control" id="validationDefault02" placeholder="enter the meter/rr number" required>
                    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
                    <input type="password" class="form-control" id="inputPassword">
                </div>
            </div> -->
       
                    
                     <!-- <div class="btn-group">
                        <button class="btn btn-secondary btn-lg dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                          Large button
                        </button>
                        <div class="dropdown-menu">
                        
                        </div> 

                <div id ="para1"class="col-sm-12"><br>
                    <label for="validationDefault03"  >Address Line1 </label><br>
                    <input type="text" class="form-control" id="validationDefault03" placeholder="address line1" required><br>
                    <label for="validationDefault03">Address Line2</label><br>
                    <input type="text" class="form-control" id="validationDefault03"  placeholder="address line2" required>
                </div> -->
                <!-- <div class="col-md-3 mb-3"><br>
                    <label for="validationDefault04">State</label>
                    <select class="custom-select" id="validationDefault04" required>
                        <option selected disabled value="">Choose...</option>
                        <option>...</option>
                    </select>
                </div> -->
           
            <!-- <div class="form-group">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
                    <label class="form-check-label" for="invalidCheck2">
                        Agree to terms and conditions
                    </label>
                </div>
            </div> -->
            <!-- <button id = bt1 class="btn btn-primary" type="submit">Submit form</button> -->
            <div class="  col-md-6 mb-2"   ><br>
                <label for="validationDefault01"><b>Region</b></label>
                <select class="custom-select" >
                    <option selected value ="0" selected disabled>choose</option>
                    <option value="1">Banglore North</option>
                    <option value="2">Banglore South</option>
                   
                  </select>
                </div>

                <div class="  col-md-6 mb-2"   ><br>
                    <label for="validationDefault01"><b>Consumer Type</b></label>
                    <select class="custom-select" >
                        <option value ="0" selected disabled >choose</option>
                        <option value="1">Residential</option>
                        <option value="2">Commercial</option>
                        <option value="3">Industry</option>
                      </select>
                </div>

                 
                <div class="col-sm-12"><br>

                    <label for="validationDefault01"><b>Address 1</b></label>
                    <input id="mname" type="text" class="form-control"  placeholder="address line 1" required>
                    <p id="merror" style="color: red; display:none; font-size: 12px;">provide valid address</p>

                </div>

                 
                <div class="col-sm-12"><br>

                    <label for="validationDefault01"><b>Address 2</b></label>
                    <input id="mname" type="text" class="form-control"  placeholder="address line 2" required>
                    <p id="merror" style="color: red; display:none; font-size: 12px;">provide valid address</p>

                </div>



                <div class="form-group">
                    <div class="form-check"><br>
                        <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
                        <label class="form-check-label" for="invalidCheck2">
                            I hereby declare that the details furnished above are true and correct to the best
                             of my knowledge and belief and I undertake to inform you of any changes therein, immediately. 
                        </label>
                    </div>
                </div>
                <button type="submit"  class="btn btn-primary">Submit</button> 

           


                <!-- <form action="http://google.com">
                    <button class="btn btn-primary" type="submit">Submit</button>
                </form> -->


        </form>
    </div>

    <script src="/jquery/jquery-3.4.1.js"></script>
    <script src="/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
    <script src="/ConsumerSignUp/signupPage.js"></script>

</body>
</html>