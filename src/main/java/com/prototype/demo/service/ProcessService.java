package com.prototype.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prototype.demo.model.Process;
import com.prototype.demo.dao.ProcessRepo;

@Service
public class ProcessService {

    @Autowired
    private ProcessRepo processRepository;

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
    
}
