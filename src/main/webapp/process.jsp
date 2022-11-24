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
  <a class="active" href="/process">Processes</a>
  <a href="/gemba">Gemba</a>
  <a href="/dashboard">Dashboard</a>
</div> 

  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="/process">Add Process</a></p>
      <p><a href="/task">Add Task</a></p>
    </div>
    <div class="col-sm-8 text-left"> 
      <h1>Welcome  to the Lean App</h1><br>
      <p> Please Add New Process</p><br>
    
      
         <form action="addProcess">
            <div class="d-flex justify-content-between"><b>Process ID: <b><input type="text" name="procID"></div><br>
            <div class="d-flex justify-content-between"><b>Process Name First Name:  </b><input type="text" name="procName"></div><br>
            <input type="submit"><br>
        </form>
        
<br>

        
<br>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
      <hr>

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
