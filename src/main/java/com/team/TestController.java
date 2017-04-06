package com.team;

import com.team.com.team.jpa.User;
import com.team.com.team.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

/**
 * Created by Administrator on 2017/4/5.
 */
@Controller
@EnableAutoConfiguration
public class TestController {

    @Autowired
    UserRepository repository;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello World!!!!";
    }

    public User get(Long id){
        return (User)(StringUtils.isEmpty(id)?repository.findAll():repository.findOne(id));
    }

    public static void main(String[] args){
        SpringApplication.run(TestController.class,args);
    }
}
