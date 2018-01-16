package com.lyc.controller.rabbitmq;

import com.lyc.common.JsonDate;
import com.lyc.service.rabbitmq.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rabbitmq")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @RequestMapping(value = "/setMessage")
    @ResponseBody
    public JsonDate setMessage(String msg, String type) {
//        log.info("rabbitmq--收到待发送消息: type[{}]-msg[{}]", type, msg);
        System.out.println("rabbitmq--收到待发送消息: type: "+type+" msg: "+msg);
        producerService.setMessage(msg, type);
        return new JsonDate(true,"success");
    }
}
