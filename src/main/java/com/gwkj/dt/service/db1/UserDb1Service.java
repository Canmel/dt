package com.gwkj.dt.service.db1;

import com.gwkj.dt.mapper.db1.Db1UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserDb1Service {
    @Autowired
    private Db1UserMapper db1UserMapper;

    public List<Map> start(){
        return db1UserMapper.all();
    }
}
