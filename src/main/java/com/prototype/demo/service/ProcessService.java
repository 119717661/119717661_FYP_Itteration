package com.prototype.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prototype.demo.model.Process;
import com.prototype.demo.model.Task;
import com.prototype.demo.dao.ProcessRepo;
import com.prototype.demo.dao.TaskRepo;

@Service
public class ProcessService {

    @Autowired
    private ProcessRepo processRepository;

    @Autowired
    private TaskRepo taskRepository;

    public ProcessRepo getProcessRepository() {
        return processRepository;
    }

    public void setProcessRepository(ProcessRepo processRepository) {
        this.processRepository = processRepository;
    }

    public List<Process> getAllProcesses() {
        return processRepository.findAll();
    }

    
    public Process save(Process process) {
        return processRepository.save(process);
      }

      public Process getProcessById(Long procID) {
        return processRepository.findById(procID).orElse(null);
    }
    
    public void deleteProcessById(Long id) {
        Process process = processRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid process Id:" + id));
        for (Task task : process.getTasks()) {
            taskRepository.deleteById(task.getTaskid());
        }
        processRepository.delete(process);
    }
    
    public void updateProcess(Process process) {
        Process existingProcess = processRepository.findById(process.getProcID())
                .orElseThrow(() -> new IllegalArgumentException("Invalid process ID:" + process.getProcID()));
        existingProcess.setProcName(process.getProcName());
        processRepository.save(existingProcess);
    }
    
    
}
