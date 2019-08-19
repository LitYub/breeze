package com.libw.bigdata.service.impl;


import com.libw.bigdata.dao.BigdataMapper;
import com.libw.bigdata.entity.*;
import com.libw.bigdata.service.BigdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BigdataServiceImpl implements BigdataService {

    @Autowired
    private BigdataMapper bigdataMapper;

    public List<TypeNum> queryTypeNum(){
        return bigdataMapper.selectTypeNum();
    }

    public List<MonthNum> queryMonthNum() {
        return bigdataMapper.selectMonthNum();
    }

    @Override
    public List<Procost> queryProcost() {
        return bigdataMapper.selectProcost();
    }

    @Override
    public User Login(String user_name, String user_password) {
        return bigdataMapper.Login(user_name,user_password);
    }

    @Override
    public void Register(String user_name, String user_password, String user_email, String user_actor) {
        bigdataMapper.Register(user_name,user_password,user_email,user_actor);
    }

    @Override
    public User finduserbyname(String user_name) {
        return bigdataMapper.finduserbyname(user_name);
    }

    @Override
    public void changepwd(String user_name, String user_password, String user_newpwd) {
         bigdataMapper.changepwd(user_name,user_password,user_newpwd);
    }
}
