package com.lyc.service.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     * @param msg 消息内容
     * @param routingKey 路由关键字
     * void
     */
    public void setMessage(String msg, String routingKey) {
        rabbitTemplate.convertAndSend(routingKey, msg);
//        log.info("rabbitmq--发送消息完成: routingKey[{}]-msg[{}]", routingKey, msg);
        System.out.println("rabbitmq--发送消息完成: routingKey:"+routingKey+" msg:"+msg);
    }
}
