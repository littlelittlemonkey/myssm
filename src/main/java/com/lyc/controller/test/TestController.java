package com.lyc.controller.test;

import com.lyc.model.User;
import com.lyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/test")
public class TestController {

    @Autowired
    private UserService userService;
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        User user = new User();
        user.setName("小明");
        userService.addUser(user);
        return "a:a";
    }
}
