package com.libw.bigdata.dao;

import com.libw.bigdata.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BigdataMapper {
    //景点类型-人数
    @Select("select type,num from typenum")
    public List<TypeNum> selectTypeNum();

    //月份-人数
    @Select("select month,num from monthnum")
    public List<MonthNum> selectMonthNum();

    //省份-花费
    @Select("select province,cost from procost")
    public List<Procost> selectProcost();

    @Select("select id,date,number from movies_date_num")
    public List<MoviesDateNumEntity> selectDateNum();
    //登录
    @Select("select * from  user where user_name = #{user_name} and user_password = #{user_password}")
    public User Login(@Param("user_name")String user_name,@Param("user_password")String user_password);
    //注册
    @Select("insert into user (user_name,user_password,user_email,user_actor) values(#{user_name},#{user_password},#{user_email},#{user_actor})")
    public void Register(@Param("user_name")String user_name,@Param("user_password")String user_password,@Param("user_email")String user_email,@Param("user_actor")String user_actor);
    //找到用户,显示用户
    @Select("select * from  user where user_name = #{user_name}")
    public User finduserbyname(@Param("user_name")String user_name);
    //修改密码
    @Select("update user set user_password = #{user_newpwd} where user_name = #{user_name} and user_password = #{user_password}")
    public void changepwd(@Param("user_name")String user_name,@Param("user_password")String user_password,@Param("user_newpwd")String user_newpwd);
    //修改信息
    //@Select("update user set user_email = #{user_email} where user_name = #{user_name}")
   // public void changepwd(@Param("user_name")String user_name,@Param("user_email")String user_email);

}
