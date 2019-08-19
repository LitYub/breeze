package com.libw.bigdata.controller;

import com.libw.bigdata.entity.*;
import com.libw.bigdata.service.BigdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes("user")
@RequestMapping("/breeze")
public class BigdataController {

    @Autowired
    private BigdataService bigdataService;
    /**
     * 跳转
     * 登录
     */
    @RequestMapping("loginhtml")
    public String loginhtml(){
        return "login";
    }
    //修改密码
    @RequestMapping("changehtml")
    public String changehtml(){
        return "changePwd";
    }
    /**
     * 跳转到用户注册页面
     * @return 注册页面
     */
    @RequestMapping("registerhtml")
    public String registerhtml(){
        return "Register";
    }

    /**
     * 跳转到欢迎界面
     * @return
     */
    @RequestMapping("welcomehtml")
    public String welcomehtml(){return "welcome";}

    /**
     * 个人信息
     * @return
     */
    @RequestMapping("userinfohtml")
    public String userinfohtml(){return "userInfo";}

    /**
     * 省份人数
     * @return
     */
    @RequestMapping("chart1html")
    public String chart1html(){return "Highcharts1";}

    /**
     * 省份消费
     * @return
     */
    @RequestMapping("chart2html")
    public String chart2html(){return "Highcharts2";}

    /**
     * 个人信息
     * @return
     */
    @RequestMapping("chart3html")
    public String chart3html(){return "Highcharts3";}

    /**
     * 个人信息
     * @return
     */
    @RequestMapping("chart4html")
    public String chasrt4html(){return "Highcharts4";}

    /**
     * 个人信息
     * @return
     */
    @RequestMapping("chart5html")
    public String chart5html(){return "Highcharts5";}




    /**
     * 个人信息
     * @return
     */
    @RequestMapping("chart6html")
    public String chart6html(){return "xinjiabi";}


    @RequestMapping("typeNum")
    @ResponseBody
    public Object queryTypeNumList(){
        List<TypeNum> list = bigdataService.queryTypeNum();
        return list;
    }

    @RequestMapping("monthNum")
    @ResponseBody
    public Object queryMonthNum(){
        List<MonthNum> list = bigdataService.queryMonthNum();
        return list;
    }

    @RequestMapping("procost")
    @ResponseBody
    public Object queryProcost(){
        List<Procost> list = bigdataService.queryProcost();
        return list;
    }

    @RequestMapping("login")
    public Object Login(ModelMap map,HttpSession session, HttpServletRequest request){
        String user_name = request.getParameter("username");
        String user_password = request.getParameter("password");
        User user = bigdataService.Login(user_name,user_password);
        if(user == null){
            //map.addAttribute("user_name", );
            map.addAttribute("user", user);
            return "home";
        }else{
            map.addAttribute("user", user);
            return "home";
        }
    }
    @RequestMapping("register")
    @ResponseBody
    public Object Register(HttpServletRequest request){
        String user_name = request.getParameter("username");
        String user_password = request.getParameter("password");
        String user_email = request.getParameter("email");
        String user_actor = request.getParameter("actor");
        User user = bigdataService.finduserbyname(user_name);
        if(user != null){
            return "/index";
        }else{
            bigdataService.Register(user_name, user_password, user_email, user_actor);
            return "/index";
        }


    }
    @RequestMapping("changepwd")
    @ResponseBody
    public Object Changepwd(HttpServletRequest request){
        String user_name = request.getParameter("username");
        String user_password = request.getParameter("password");
        String user_newpwd = request.getParameter("newpwd");
        bigdataService.changepwd(user_name,user_password,user_newpwd);
        return "";
    }

}
