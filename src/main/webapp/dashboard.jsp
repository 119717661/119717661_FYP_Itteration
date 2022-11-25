<%--
Source:
/*W3school resources:
(no date) Bootstrap 3 tutorial. Available at: https://www.w3schools.com/bootstrap/ (Accessed: November 10, 2022). 
Bootstrap resources:
Official CDN of bootstrap and font awesome (no date) Official CDN of Bootstrap and Font Awesome ·. Available at: https://www.bootstrapcdn.com/ (Accessed: November 10, 2022).
Ajax – jQuery Open-Source library:
Hosted libraries  |  google developers (no date) Google. Google. Available at: https://developers.google.com/speed/libraries/ (Accessed: November 10, 2022). 

  --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

  <title>Lean Web App</title>
  <style>
    * {box-sizing: border-box}
    body {font-family: Arial, Helvetica, sans-serif;}
    
    .navbar {
      width: 100%;
      background-color: #555;
      overflow: auto;
    }
    
    .navbar a {
      float: left;
      padding: 12px;
      color: white;
      text-decoration: none;
      font-size: 17px;
      width: 25%; /* Four links of equal widths */
      text-align: center;
    }
    
    .navbar a:hover {
      background-color: #000;
    }
    
    .navbar a.active {
      background-color: #04AA6D;
    }
    
    @media screen and (max-width: 500px) {
      .navbar a {
        float: none;
        display: block;
        width: 100%;
        text-align: left;
      }
    }
    .bg-4 {
  background-color: #2f2f2f;
  color: #ffffff;
}

    </style>
</head>
<body>
 <!-- The navigation menu -->
 <div nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
  <a href="/employee">Schedule & Boards</a>
  <a href="/process">Processes</a>
  <a href="/gemba">Gemba</a>
  <a class="active" href="/dashboard">Dashboard</a>
</div> 

  
<center><h1> Dashboard </h1></center>
<div class="container">
  <div class="row ">

    <div class="col-12">
<iframe title="graph" width="1140" height="541.25" src="https://app.powerbi.com/reportEmbed?reportId=14c3dafc-c2e4-41a1-afaa-68523c840a5e&autoAuth=true&ctid=46fe5ca5-866f-4e42-92e9-ed8786245545" frameborder="0" allowFullScreen="true"></iframe>
    </div>

  </div>
</div>
  

<footer class="container-fluid bg-4 text-center">
  <section class="py-1">
    <div class="container px-4 px-lg-5 mt-5 bg-dark">
        <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-lg-start">
            <div class="col mb-5">
                <div class="card bg-dark text-white border-0">
                    <div class="text-lg-start">
                        <b>Contact Details</b>
                        <hr>
                    </div>
                       
                    <div class="text-lg-start">
                   
                        <p>Phone : 087xxxx60</p>
                        <p>E-mail : 119717661@umail.ucc.ie</p>
                    </div>
            </div>
        </div>
            <div class="col mb-5 float-right ms-auto">
                <div class="card h-10 bg-dark text-white border-0">
                                   
            
       
                   
             


                </div>
            </div>
    </div>
    </div>

</section>
</footer>
<footer class="py-4 bg-light">
    <div class="container">
        <p class="m-0 text-center text-black">Made for University College Cork &copy; <br> Created by: Piotr Janus</p>
    </div>
</footer>

</body>
</html>
