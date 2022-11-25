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

.laps{
  list-style: none;
  overflow:auto;
  position: relative;
  width: 250px;
  padding: 30px 0;
 
}
.time_stamp{
 display: inline-block;
}
.lap-item{
  display: inline-block;
  text-align: center;
  border: 1px solid #444;
  border-radius:05px;
  margin-bottom:30px;
}
.display-none{
  display: none;
}

    </style>
</head>
<body>
 <!-- The navigation menu -->
 <div nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
  <a href="/employee">Schedule & Boards</a>
  <a href="/process">Processes</a>
  <a class="active" href="/gemba">Gemba</a>
  <a href="/dashboard">Dashboard</a>
</div> 
  
<center><h1> Gemba Calculations </h1></center>


      
<div class="row">
  <div class="col-md-3"> </div>

  <div class="col-md-6">      
        <center>
            <div id="stopwatch">
                <div class="time"><b>
                     <span id="minute">00</span>:
                      <span id="second">00</span>:
                      <span id="ms">00</span>
                      </b>
                </div>
               <br />
                <button id="start" onclick="start();">Start</button>
                <button id="stop" onclick="stop();">Stop</button>
                <button id="save" onclick="save();">Save Time</button> 
            </div>
        </center>
  </div>

  <div class="col-md-3">
  <ul class="laps">
      <li class="lap-item">
        <span class="task_number"> <b>Task Number 1 </b></span><br>
        <span class="time_stamp"> 00 : 00 : 00 </span>
      </li>
        <li class="lap-item">
        <span class="task_number"> <b>Task Number 2 </b></span><br>
        <span class="time_stamp"> 00 : 00 : 00 </span>
      </li>
        <li class="lap-item">
        <span class="task_number"> <b>Task Number 3 </b></span><br>
        <span class="time_stamp"> 00 : 00 : 00 </span>
      </li>
         </li>
        <li class="lap-item">
        <span class="task_number"> <b>Task Number 4 </b></span><br>
        <span class="time_stamp"> 00 : 00 : 00 </span>
      </li>
  </ul>
  </div>
</div>



        
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

<script type="text/javascript">
var timer = 0;
var timerInterval;
var ms = document.getElementById('ms');
var second = document.getElementById('second');
var minute = document.getElementById('minute');


function start() {
  stop();
  timerInterval = setInterval(function() {
    timer += 1/60;
    msVal = Math.floor((timer - Math.floor(timer))*100);
    secondVal = Math.floor(timer) - Math.floor(timer/60) * 60;
    minuteVal = Math.floor(timer/60);
    ms.innerHTML = msVal < 10 ? "0" + msVal.toString() : msVal;
    second.innerHTML = secondVal < 10 ? "0" + secondVal.toString() : secondVal;
    minute.innerHTML = minuteVal < 10 ? "0" + minuteVal.toString() : minuteVal;
  }, 1000/60);
}

function stop() {
  clearInterval(timerInterval);
}

const lapButton = document.getElementsByClassName("lap")[0];
const toggleButton = () => {
  lapButton.classList.remove("display-none")
}
</script>

</body>
</html>
