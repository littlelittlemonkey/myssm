package com.lyc.controller.test;

import com.lyc.common.JsonDate;
import com.lyc.model.User;
import com.lyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping(value="/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test1",produces = "application/json")
    @ResponseBody
    public JsonDate test1(HttpServletRequest request){
        String accept = request.getHeader("accept");
        System.out.println(accept);
        return new JsonDate(true,"ok");
    }

    @RequestMapping(value = "/test2",produces = "application/xml")
    @ResponseBody
    public JsonDate test2(HttpServletRequest request){
        String accept = request.getHeader("accept");
        System.out.println(accept);
        return new JsonDate(true,"ok");
    }

    @RequestMapping(value = "/test3")
    @ResponseBody
    public JsonDate test3(HttpServletRequest request, HttpServletResponse response){
        String accept = request.getHeader("accept");
        System.out.println(accept);
        response.setHeader("accept",accept);
        return new JsonDate(true,"ok");
    }

    //访问路径为：http://localhost/user/123
    @RequestMapping(value="/user/{userid}")
    @ResponseBody
    public JsonDate test4(@PathVariable(value = "userid",required = false)Integer userId){
        System.out.println("userId:"+userId);
        return new JsonDate(true,"ok");
    }

    @RequestMapping(value="/test5")
    @ResponseBody
    public JsonDate test5(@RequestParam(name = "userid",defaultValue = "1",required = false)Integer userId){
        System.out.println("userId:"+userId);
        return new JsonDate(true,"ok");
    }
}
