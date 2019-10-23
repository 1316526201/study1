package com.guigu.springboot1.hellocontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class HelloController{
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map){
        System.out.println(password);
        if("1234".equals(password)){

            return "dashboard";
        }else{
            map.put("msg","用户名密码错误");
            return "index";
        }

    }

//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }


}
