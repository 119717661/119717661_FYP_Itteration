  // Selector 
  const select = document.querySelector('#process-select');
  const table = document.querySelector('.table');

  // Add an event listener to the select element
  select.addEventListener('change', () => {
    // Show the table
    table.style.display = '';

    // Get the selected process name
    const selectedProcess = select.options[select.selectedIndex].textContent;

    // Loop through the rows of the table
    for (const row of table.rows) {
      // Get the process name cell of the current row
      const processCell = row.querySelector('.process-name');
      if (processCell) {
        // If the process name of the current row matches the selected process name, show the row
        if (processCell.textContent === selectedProcess) {
          row.style.display = '';
        } else {
          // Otherwise, hide the row
          row.style.display = 'none';
        }
      }
    }
  });