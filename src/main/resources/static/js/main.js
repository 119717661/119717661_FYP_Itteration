  // Selector 
  const select = document.querySelector('#process-select');
  const table = document.querySelector('.table');


  select.addEventListener('change', () => {
   
    table.style.display = '';

    const selectedProcess = select.options[select.selectedIndex].textContent;
    
    for (const row of table.rows) {
 
      const processCell = row.querySelector('.process-name');
      if (processCell) {
          if (processCell.textContent === selectedProcess) {
          row.style.display = '';
        } else {
           row.style.display = 'none';
        }
      }
    }
  });

//stopwatch

  var timer = 0;
  var timerInterval;
  var lapNum = 1;
  var ms = document.getElementById('ms');
  var second = document.getElementById('second');
  var minute = document.getElementById('minute');
  let currentRow = 0; 
  let isRunning = true;
  let startTime;

  function start() {
  document.getElementById("minute").innerHTML = "00";
  document.getElementById("second").innerHTML = "00";
  document.getElementById("ms").innerHTML = "00";
  timer = 0;

  clearInterval(timerInterval);

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
  if (isRunning) {
    clearInterval(timerInterval);
    isRunning = false;
    document.getElementById("stop").innerHTML = "Resume";
  } else {
    startTime = new Date();
    timerInterval = setInterval(function() {
      timer = ((new Date().getTime() - startTime.getTime()) / 1000);
      msVal = Math.floor((timer - Math.floor(timer))*100);
      secondVal = Math.floor(timer) - Math.floor(timer/60) * 60;
      minuteVal = Math.floor(timer/60);
      ms.innerHTML = msVal < 10 ? "0" + msVal.toString() : msVal;
      second.innerHTML = secondVal < 10 ? "0" + secondVal.toString() : secondVal;
      minute.innerHTML = minuteVal < 10 ? "0" + minuteVal.toString() : minuteVal;
    }, 1000/60);
    isRunning = true;
    document.getElementById("stop").innerHTML = "Stop";
  }
}

function reset() {
  clearInterval(timerInterval);

  timer = 0;
  document.getElementById("minute").innerHTML = "00";
  document.getElementById("second").innerHTML = "00";
  document.getElementById("ms").innerHTML = "00";
}

function save() {
  const selectedProcess = select.options[select.selectedIndex].textContent;

  const rows = table.rows;

  let nextRowIndex = currentRow;
  while (nextRowIndex < rows.length) {
    const processCell = rows[nextRowIndex].querySelector('.process-name');
    if (processCell && processCell.textContent === selectedProcess) {
      const elapsedTime = (parseInt(minute.textContent) * 60 + parseInt(second.textContent)) + (parseInt(ms.textContent) / 100);
      const timeCell = rows[nextRowIndex].querySelector('.time-of-task');
      timeCell.textContent = elapsedTime;
      currentRow = nextRowIndex + 1;
      break;
    }
    nextRowIndex += 1;
  }

  if (nextRowIndex >= rows.length) {
    currentRow = 0;
  }
  start();
}