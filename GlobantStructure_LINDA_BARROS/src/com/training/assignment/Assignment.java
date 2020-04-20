package com.training.assignment;

import com.training.globant.administration.Glober;

import java.util.List;

public interface Assignment {

    public Glober getDirectBoos();
    public int getSeniority();
    public String getSeniorityResponsibility();
    public void setDirectBoss(Glober directBoss);
    public void setSeniority(int seniority);
    public void setSeniorityResponsibility(String responsibility);
}
