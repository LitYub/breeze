package com.libw.bigdata.service;

import com.libw.bigdata.entity.*;

import java.util.List;

public interface BigdataService {

    public List<TypeNum> queryTypeNum();

    public List<MonthNum> queryMonthNum();

    public List<Procost> queryProcost();

    public User Login(String user_name,String user_password);

    public void Register(String user_name,String user_password,String user_email,String user_actor);

    public User finduserbyname(String user_name);

    public void changepwd(String user_name,String user_password,String user_newpwd);

}
