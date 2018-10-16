package com.training.practice.controller;

import com.training.practice.service.BugsService;
import com.training.practice.domain.Bug;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BugsController {


    private BugsService service =new BugsService();

    @RequestMapping("/bugs/backlog")
    public List<Bug> getBacklogBugs() {
        return service.getBacklogBugs();
    }

    @RequestMapping(value = "/bugs/backlog", method = RequestMethod.POST)
    public int addBugToBackLog(Bug bug) {
        return service.addBug(bug);
    }

    @RequestMapping(value = "/bugs/active", method = RequestMethod.POST)
    public boolean updateToActive(Bug bug) {
        return service.updateToActive(bug);
    }

    @RequestMapping("/bugs/active")
    public List<Bug> getActiveBugs() {
        return service.getActiveBugs();
    }

}
