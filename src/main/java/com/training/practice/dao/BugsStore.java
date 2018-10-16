package com.training.practice.dao;

import com.training.practice.domain.Bug;
import com.training.practice.domain.Status;

import java.util.ArrayList;
import java.util.List;

public class BugsStore {

    private List<Bug> bugs = new ArrayList<>();
    private int count = 0;

    public int add(Bug bug){
        bug.setStatus(Status.BACKLOG);
        bug.setBugId(count++);
        bugs.add(bug);
        return count-1;
    }

    public boolean updateBug(Bug bug, Status status){
        for(Bug aBug : bugs){
            if(aBug.getBugId()==bug.getBugId()){
                aBug.setStatus(status);
                return true;
            }
        }
        return false;
    }

    public List<Bug> getBugs(Status status){
        List<Bug> result = new ArrayList<>();
        for (Bug bug : bugs){
            if(bug.getStatus() == status){
                result.add(bug);
            }
        }
        return result;
    }
}
