package com.training.practice.dao;

import com.training.practice.domain.Bug;
import com.training.practice.domain.Status;

import java.util.List;

public class BugsDao {

    private BugsStore store = new BugsStore();


    public int addBug(Bug bug){
        return store.add(bug);
    }

    public List<Bug> getBackLogBugs(){
        return store.getBugs(Status.BACKLOG);
    }

    public boolean updateToActive(Bug bug){
        return store.updateBug(bug,Status.ACTIVE);
    }

    public List<Bug> getActiveBugs(){
        return store.getBugs(Status.ACTIVE);
    }
}
