package com.prototype.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GembaList {

    @Id
    @Column(name="listID", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gembaListid;
  
    private String listNumber;
  
    @OneToMany(mappedBy = "gembaList", cascade = CascadeType.ALL)
    private List<Gemba> gembas;

   
    public String getListNumber() {
        return listNumber;
    }

    public void setListNumber(String listNumber) {
        this.listNumber = listNumber;
    }

    public List<Gemba> getGembas() {
        return gembas;
    }

    public void setGembas(List<Gemba> gembas) {
        this.gembas = gembas;
    }

    public Long getGembaListid() {
        return gembaListid;
    }

    public void setGembaListid(Long gembaListid) {
        this.gembaListid = gembaListid;
    }

}
