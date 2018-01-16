package com.lyc.listener.rabbitmq;

public class QueueListener1 {

    public void onMessage(String message) {
        System.out.println("QueueListener1 received "+message);
    }
}
