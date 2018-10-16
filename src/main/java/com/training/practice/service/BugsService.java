package com.training.practice.service;

import com.training.practice.dao.BugsDao;
import com.training.practice.domain.Bug;

import java.util.List;

public class BugsService {

    BugsDao dao = new BugsDao();

    public int addBug(Bug bug){
        return dao.addBug(bug);

    }

    public List<Bug> getBacklogBugs(){
        return dao.getBackLogBugs();
    }

    public boolean updateToActive(Bug bug){
        return dao.updateToActive(bug);
    }

    public List<Bug> getActiveBugs(){
        return dao.getActiveBugs();
    }

}
