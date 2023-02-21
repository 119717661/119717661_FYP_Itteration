package com.prototype.demo.controller;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prototype.demo.dao.GembaListRepo;
import com.prototype.demo.dao.GembaRepo;
import com.prototype.demo.model.Gemba;
import com.prototype.demo.model.GembaList;
import com.prototype.demo.service.GembaService;
import com.prototype.demo.service.ProcessService;
import com.prototype.demo.service.TaskService;

@Controller
public class GembaController {

    @Autowired
    ProcessService processService;
    @Autowired
    TaskService taskService;
    @Autowired
    GembaService gembaService;
    @Autowired
    GembaRepo gembaRepository;
@Autowired
GembaListRepo gembaListRepository;
    

    @RequestMapping("/gemba")
    public String home(Model model) {
        model.addAttribute("gemba", new Gemba());
        return "gemba";
    }

    @GetMapping("/gemba")
    public String gemba(Model model) {
        model.addAttribute("processes", processService.getAllProcesses());
        model.addAttribute("tasks", taskService.getAllTasks());
        return "gemba";
    }

    @RequestMapping("/viewGemba")
    public String viewGemba(Model model) {
        model.addAttribute("gemba", new Gemba());
        return "viewGemba";
    }

//Take a look at this PostMapping method below, it saves the weekNumber but it does not save the information from the table form 
//Provide fix for this method knowing it needs take information from gemba.html form :
/*<form th:action="@{/saveGembaData}" th:method="post">
  <input type="text" class="form-control" id="weekNumber" name="weekNumber" required>
  <table id="taskTable" class="table table-striped" style="display: none">
    <tr>
      <th>Task ID</th>
      <th>Task Name</th>
      <th>Process Name</th>
      <th>Time of Task</th>
      <th>Date</th>
    </tr>
    <tr th:each="task : ${tasks}">
      <td th:text="${task.taskid}"></td>
      <td th:text="${task.taskname}"></td>
      <td th:text="${task.process.procName}" class="process-name"></td>
      <td class="time-of-task" id="time-of-task-{{task.taskid}}"></td>
      <td class="todayday" th:text="${date}"></td>
    </tr>
    
  </table>
  <div class="form-group">
      <button type="submit" id="submitformbutton" class="btn btn-primary">Save Times of Task for This Process</button>
  </div>
  </form>
 */
    @PostMapping("/saveGembaData")
    public String saveSchedule(@RequestParam("weekNumber") String weekNumber,
     ServletRequest request) {
        
    GembaList gembaList = new GembaList();
    gembaList.setListNumber(weekNumber);
    gembaListRepository.save(gembaList);
   
       return "redirect:/viewGemba";
    }

    public void tabledataSave(@RequestParam("taskID") String taskID,
            @RequestParam("employee") String employee,
            @RequestParam("processName") String processName,
            @RequestParam("timeOfTask") String timeOfTask) {
   
        Gemba gemba = new Gemba();
        gemba = new Gemba();
        gemba.setTaskID(taskID);
        gemba.setTaskname(employee);
        gemba.setProcessName(processName);
        gemba.setTimeOfTask(timeOfTask);
        gembaRepository.save(gemba);
    }
    
}