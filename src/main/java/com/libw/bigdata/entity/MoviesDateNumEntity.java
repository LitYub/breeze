package com.libw.bigdata.entity;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:4.1.2
 */

/**
 * (MOVIES_DATE_NUM)
 * 
 * @author bianj
 * @version 1.0.0 2019-08-07
 */
public class MoviesDateNumEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4006187048451756491L;
    
    /**  */
    private Integer id;
    
    /**  */
    private String date;
    
    /**  */
    private Integer number;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getDate() {
        return this.date;
    }
     
    /**
     * 设置
     * 
     * @param date
     *          
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getNumber() {
        return this.number;
    }
     
    /**
     * 设置
     * 
     * @param number
     *          
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}