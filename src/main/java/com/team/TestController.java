package com.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

/**
 * Created by Administrator on 2017/4/5.
 */
@Controller
@EnableAutoConfiguration
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!!!!";
    }
    public static void main(String[] args){
        SpringApplication.run(TestController.class,args);
    }
}
