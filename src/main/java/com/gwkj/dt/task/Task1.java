package com.gwkj.dt.task;


import com.gwkj.dt.service.UsersDataTransformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task1 {

    @Autowired
    private UsersDataTransformService usersDataTransformService;

    @Scheduled(cron = "0/5 * * * * ?")
    public void timerToNow(){
        System.out.println("----------------->");
        usersDataTransformService.update();
    }
}
