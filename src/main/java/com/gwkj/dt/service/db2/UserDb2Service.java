package com.gwkj.dt.service.db2;

import com.gwkj.dt.mapper.db2.Db2UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserDb2Service {
    @Autowired
    private Db2UserMapper db2UserMapper;

    public List<Map> start(){
        return db2UserMapper.all();
    }
}
