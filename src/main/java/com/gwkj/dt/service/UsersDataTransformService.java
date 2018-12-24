package com.gwkj.dt.service;

import com.gwkj.dt.service.db1.UserDb1Service;
import com.gwkj.dt.service.db2.UserDb2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UsersDataTransformService {

    @Autowired
    private UserDb1Service userDb1Service;

    @Autowired
    private UserDb2Service userDb2Service;

    public boolean update(){
        System.out.println(userDb1Service.start());;
        System.out.println(userDb2Service.start());;
        return true;
    }
}
