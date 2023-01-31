package com.prototype.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Week {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String weekNumber;

  @OneToMany(mappedBy = "week", cascade = CascadeType.ALL)
  private List<Schedule> schedules;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getWeekNumber() {
    return weekNumber;
}

public void setWeekNumber(String weekNumber) {
    this.weekNumber = weekNumber;
}

public List<Schedule> getSchedules() {
    return schedules;
}

public void setSchedules(List<Schedule> schedules) {
    this.schedules = schedules;
}

 
}
