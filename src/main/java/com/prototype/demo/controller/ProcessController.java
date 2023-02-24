package com.prototype.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.prototype.demo.model.Process;
import com.prototype.demo.service.ProcessService;


@Controller
public class ProcessController {

    @Autowired
    private ProcessService processService;
    



    @RequestMapping("/process")
    public String home(Model model) {
      model.addAttribute("process");
      return "process";
    }

    @GetMapping("/showAllProcesses")
    public String getAllProcesses(Model model) {
        List<Process> processes = processService.getAllProcesses();
        model.addAttribute("processes", processes);
        return "showAllProcesses";
    }
    

    @GetMapping("/addProcess")
    public String addProcessForm(Model model) {
        model.addAttribute("process", new Process());
        return "addProcess";
    }
  
    @PostMapping("/processes")
    public String addProcess(@ModelAttribute Process process) {
      processService.save(process);
      return "redirect:/showAllProcesses";
    }

    @GetMapping("/deleteProcess/{id}")
    public String deleteProcess(@PathVariable("id") Long id) {
        processService.deleteProcessById(id);
        return "redirect:/showAllProcesses";
    }
    
    
@GetMapping("/editProcess/{id}")
public String showEditProcessForm(@PathVariable("id") Long id, Model model) {
    Process process = processService.getProcessById(id);
    model.addAttribute("process", process);
    return "editProcessForm";
}

@PostMapping("/updateProcess")
public String updateProcess(@ModelAttribute("process") Process process) {
    processService.updateProcess(process);
    return "redirect:/showAllProcesses";
}


}
