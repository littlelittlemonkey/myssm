package com.lyc.controller.test;

import com.lyc.common.JsonDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class Test2Controller {

    @RequestMapping("/test1")
    @ResponseBody
    public JsonDate test1(){
        return new JsonDate(true,"ok");
    }
}
